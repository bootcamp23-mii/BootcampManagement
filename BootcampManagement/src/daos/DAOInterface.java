/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.util.List;

/**
 *
 * @author Pandu
 */
public interface DAOInterface<T> {
    public boolean saveOrDelete(T entity, boolean isSave);
    public List<T> getData(Object keyword);
    public List<T> getDataWD(Object keyword, int isDeleted);
    public T getById(Object id);
    public List<T> login(Object id);
}
