

package com.unab.clase02.boton;

public class BotonVis {
    private String digitos;
    
 //Método que inicializa el atributo
public BotonVis(){
    digitos = "";

}
   //Método set y get
    public String getDigitos() {
        return digitos;
    }

    public void setDigitos(String digitos) {
        this.digitos = digitos;
       
    }
    //(int num) párametro que se enviara 
    //cuando los botones se presionen
    
    
    //Método concatenador
public void agregarNum(int num) {
    setDigitos(digitos + num);

}
    }
