
package com.unab.Negocio;

import com.unab.Dominio.Login;


public class ClsLogin {
    public boolean accesoSistema(Login log) {

    if (log.getUsuario().equals("KEMBERLY") && log.getPassword().equals("123")) {
     return true;
    }else{

    return false;

    }

}

 }   
   


