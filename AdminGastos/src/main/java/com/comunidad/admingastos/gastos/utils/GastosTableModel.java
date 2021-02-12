/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comunidad.admingastos.gastos.utils;

import com.comunidad.admingastos.gastos.controller.GastosController;
import com.comunidad.admingastos.gastos.controller.GastosControllerImpl;
import com.comunidad.admingastos.gastos.dao.vo.GastosVo;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Santiago
 */
public class GastosTableModel extends AbstractTableModel{

    private GastosVo gastosVo;
    private GastosController gastosController;
    
    private String[] columnNames =
    {
        "ID", "FECHA", "CANTIDAD", "DESC_PROD", "TOTAL", "ESTATUS", "FECHA_ALTA", "FECHA_ULT_AC"
    };
    
    private List<GastosVo> listGastosVo;

    public GastosTableModel() throws Exception {
        gastosController = new GastosControllerImpl();
        listGastosVo = gastosController.gastos();
    }
 
    public GastosTableModel(List<GastosVo> listGastosVo) {
        this.listGastosVo = listGastosVo;
    }

    @Override
    public int getRowCount() {
        return listGastosVo.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public boolean isCellEditable(int row, int col) {
        return false; 
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        GastosVo getGastosVo = getGastosVo(rowIndex);
        switch (columnIndex) {
            case 0: return getGastosVo.getId();
            case 1: return getGastosVo.getFecha();
            case 2: return getGastosVo.getCantidad();
            case 3: return getGastosVo.getDescProd();
            case 4: return getGastosVo.getTotal();
            case 5: return getGastosVo.getEstatus();
            case 6: return getGastosVo.getFechaalta();
            case 7: return getGastosVo.getFechaUltimaAct();
            default: return null;
        }
    }
    
    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
    
    public GastosVo getGastosVo(int row) {
        return listGastosVo.get(row);
    }
    
    public void addGastosVo(GastosVo gastosVo) {
        insertGastosVo(getRowCount(), gastosVo);
    }
 
    public void insertGastosVo(int row, GastosVo gastosVo) {
        listGastosVo.add(row, gastosVo);
        fireTableRowsInserted(row, row);
    }
}
