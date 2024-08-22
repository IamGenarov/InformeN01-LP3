package programas.java.ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * La clase {@code Main} contiene un metodo que sirve para operar con arreglos de enteros.
 * En terminos generales el programa sirve para sumar los elementos de un arreglo
 * @author genarov
 */
public class Main {
    /**
     * Calcula la suma de los elementos de un arreglo de enteros.
     *
     * @param arr El arreglo de enteros cuyos elementos se sumarán.
     * @return La suma de los elementos del arreglo.
     * @throws IllegalArgumentException Si el arreglo es {@code null}.
     */
    public static int SumaArreglo(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("El arreglo no puede ser null.");
        }
        int suma = 0;
        for (int i = 0; i < arr.length; i++) {
            suma += arr[i];
        }
        return suma;
    }

    /**
     * Función principal que lee diez números enteros desde la entrada estándar,
     * los almacena en un arreglo y luego muestra la suma de estos números.
     * Maneja las excepciones relacionadas con la entrada de datos.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en esta aplicación).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            while (true) {
                try {
                    System.out.print("Ingresar el número (" + (i + 1) + "/10): ");
                    numeros[i] = sc.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Error. Ingrese un número entero.");
                    sc.next();
                }
            }
        }

        try {
            int suma = SumaArreglo(numeros);
            System.out.println("La suma del arreglo: " + suma);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al calcular la suma: " + e.getMessage());
        }

        sc.close();
    }
}
