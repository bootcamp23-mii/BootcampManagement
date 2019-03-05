/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.List;
import models.*;

/**
 *
 * @author Pandu
 */
public interface CertificateControllerInterface {
    public Certificate getByid(String id);
    public List<Certificate> getAll();
    public List<Certificate> search(Object keyword);
    public String save(String id, String name);
    public String delete(String id, String name);
}
