/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package esdras_carranza_formulas;

import java.util.Scanner;

/**
 *
 * @author 50488
 */
public class Esdras_Carranza_Formulas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner info = new Scanner(System.in);

        double numerador1 = 0, numerador2 = 0, denominador1 = 0, denominador2 = 0, ejercicio_b = 0, ejercicio_c=0,valor_a =0,valor_b=0
                ,valor_c=0,valor_d=0,valor_e=0,valor_f=0,valor_g=0,valor_h=0,valor_j=0,ejercicio_d=0,   ejercicio_e= 0,ejercicio_f= 0,ejercicio_g= 0,ejercicio_h= 0,ejercicio_i= 0,ejercicio_j= 0,
                ejercicio_k= 0;
        
        System.out.println("EJERCICIO B");

        System.out.println("Ingresar valor numerador1: ");
        numerador1 = info.nextDouble();
        System.out.println("Ingresar valor denominador1: ");
        denominador1 = info.nextDouble();
        System.out.println("Ingresar valor numerador2: ");
        numerador2 = info.nextDouble();
        System.out.println("Ingresar valor denominador2: ");
        denominador2 = info.nextDouble();

        ejercicio_b = (1 / denominador1 - 5) - (3 * numerador1 * numerador2 / 4);
         System.out.println("resultado es " + ejercicio_b);

         System.out.println("EJERCICIO    C");
        System.out.println("Ingresar valor numerador1: ");
        numerador1 = info.nextDouble();
        System.out.println("Ingresar valor numerador2: ");
        numerador2 = info.nextDouble();
        System.out.println("Ingresar valor denominador2: ");
        denominador2 = info.nextDouble();

        ejercicio_c = (numerador2 / denominador2) + numerador1;
         System.out.println("resultado es " + ejercicio_c);
        System.out.println("EJERCICIO  D");
        

        System.out.println("Ingresar valor numerador1: ");
        numerador1 = info.nextDouble();
        System.out.println("Ingresar valor numerador2: ");
        numerador2 = info.nextDouble();
        System.out.println("Ingresar valor denominador: ");
        denominador2 = info.nextDouble();

        ejercicio_d = numerador1 + (numerador2 / denominador2);
         System.out.println("resultado es " + ejercicio_d);
        
        System.out.println("ejercicio   e");

        System.out.println("Ingresar valor a: ");
        valor_a = info.nextDouble();
        System.out.println("Ingresar valor b: ");
        valor_b = info.nextDouble();
        System.out.println("Ingresar valor c: ");
        valor_c = info.nextDouble();
        System.out.println("Ingresar valor d: ");
        valor_d = info.nextDouble();
        System.out.println("Ingresar valor e: ");
        valor_e = info.nextDouble();
        System.out.println("Ingresar valor f: ");
        valor_f = info.nextDouble();
        System.out.println("Ingresar valor g: ");
        valor_g = info.nextDouble();
        System.out.println("Ingresar valor h: ");
        valor_h = info.nextDouble();
        System.out.println("Ingresar valor j: ");
        valor_j = info.nextDouble();

        ejercicio_e = (Math.pow(valor_a,2)/valor_b-valor_c) + (valor_d-valor_e)/valor_f-(valor_g*valor_h/valor_j);
         System.out.println("resultado es " + ejercicio_e);
         
        System.out.println("EJERCICIO F");
        System.out.println("Ingresar valor a: ");
        valor_a = info.nextDouble();
        System.out.println("Ingresar valor b: ");
        valor_b = info.nextDouble();
        System.out.println("Ingresar valor c: ");
        valor_c = info.nextDouble();
        ejercicio_f= (valor_a/valor_b)-valor_c;
         System.out.println("resultado es " + ejercicio_f);
        System.out.println("EJERCICIO  G");
        System.out.println("Ingresar valor a: ");
        valor_a = info.nextDouble();
        System.out.println("Ingresar valor b: ");
        valor_b = info.nextDouble();
        System.out.println("Ingresar valor c: ");
        valor_c = info.nextDouble();
        ejercicio_g= valor_a - (valor_b/valor_c);
        
         System.out.println("resultado es " + ejercicio_g);
         
        System.out.println("EJERCICIO H");
        System.out.println("Ingresar valor a: ");
        valor_a = info.nextDouble();
        System.out.println("Ingresar valor b: ");
        valor_b = info.nextDouble();
        System.out.println("Ingresar valor c: ");
        valor_c = info.nextDouble();
        System.out.println("Ingresar valor d: ");
        valor_d = info.nextDouble();
        
        ejercicio_h =  (Math.pow(valor_a,2)/Math.pow(valor_b,2)) + (Math.pow(valor_c,2)/Math.pow(valor_d,2));
         System.out.println("resultado es " + ejercicio_h);
        System.out.println("EJERCICIO  F");
        System.out.println("Ingresar valor a: ");
        valor_a = info.nextDouble();
        System.out.println("Ingresar valor b: ");
        valor_b = info.nextDouble();
        System.out.println("Ingresar valor c: ");
        valor_c = info.nextDouble();
        System.out.println("Ingresar valor d: ");
        valor_d = info.nextDouble();
        System.out.println("Ingresar valor e: ");
        valor_e = info.nextDouble();
        System.out.println("Ingresar valor f: ");
        valor_f = info.nextDouble();
        
        ejercicio_i= (valor_a + valor_b/valor_c)/ (valor_d - valor_e/valor_f); 
         System.out.println("resultado es " + ejercicio_f);
         
        System.out.println("EJERCICIO J");
        System.out.println("Ingresar valor a: ");
        valor_a = info.nextDouble();
        System.out.println("Ingresar valor b: ");
        valor_b = info.nextDouble();
        System.out.println("Ingresar valor c: ");
        valor_c = info.nextDouble();
        System.out.println("Ingresar valor d: ");
        valor_d = info.nextDouble();
        System.out.println("Ingresar valor e: ");
        valor_e = info.nextDouble();
        System.out.println("Ingresar valor f: ");
        valor_f = info.nextDouble();
        System.out.println("Ingresar valor g: ");
        valor_g = info.nextDouble();
        System.out.println("Ingresar valor h: ");
        valor_h = info.nextDouble();
        
        ejercicio_j = (3*valor_a + valor_b)/valor_c - (valor_d+5*valor_e)/ valor_f + (valor_g/2*valor_h);
         System.out.println("resultado es " + ejercicio_j);
        
         System.out.println("Ejercicio k");
        System.out.println("Ingresar valor a: ");
        valor_a = info.nextDouble();
        System.out.println("Ingresar valor b: ");
        valor_b = info.nextDouble();
        System.out.println("Ingresar valor c: ");
        valor_c = info.nextDouble();
        System.out.println("Ingresar valor d: ");
        valor_d = info.nextDouble();
        System.out.println("Ingresar valor e: ");
        valor_e = info.nextDouble();
        System.out.println("Ingresar valor f: ");
        valor_f = info.nextDouble();
        System.out.println("Ingresar valor g: ");
        valor_g = info.nextDouble();
       
        ejercicio_k = (Math.pow(valor_a,2) + 2*valor_b*valor_c+ Math.pow(valor_d, 2))/ (1/Math.pow(valor_e,2))+2;
        
        System.out.println("resultado es " + ejercicio_k);
        
        
        


    }

}
