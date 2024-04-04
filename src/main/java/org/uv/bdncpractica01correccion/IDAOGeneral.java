/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.uv.bdncpractica01correccion;

import java.util.List;

/**
 *
 * @author Berna
 */
public interface IDAOGeneral <T>{
    public boolean save (T p);
    public boolean edit (T p);
    public boolean delete (T p);
//    public boolean delete (int id);
    public T findById(long id);
    public List<T> findAll();
    
}
