package programas.java.ejercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Esta clase contiene métodos para calcular el pago basado en el número de horas trabajadas.
 * @author genarov
 */
public class Main {

    /**
     * Calcula el pago total basado en el número de horas trabajadas.
     *
     * @param hr el número de horas trabajadas.
     * @return el pago total calculado.
     */
    public static float CalcularPago(int hr) {
        if (hr < 1) {
            throw new IllegalArgumentException("El número de horas no puede ser menor a 1.");
        }

        float pagoTotal;
        int cantidad_dias = 0;

        while (hr > 24) {
            hr -= 24;
            cantidad_dias++;
        }

        pagoTotal = (float) (3.0 + ((hr - 1) * 0.5));

        if (pagoTotal >= 12) {
            pagoTotal = 12;
        }

        return pagoTotal + (cantidad_dias * 12);
    }

    /**
     * Método principal que lee la entrada del usuario y muestra el pago calculado.
     *
     * @param args argumentos de línea de comandos.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidadHoras = 0;

        while (true) {
            System.out.print("Ingrese la cantidad de horas: ");
            try {
                cantidadHoras = sc.nextInt();

                if (cantidadHoras >= 1) {
                    break;
                } else {
                    System.out.println("La cantidad de horas debe ser un número entero positivo, mayor a 1.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor ingrese un número entero.");
                sc.next();
            }
        }

        System.out.println("El pago total es: " + CalcularPago(cantidadHoras));
    }
}
