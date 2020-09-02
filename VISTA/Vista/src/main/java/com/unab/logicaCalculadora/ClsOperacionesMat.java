
package com.unab.logicaCalculadora;


public class ClsOperacionesMat {
    private double Dato1, Dato2;

    public double getDato1() {
        return Dato1;
    }

    public void setDato1(double Dato1) {
        this.Dato1 = Dato1;
    }

    public double getDato2() {
        return Dato2;
    }

    public void setDato2(double Dato2) {
        this.Dato2 = Dato2;
    }

    public double Suma(double Dato1, double Dato2) {
        return Dato1+Dato2;
    }

    public  double Resta(double Dato1, double Dato2) {
        return Dato1-Dato2;
    }

    public double Multiplicar(double Dato1, double Dato2) {
        return Dato1*Dato2;
    }

    public double Dividir(double Dato1, double Dato2) {
        return Dato1/Dato2;
    }
    

    }
    
    

