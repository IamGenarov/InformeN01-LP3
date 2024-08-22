package programas.java.ejercicio3;

import java.util.Random;

/**
 * La clase {@code Main} simula el lanzamiento de dados generando números aleatorios
 * y muestra los resultados. Genera una gran cantidad de lanzamientos y luego
 * muestra la frecuencia de cada valor único encontrado en los lanzamientos.
 * <p>
 * El programa realiza 20,000 lanzamientos de dados y posteriormente muestra la
 * frecuencia de cada valor único encontrado en los lanzamientos.
 * </p>
 * @author genarov
 */
public class Main {
    /**
     * Genera un arreglo con los valores únicos a partir de un arreglo de números.
     * @param arr El arreglo de números de entrada.
     * @return Un arreglo que contiene los valores únicos encontrados en el arreglo de entrada.
     */
    public static int[] set(int[] arr) {
        int[] tempArray = new int[arr.length];
        int setcont = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < setcont; j++) {
                if (arr[i] == tempArray[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                tempArray[setcont++] = arr[i];
            }
        }

        int[] uniqueValuesArray = new int[setcont];
        System.arraycopy(tempArray, 0, uniqueValuesArray, 0, setcont);

        return uniqueValuesArray;
    }

    /**
     * Cuenta cuántas veces aparece un valor específico en un arreglo.
     * @param arr El arreglo de números en el que se busca la frecuencia.
     * @param value El valor cuya frecuencia se desea contar.
     * @return La cantidad de veces que {@code value} aparece en {@code arr}.
     */
    public static int frecuencia(int[] arr, int value) {
        int cont = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == value) {
                cont++;
            }
        }
        return cont;
    }

    /**
     * Punto de entrada principal del programa. Genera 20,000 números aleatorios entre 1 y 6
     * para simular lanzamientos de dados y luego muestra la frecuencia de cada valor único
     * encontrado en los lanzamientos.
     *
     * @param args Los argumentos de línea de comandos (no utilizados en este caso).
     */
    public static void main(String[] args) {
        final int NUMERO_LANZAMIENTOS = 20000;
        final int VALORES_DADO = 6;

        Random random = new Random();
        int[] numDados = new int[NUMERO_LANZAMIENTOS];

        for (int i = 0; i < NUMERO_LANZAMIENTOS; i++) {
            numDados[i] = random.nextInt(VALORES_DADO) + 1;
        }

        int[] valoresUnicos = set(numDados);

        for (int valor : valoresUnicos) {
            int frecuencia = frecuencia(numDados, valor);
            System.out.println("Elemento: " + valor + " - Frecuencia: " + frecuencia);
        }
    }
}
