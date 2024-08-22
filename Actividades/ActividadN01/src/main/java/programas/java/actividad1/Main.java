package programas.java.actividad1;
import java.util.Scanner;

public class Main {
    /**
     * EL metodo determina si un número entero es primo.
     * @param n el número entero a evaluar.
     * @return {@code true} si el número es primo; {@code false} en caso contrario.
     */
    public static boolean EsPrimo(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false; //encontro algun divisor
            }
        }
        return true; //no encontro divisores
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numIngresado = sc.nextInt();
        if (EsPrimo(numIngresado)) {
            System.out.println("Es un numero primo");
        }

    }
}