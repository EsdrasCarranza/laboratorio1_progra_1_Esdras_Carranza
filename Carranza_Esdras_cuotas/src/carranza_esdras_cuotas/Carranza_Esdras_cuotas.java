/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carranza_esdras_cuotas;
import java.util.Scanner;
/**
 *
 * @author 50488
 */
public class Carranza_Esdras_cuotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner info = new Scanner (System.in);
       int prestamo = 0, plazo_meses = 0, comision_cuota = 0;
        double porcentaje_seguro = 0, valor_cuota = 0, total_pagar = 0, porcentaje_interes = 0, interes_prestamo = 0, valor_cuota1 = 0, total_comision =  0,
                porcentaje_comision = 0, total_seguro = 0, cuota_total_mensual=0;

        System.out.println("Bienvenido al programa de calculo de prestamo ");
        System.out.println("ingrese el valor del  prestamo");
        prestamo = info.nextInt();
        System.out.println("Ingrese el plazo en meses del prestamo: ");
        plazo_meses = info.nextInt();
        System.out.println("Ingrese el interes impuesto al prestamo: ");
        porcentaje_interes = info.nextInt();
        System.out.println("Ingrese la comision por cuota: ");
        comision_cuota = info.nextInt();
        System.out.println("Ingrese el porcentaje de seguro mensual aplicado a la cuota: ");
        porcentaje_seguro = info.nextDouble();

        interes_prestamo = porcentaje_interes * plazo_meses;
        
        porcentaje_interes = porcentaje_interes / 100;
        porcentaje_seguro = porcentaje_seguro  /100;
       
         
       
        valor_cuota1 =  1 + porcentaje_interes * plazo_meses;
        valor_cuota = prestamo * valor_cuota1/plazo_meses; 
        
        total_seguro = valor_cuota *  porcentaje_seguro;
        
        cuota_total_mensual = valor_cuota + comision_cuota + total_seguro;
        
        total_pagar = cuota_total_mensual * plazo_meses;
       
        System.out.println("Cuota de Pago Mensual: HNL " + valor_cuota);
        System.out.println("Total a Pagar: HNL " + total_pagar);
      
        
    }
    
}
