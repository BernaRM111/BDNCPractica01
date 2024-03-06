/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.uv.bdncpractica01correccion;

/**
 *
 * @author Berna
 */
public class BDNCPractica01Correccion {

    public static void main(String[] args) {
//        DAODepartamento daoD =  new DAODepartamento();
//        Departamento departamento = new Departamento();
//        departamento.setNombre("gestion");
//        
//        boolean res = daoD.save(departamento);
//        if(res)
//            System.out.println("se guardo");
        
        DAOEmpleado daoE = new DAOEmpleado();
        Empleado empleado = new Empleado();
        empleado.setNombre("Berna");
        empleado.setDireccion("Av.22");
        empleado.setTelefono("229932");
        empleado.setDepartamento(2);
        
        boolean res = daoE.save(empleado);
        if (res)
            System.out.println("se guardo");
    }
}
