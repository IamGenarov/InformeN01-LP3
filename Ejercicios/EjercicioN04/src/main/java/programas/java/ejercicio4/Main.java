package programas.java.ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * La clase {@code Main} proporciona una funcionalidad para encontrar el menor de tres números flotantes
 * ingresados por el usuario.
 *
 * @author genarov
 */
public class Main {

    /**
     * Devuelve el menor de tres números flotantes.
     *
     * @param n1 El primer número flotante.
     * @param n2 El segundo número flotante.
     * @param n3 El tercer número flotante.
     * @return El menor de los tres números flotantes.
     */
    public static float menor(float n1, float n2, float n3) {
        if (n1 <= n2 && n1 <= n3) {
            return n1;
        } else if (n2 <= n1 && n2 <= n3) {
            return n2;
        } else {
            return n3;
        }
    }

    /**
     * Punto de entrada principal del programa. Solicita al usuario ingresar tres números flotantes y muestra
     * el menor de ellos en la consola. Se incluye validación para asegurar que los datos ingresados sean números flotantes.
     *
     * @param args Los argumentos de línea de comandos (no utilizados en este caso).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1 = 0, n2 = 0, n3 = 0;
        boolean valido = false;

        while (!valido) {
            try {
                System.out.print("Ingrese el primer número: ");
                n1 = sc.nextFloat();

                System.out.print("Ingrese el segundo número: ");
                n2 = sc.nextFloat();

                System.out.print("Ingrese el tercer número: ");
                n3 = sc.nextFloat();

                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número flotante válido.");
                sc.next();
            }
        }

        float menorNumero = menor(n1, n2, n3);
        System.out.println("El menor número es: " + menorNumero);

        sc.close();
    }
}
