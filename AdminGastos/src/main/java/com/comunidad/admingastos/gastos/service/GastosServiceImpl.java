/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comunidad.admingastos.gastos.service;

import com.comunidad.admingastos.gastos.dao.GastosDao;
import com.comunidad.admingastos.gastos.dao.GastosDaoImpl;
import com.comunidad.admingastos.gastos.dao.vo.GastosVo;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Santiago
 */
public class GastosServiceImpl implements GastosService {

    private GastosDao gastosDao = new GastosDaoImpl();
    
    @Override
    public int guardar(GastosVo gastosVo) throws Exception {
        return gastosDao.guardar(gastosVo);
    }

    @Override
    public int actualizar(GastosVo gastosVo) throws Exception {
        return gastosDao.actualizar(gastosVo);
    }

    @Override
    public List<GastosVo> gastos() throws Exception {
        return gastosDao.gastos();
    }
    
}
