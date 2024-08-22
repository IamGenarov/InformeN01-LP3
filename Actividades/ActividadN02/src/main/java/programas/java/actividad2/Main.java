package programas.java.actividad2;
import java.util.Scanner;

public class Main {
    /**
     * Verifica si un número entero es un palíndromo.
     * Este método toma un número entero y determina si es un palíndromo, es decir,
     * si el número se lee igual al derecho y al revés. Por ejemplo, si el número de entrada es 12321,
     * el método retornará true.
     *
     * @param n el número entero a verificar.
     * @return true si el número es un palíndromo, false en caso contrario.
     * @author genarov
     */
    public static boolean esPalindromo(int n) {
        String numero = Integer.toString(n);
        String invertido = new StringBuilder(numero).reverse().toString();
        return numero.equals(invertido);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número entero: ");
        int numeroIngresado = sc.nextInt();

        if (esPalindromo(numeroIngresado)) {
            System.out.println(numeroIngresado + " es un palíndromo.");
        } else {
            System.out.println(numeroIngresado + " no es un palíndromo.");
        }

        sc.close();
    }
}
