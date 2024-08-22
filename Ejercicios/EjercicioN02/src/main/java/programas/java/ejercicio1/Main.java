package programas.java.ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * La clase {@code Main} contiene el punto de entrada principal del programa.
 * Permite al usuario ingresar una serie de números enteros, asegurándose de que cada número
 * ingresado sea mayor o igual que el número anterior.
 * Además, proporciona una función para mostrar el contenido del arreglo en consola.
 *
 * @autor Genarov</p>
 */
public class Main {
    /**
     * Muestra el contenido de un arreglo de enteros en la consola.
     *
     * @param arr El arreglo de enteros a mostrar.
     */
    public static void mostrarArreglo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i+1) + ". " + arr[i]);
        }
    }

    /**
     * Punto de entrada principal del programa.
     * Solicita al usuario que ingrese 10 números enteros, asegurando que cada número
     * ingresado sea mayor o igual que el anterior.
     * Finalmente, muestra el arreglo de números ingresados en la consola.
     *
     * @param args Los argumentos de línea de comandos (no utilizados en este caso).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            boolean inputValido = false;
            while (!inputValido) {
                try {
                    System.out.print("Ingrese un numero entero: ");
                    int numero = sc.nextInt();

                    if (i == 0 || numero > numeros[i - 1]) {
                        numeros[i] = numero;
                        inputValido = true;
                    } else {
                        System.out.println("El numero debe ser mayor que el anterior.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Entrada invalida. Por favor, ingrese un número entero.");
                    sc.next();
                }
            }
        }

        sc.close();
        mostrarArreglo(numeros);
    }
}

