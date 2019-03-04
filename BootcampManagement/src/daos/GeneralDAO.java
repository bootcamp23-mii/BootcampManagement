/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author FES
 */
public class GeneralDAO<T> implements DAOInterface<T>{

    private SessionFactory factory;
    private Session session;
    private Transaction transaction;
    private T t;

    public GeneralDAO(SessionFactory factory, Class<T> t) {
        try {
            this.factory = factory;
            this.t = t.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public GeneralDAO() {

    }

    private String getQuery(String keyword) {
        String query = "From " + t.getClass().getSimpleName();
        if (!keyword.equals("")) {
            query += " where ";
            for (Field field : t.getClass().getDeclaredFields()) {
                if (!field.getName().contains("UID") && !field.getName().contains("List")) {
                    query += field.getName() + " like '%" + keyword + "%' OR ";
                }
            }
            query = query.substring(0, query.lastIndexOf("OR"));
        }
        return query + " order by 1";
    }

    @Override
    public List<T> getData(Object keyword) {
        List<T> obj = new ArrayList<>();
        session = this.factory.openSession();
        transaction = session.beginTransaction();
        try {
            obj = session.createQuery(getQuery(keyword + "")).list();
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        }
        return obj;
    }

    @Override
    public T getById(Object id) {
        T obj=null;
        session = this.factory.openSession();
        transaction = session.beginTransaction();
        try {
            obj = (T) session.createQuery("FROM " + t.getClass().getSimpleName() + " WHERE id = '" + id + "'").uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        }
        return obj;
    }

    @Override
    public boolean saveOrDelete(T entity, boolean isSave) {
        boolean result = false;
        session = this.factory.openSession();
        transaction = session.beginTransaction();
        try {
            if (isSave) {
                session.saveOrUpdate(entity);
            } else {
                session.delete(entity);
            }
            transaction.commit();
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            session.close();
        }
        return result;
    }

}
