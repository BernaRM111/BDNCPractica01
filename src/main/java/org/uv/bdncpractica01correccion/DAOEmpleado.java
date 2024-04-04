/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.bdncpractica01correccion;

import java.util.List;

/**
 *
 * @author Berna
 */
public class DAOEmpleado implements IDAOGeneral<Empleado> {

    @Override
    public boolean save(Empleado p) {
        ConexionDB con = ConexionDB.getInstance();
        String sql = "insert into empleados (nombre, direccion, telefono, departamento)"
                + " values('"+p.getNombre() + "','" + p.getDireccion() + "', '" + 
                p.getTelefono() + "','" + p.getDepartamento() + "')";
        boolean res = con.execute(sql);
        return res;
    }

    @Override
    public boolean edit(Empleado p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(Empleado p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Empleado findById(long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Empleado> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
