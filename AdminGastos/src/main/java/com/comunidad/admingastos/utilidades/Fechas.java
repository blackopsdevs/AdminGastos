/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comunidad.admingastos.utilidades;

import java.util.Date;

/**
 *
 * @author Santiago
 */
public class Fechas {

    public static java.sql.Date dateUtilsToSql(Date fecha) {
        return new java.sql.Date(fecha.getTime());
    }

    public static java.sql.Timestamp dateUtilsToSqlTimestamp(Date fecha) {
        return new java.sql.Timestamp(fecha.getTime());
    }
}
