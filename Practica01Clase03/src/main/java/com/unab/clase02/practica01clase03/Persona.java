
package com.unab.clase02.practica01clase03;


public class Persona {
    //Abstraccion de atributos de la clase Persona
    private String Nombre;
    private int Edad;
    private String Sexo;
    private double Peso;
    private double Altura;
    
    
    //Constructores
    public Persona() {
    }
   
    public Persona(String Nombre, int Edad, String Sexo) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Sexo = Sexo;
    }

    public Persona(String Nombre, int Edad, String Sexo, double Peso, double Altura) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Sexo = Sexo;
        this.Peso = Peso;
        this.Altura = Altura;
    }
    
    // Métodos Get y Set
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }
    
    //Método EdadMayor
    String EdadMayor(){
        int edad = this.Edad;
        if(edad >= 18) {
            return "Eres Mayor de Edad";
        }else{
            return " Eres Menor de Edad";
        }
    }  

//Metodos to String
    public String toGeneral() {
        return "Persona{" + "Nombre=" + Nombre + ", Edad=" + Edad + ", Sexo=" + Sexo + ", Peso=" + Peso + ", Altura=" + Altura + '}';
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", Edad=" + Edad + ", Sexo=" + Sexo + '}';
    }
    
}