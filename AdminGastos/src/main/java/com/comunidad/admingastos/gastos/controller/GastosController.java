/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comunidad.admingastos.gastos.controller;

import com.comunidad.admingastos.gastos.dao.vo.GastosVo;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Santiago
 */
public interface GastosController {
    int guardar(GastosVo gastosVo) throws Exception;
    int actualizar(GastosVo gastosVo) throws Exception;
    List<GastosVo> gastos() throws Exception;
}
