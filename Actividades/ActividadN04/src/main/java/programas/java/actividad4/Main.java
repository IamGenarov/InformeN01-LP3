package programas.java.actividad4;
import java.util.Scanner;

public class Main {
    /**
     * Calcula el promedio de los primeros 10 elementos de un arreglo de enteros.
     * <p>
     * Este método asume que el arreglo tiene al menos 10 elementos. Si el arreglo tiene menos de 10 elementos,
     * se lanzará una excepción {@link ArrayIndexOutOfBoundsException}.
     * </p>
     *
     * @param arr Un arreglo de enteros del cual se calculará el promedio.
     *            El arreglo debe tener al menos 10 elementos para evitar excepciones.
     * @return El promedio de los primeros 10 elementos del arreglo como un valor flotante.
     * @throws ArrayIndexOutOfBoundsException Si el arreglo tiene menos de 10 elementos.
     */
    public static float Promedio(int[] arr) {
        float ac = 0;
        for(int i = 0; i < 10; i++) {
            if (i >= arr.length) {
                throw new ArrayIndexOutOfBoundsException("El arreglo debe tener al menos 10 elementos.");
            }
            System.out.println(arr[i]);
            ac += arr[i];
        }
        return ac / 10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros;
        numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }
        System.out.println(Promedio(numeros));
    }
}