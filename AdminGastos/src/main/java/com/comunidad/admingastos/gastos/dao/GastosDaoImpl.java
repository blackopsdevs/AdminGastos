/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comunidad.admingastos.gastos.dao;

import com.comunidad.admingastos.gastos.dao.vo.GastosVo;
import com.comunidad.admingastos.utilidades.Fechas;
import com.comunidad.admingastos.utilidades.jdbc.CerrarSentencias;
import com.comunidad.admingastos.utilidades.jdbc.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Santiago
 */
public class GastosDaoImpl extends CerrarSentencias implements GastosDao {

    @Override
    public int guardar(GastosVo gastosVo) throws Exception {
        Connection conexion = ConexionBD.getInstance().getConection();
        int index = 1;
        PreparedStatement stm = null;
        int retorno = 0;
        try {
            stm = conexion.prepareStatement(QuerysSql.INSERT_GASTO);
            stm.setInt(index++, gastosVo.getId());
            stm.setTimestamp(index++, Fechas.dateUtilsToSqlTimestamp(gastosVo.getFecha()));
            stm.setInt(index++, gastosVo.getCantidad());
            stm.setString(index++, gastosVo.getDescProd());
            stm.setDouble(index++, gastosVo.getTotal());
            stm.setInt(index++, gastosVo.getEstatus());
            stm.setTimestamp(index++, Fechas.dateUtilsToSqlTimestamp(gastosVo.getFechaalta()));
            stm.setTimestamp(index++, Fechas.dateUtilsToSqlTimestamp(gastosVo.getFechaUltimaAct()));
            retorno = stm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            ConexionBD.getInstance().closeConnection(conexion);
        }
        return retorno;
    }

    @Override
    public int actualizar(GastosVo gastosVo) throws Exception {
        Connection conexion = ConexionBD.getInstance().getConection();
        int index = 1;
        PreparedStatement stm = null;
        int retorno = 0;
        try {
            stm = conexion.prepareStatement(QuerysSql.UPDATE_GASTO);
            stm.setDate(index++, Fechas.dateUtilsToSql(gastosVo.getFecha()));
            stm.setInt(index++, gastosVo.getCantidad());
            stm.setString(index++, gastosVo.getDescProd());
            stm.setDouble(index++, gastosVo.getTotal());
            stm.setInt(index++, gastosVo.getEstatus());
            stm.setDate(index++, Fechas.dateUtilsToSql(gastosVo.getFechaalta()));
            stm.setDate(index++, Fechas.dateUtilsToSql(gastosVo.getFechaUltimaAct()));
            stm.setInt(index++, gastosVo.getId());
            retorno = stm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            ConexionBD.getInstance().closeConnection(conexion);
        }
        return retorno;
    }

    @Override
    public int existe(GastosVo gastosVo) throws Exception {
        return 0;
    }

    @Override
    public GastosVo gasto(GastosVo gastosVo) throws Exception {
        return null;
    }

    @Override
    public List<GastosVo> gastos() throws Exception {
        Connection conexion = ConexionBD.getInstance().getConection();
        PreparedStatement stm = null;
        ResultSet rs = null;
        List<GastosVo> listGastosRs = null;
        try {
            stm = conexion.prepareStatement(QuerysSql.SELECT_GASTO);
            rs = stm.executeQuery();
            listGastosRs = getListGastosResultSet(rs);
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            ConexionBD.getInstance().closeConnection(conexion);
        }
        return listGastosRs;
    }

    private List<GastosVo> getListGastosResultSet(ResultSet res) throws SQLException {
        List<GastosVo> listGastos = null;
        if (res.next()) {
            listGastos = new ArrayList<GastosVo>();
            do {
                GastosVo gastosVo = new GastosVo();
                gastosVo.setId(res.getInt("ID"));
                gastosVo.setFecha(res.getDate("FECHA"));
                gastosVo.setCantidad(res.getInt("CANTIDAD"));
                gastosVo.setDescProd(res.getString("DESC_PROD"));
                gastosVo.setTotal(res.getDouble("TOTAL"));
                gastosVo.setEstatus(res.getInt("ESTATUS"));
                gastosVo.setFechaalta(res.getDate("FECHA_ALTA"));
                gastosVo.setFechaUltimaAct(res.getDate("FECHA_ULT_ACT"));
                listGastos.add(gastosVo);
            } while (res.next());
        }
        return listGastos;
    }
}
