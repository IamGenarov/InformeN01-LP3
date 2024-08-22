package programas.java.ejercicio6;

import java.util.Scanner;

/**
 * Esta clase contiene métodos para convertir todas las unidadeds de tiempo(hrs,min, seg) a segundos
 * @author genarov
 */

public class Main {
    /**
     * Calcula el total de seundos.
     * @param h la cantidad de horas
     * @param m cantidad de minutos
     * @param s cantidad de segundos
     * @return el total de segundos
     */
    public static int ConvertorSeg(int s, int m, int h){
        return (int)(s + (m*60)+(h*3600));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int seg = 0, min = 0, hrs = 0;

        while(seg <= 0){
            System.out.print("Ingrese el valor del segundo: ");
            seg = sc.nextInt();
        }
        while(seg <= 0){
            System.out.print("Ingrese minutos: ");
            min = sc.nextInt();
        }
        while(seg <= 0){
            System.out.print("Ingrese horas: ");
            hrs = sc.nextInt();
        }
        System.out.println(ConvertorSeg(seg, min, hrs));
    }
}