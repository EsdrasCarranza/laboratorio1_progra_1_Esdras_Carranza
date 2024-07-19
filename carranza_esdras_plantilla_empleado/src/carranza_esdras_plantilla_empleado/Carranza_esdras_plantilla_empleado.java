/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carranza_esdras_plantilla_empleado;
import java.util.Scanner;
/**
 *
 * @author 50488
 */
public class Carranza_esdras_plantilla_empleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner info = new Scanner (System.in);
        
        info.useDelimiter("\n");
        
        String nombre_empleado = " ";
        int horas_trabajadas = 0, tarifa_empleado = 0,salario_empleado = 0;
        
        System.out.println("Bienvenido a la boleta de empleado");
        System.out.println("Ingrese su  nombre :");
        nombre_empleado  = info.next();
        
        System.out.println("Hola " + nombre_empleado + " Ingrese las horas que usted trabajo: ");
        horas_trabajadas = info.nextInt();
        
        System.out.println("Muy bien ahora ingrese su Tarifa por hora: ");
        tarifa_empleado = info.nextInt();
        
        salario_empleado = horas_trabajadas * tarifa_empleado;
        
        System.out.println(" ");
        System.out.println("Nombre del empleado: " + nombre_empleado);
        System.out.println("Horas trabajadas: " + horas_trabajadas);
        System.out.println("Salario empleado semanal: " + salario_empleado + ".lps");
        
        
        
        
        
        
        
        
        
                
    }
    
}
