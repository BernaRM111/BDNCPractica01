/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.bdncpractica01correccion;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Berna
 */
public abstract class ProductoTableModel<T> extends AbstractTableModel{
    protected String [] columnNames = {"Clave","Descripcion","Precio Venta","Precio Compra"};
    protected List<T> lstValores;

    public ProductoTableModel(String[] columnNames, List<T> lstValores) {
        this.lstValores = lstValores;
        this.columnNames= columnNames;
    }
    

    @Override
    public int getRowCount() {
        return lstValores.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

//    @Override
//    public Object getValueAt(int rowIndex, int columnIndex) {
////        return lstProducto.get(rowIndex).getId();
//        switch (columnIndex) {
//            case 0: return lstProducto.get(rowIndex).getId();
//            case 1: return lstProducto.get(rowIndex).getDescripcion();
//            default:return null;
//        }
//    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
    
    
}
