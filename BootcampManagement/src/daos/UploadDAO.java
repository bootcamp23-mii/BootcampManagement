/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import models.UploadDB;
import tools.BCrypt;

/**
 *
 * @author FES
 */
public class UploadDAO {
    private Connection connection;

    public UploadDAO(Connection connection) {
        this.connection = connection;
    }

    public List<UploadDB> getData(Object keyword) {
        List<UploadDB> uploadList = new ArrayList<UploadDB>();
        String query = "SELECT * FROM upload WHERE id= " + keyword;

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                uploadList.add(new UploadDB(resultSet.getString(1), resultSet.getBlob(2).getBinaryStream()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return uploadList;
    }

    public boolean upload(UploadDB d) {
        boolean result = false;
        String query = "INSERT INTO UPLOAD (ID,PHOTO) VALUES(?,?)";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, d.getId());
            preparedStatement.setBlob(2, d.getPhoto());
            preparedStatement.executeQuery();
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    public boolean replace(UploadDB d) {
        boolean result = false;
        String query = "UPDATE UPLOAD SET PHOTO = ? WHERE ID = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, d.getId());
            preparedStatement.setBlob(2, d.getPhoto());
            preparedStatement.executeQuery();
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

//    public boolean delete(int id) {
//        boolean isDelete = false;
//        String query = "DELETE FROM DEPARTMENTS WHERE DEPARTMENT_ID ='" + id + "'";
//        try {
//            PreparedStatement preparedStatement = connection.prepareStatement(query);
//            preparedStatement.executeQuery();
//            isDelete = true;
//        } catch (Exception e) {
//            e.getStackTrace();
//        }
//        return isDelete;
//    }

}
