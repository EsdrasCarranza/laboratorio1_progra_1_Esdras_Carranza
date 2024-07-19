/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package esdras_trejo_plantilla_empleado;

import java.util.Scanner;

/**
 *
 * @author 50488
 */
public class Esdras_Trejo_Cuota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);

        int prestamo = 0, plazo_meses = 0, comision_cuota = 0;
        double porcentaje_seguro = 0, valor_cuota = 0, total_pagar = 0, porcentaje_interes = 0, interes_prestamo = 0;

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

        porcentaje_interes = porcentaje_interes / 100;

        interes_prestamo = porcentaje_interes * prestamo * plazo_meses;
        
        valor_cuota = (prestamo * interes_prestamo / 1 - Math.pow(1 + interes_prestamo, plazo_meses * -1));
        

    }

}
