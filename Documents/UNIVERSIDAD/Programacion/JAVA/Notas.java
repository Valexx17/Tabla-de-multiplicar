//Este programa guarda las notas ingresadas, las suma y las divide por la cantidad de notas que ha ingresado
package Notas;

import java.util.Scanner;


public class Notas {

    public static void main(String[] args) {
      Scanner entrada= new Scanner(System.in);  
      float nota1 ,nota2, nota3,nota4,nota5,nota6,suma,Promedio;  
        System.out.println("Digite 6 calificaciones");
        
        //Guarde las 6 notas ingresadas 
        nota1= entrada.nextFloat();
        nota2= entrada.nextFloat();
        nota3= entrada.nextFloat();
        nota4= entrada.nextFloat();
        nota5= entrada.nextFloat();
        nota6= entrada.nextFloat();
        
        
        suma = nota1+nota2+nota3+nota4+nota5+nota6;// se suman las notas
        
        System.out.println("\n la suma es "+suma);
            
      Promedio = suma /6; // el resultado se divide en las seis notas
        System.out.println("\n El promedio de las 6 notas es: "+Promedio);
    }
    
}
