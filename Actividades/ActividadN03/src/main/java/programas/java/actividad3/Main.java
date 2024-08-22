package programas.java.actividad3;
import java.util.Scanner;

public class Main {
    /**
     * Calcula la suma de los divisores propios de un número entero.
     * Un divisor propio es cualquier divisor de un número excepto el número mismo.
     * Este método suma todos los divisores propios de un número dado.
     *
     * @param n el número entero cuyo suma de divisores propios se va a calcular.
     * @return la suma de los divisores propios de {@code n}.
     */
    public static int SumaDivisores(int n) {
        int acumulador = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                acumulador += i;
            }
        }
        return acumulador;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroIngresado = sc.nextInt();
        if(SumaDivisores(numeroIngresado) == numeroIngresado){
            System.out.println("Perfecto");
        }else{
            System.out.println("No es Perfecto");
        }
    }
}