/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comunidad.admingastos.gastos.dao;

/**
 *
 * @author Santiago
 */
public class QuerysSql {
    public static final String INSERT_GASTO;
    public static final String UPDATE_GASTO;
    public static final String SELECT_GASTO;
        
    static {
        StringBuilder sqlInsert = new StringBuilder();
        sqlInsert.append(" INSERT INTO GASTOS (ID, FECHA, CANTIDAD, DESC_PROD, TOTAL, ESTATUS, FECHA_ALTA, FECHA_ULT_ACT) VALUES (?,?,?,?,?,?,?,?) ");
        INSERT_GASTO = sqlInsert.toString();
        
        StringBuilder sqlUpdate = new StringBuilder();
        sqlUpdate.append(" UPDATE GASTOS SET FECHA=?, CANTIDAD=?, DESC_PROD=?, TOTAL=?, ESTATUS=?, FECHA_ALTA=?, FECHA_ULT_ACT=? WHERE ID=? ");
        UPDATE_GASTO = sqlUpdate.toString();
        
        StringBuilder sqlSelect = new StringBuilder();
        sqlSelect.append(" SELECT ID, FECHA, CANTIDAD, DESC_PROD, TOTAL, ESTATUS, FECHA_ALTA, FECHA_ULT_ACT FROM GASTOS ");
        SELECT_GASTO = sqlSelect.toString();
    }
}
