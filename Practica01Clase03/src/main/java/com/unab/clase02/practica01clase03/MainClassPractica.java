
package com.unab.clase02.practica01clase03;
// Se importo "Scanner"
import java.util.Scanner;


public class MainClassPractica {

   
    public static void main(String[] args) {
        //Se utilizará Scanner para capturar datos por teclado
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su Nombre:");
        String Nombre = sc.nextLine();

        System.out.println(Nombre);

        System.out.println("Ingrese su edad:");
        int Edad = sc.nextInt();

        System.out.println("Seleccione su Sexo (M/F)");
        String Sexo = sc.next();

        System.out.println("Ingrese su peso:");
        double Peso = sc.nextDouble();

        System.out.println("Ingrese su altura:");
        double Altura = sc.nextDouble();

        //Creación de objetos en la Clase Persona
        //Constructor 1
        Persona person1 = new Persona(Nombre, Edad, Sexo, Peso, Altura);
        
        //Constructor utilizando get
        Persona person2 = new Persona(person1.getNombre(), person1.getEdad(), person1.getSexo());
       
        //Constructor utilizando set
        Persona person3 = new Persona();
        person3.setNombre(Nombre);
        person3.setEdad(Edad);
        person3.setSexo(Sexo);
        person3.setPeso(Peso);
        person3.setAltura(Altura);
 
    //System.out.println(person1.EdadMayor());

        //Imprimiendo los datos contenidos en los objetos
        System.out.println("Datos ingresados persona 1 " + person1.toGeneral());
    //Comprobando la edad Mayor o MenorI
        System.out.println("Persona 1: " +person1.EdadMayor());
        
        System.out.println("Datos ingresados persona 2 " + person2.toString());
    //Comprobando la edad Mayor o Menor
        System.out.println("Persona 2: " + person2.EdadMayor());
        
        System.out.println("Datos ingresados persona 3: " + person3.toGeneral());
    //Comprobando la edad Mayor o Menor
        System.out.println("Persona 3: " +person3.EdadMayor());      
     
    }
    
}
