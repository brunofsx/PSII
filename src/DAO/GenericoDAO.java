/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;

/**
 *
 * @author bruno
 */
public interface GenericoDAO<T> {
   
    public List<T> select();
    public boolean insert(T t);
    public boolean delete(T t);
    public boolean update(T t);
    
    
}
