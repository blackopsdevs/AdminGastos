/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comunidad.admingastos.gastos.controller;

import com.comunidad.admingastos.gastos.dao.vo.GastosVo;
import com.comunidad.admingastos.gastos.service.GastosService;
import com.comunidad.admingastos.gastos.service.GastosServiceImpl;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Santiago
 */
public class GastosControllerImpl implements GastosController {

    private GastosService gastosService = new GastosServiceImpl();
    
    @Override
    public int guardar(GastosVo gastosVo) throws Exception {
        return gastosService.guardar(gastosVo);
    }

    @Override
    public int actualizar(GastosVo gastosVo) throws Exception {
        return gastosService.actualizar(gastosVo);
    }

    @Override
    public List<GastosVo> gastos() throws Exception {
        return gastosService.gastos();
    }
    
}
