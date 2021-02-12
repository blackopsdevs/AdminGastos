/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comunidad.admingastos.utilidades.vo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Santiago
 */
public class DatosFormatos {

    public static boolean validaDecimal(String id) {
        System.out.println(id);
        boolean valido = true;
        System.out.println(valido);
        Pattern pc = Pattern.compile("^[0-9]{1,7}+([.][0-9]{0,4})?$");
        Matcher m = pc.matcher(id);
        valido = m.matches();
        System.out.println(valido);
        return valido;

    }
}