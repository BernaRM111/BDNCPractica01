/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.bdncpractica01correccion;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Berna
 */
public class DAOProductos implements IDAOGeneral<Producto> {

    @Override
    public boolean save(Producto p) {
        Session session  = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction t = session.beginTransaction();
        session.save(p);
        t.commit();
        return true;
    }

    @Override
    public boolean edit(Producto p) {
        try (Session session = HibernateUtil.getSessionFactory().getCurrentSession()) {
            session.beginTransaction();
            session.update(p);
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(Producto p) {
//        SessionFactory sf = HibernateUtil.getSessionFactory();
//        Session session = sf.getCurrentSession();
        Session session  = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tran = session.beginTransaction();
        session.delete(p);

        tran.commit();
        return true;
    }

    @Override
    public Producto findById(long id) {
        try (Session session = HibernateUtil.getSessionFactory().getCurrentSession()) {
            session.beginTransaction();
            Producto prod = session.get(Producto.class, id);
            session.getTransaction().commit();
            return prod;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Producto> findAll() {
        Session session  = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction t = session.beginTransaction();
        List<Producto> lstProducto = session.createQuery("from Producto", Producto.class).list();
        t.commit();
        return lstProducto;
    }

//    @Override
//    public boolean save(Producto p) {
//        ConexionDB con = ConexionDB.getInstance();
//        String sql = "insert into producto (idproducto, descripcion, precio, costo)"
//                + "values ('" + p.getId() + "', '" + p.getDescripcion() + "','"
//                + p.getPrecioVenta() + "', '" + p.getPrecioCompra() + "')";
//        boolean res = con.execute(sql);
//        return res;
//    }
//
//    @Override
//    public boolean edit(Producto p) {
//        ConexionDB con = ConexionDB.getInstance();
//        String sql = "update producto set descripcion='" + p.getDescripcion() + "',"
//                + "precio='" + p.getPrecioVenta() + "', costo='" + p.getPrecioCompra() + "' "
//                + "where idproducto='" + p.getId() + "'";
//        boolean res = con.execute(sql);
//        return res;
//    }
//
//    @Override
//    public boolean delete(int id) {
//        ConexionDB con = ConexionDB.getInstance();
//        String sql = "delete from producto where idproducto='" + id + "'";
//        boolean res = con.execute(sql);
//        return res;
//    }
//
//    @Override
//    public Producto findById(int id) {
//        ConexionDB con = ConexionDB.getInstance();
//        String sql = "select * from producto where idproducto='" + id + "'";
//        ResultSet rs = con.executeQuery(sql);
//        Producto p = new Producto();
//        try {
//            if (rs.next()) {
//                p.setId(rs.getLong("idproducto"));
//                p.setDescripcion(rs.getString("descripcion"));
//                p.setPrecioVenta(rs.getDouble("precio"));
//                p.setPrecioCompra(rs.getDouble("costo"));
//            }
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//        return p;
//    }
//
//    @Override
//    public List<Producto> findAll() {
//        ConexionDB con = ConexionDB.getInstance();
//        String sql = "select * from producto";
//        ResultSet rs = con.executeQuery(sql);
//        List<Producto> productos = new ArrayList<>();
//        try {
//            while (rs.next()) {
//                Producto p = new Producto();
//                p.setId(rs.getLong("idproducto"));
//                p.setDescripcion(rs.getString("descripcion"));
//                p.setPrecioVenta(rs.getDouble("precio"));
//                p.setPrecioCompra(rs.getDouble("costo"));
//                productos.add(p);
//            }
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//        return productos;
//
//    }

}
