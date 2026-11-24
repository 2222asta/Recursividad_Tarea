
package tema3.estructurasnolineales;
import java.util.Arrays;


/**
 *
 * @author PC
 */
public class reverseArray {
      public static void invertir(int[] arreglo, int inicio, int fin) {

        // Caso base
        if (inicio >= fin) {
            return;
        }

        // Intercambiar elementos
        int temporal = arreglo[inicio];
        arreglo[inicio] = arreglo[fin];
        arreglo[fin] = temporal;

        // Llamada recursiva
        invertir(arreglo, inicio + 1, fin - 1);
    }

    public static void main(String[] args) {

        int[] arreglo1 = {1, 2, 3, 4, 5};
        int[] arreglo2 = {10, 20, 30, 40};
        int[] arreglo3 = {7, 3, 9, 2, 6, 1};

        System.out.println("Ejemplo 1:");
        System.out.println("Antes: " + Arrays.toString(arreglo1));
        invertir(arreglo1, 0, arreglo1.length - 1);
        System.out.println("Despues: " + Arrays.toString(arreglo1));

        System.out.println("\nEjemplo 2:");
        System.out.println("Antes: " + Arrays.toString(arreglo2));
        invertir(arreglo2, 0, arreglo2.length - 1);
        System.out.println("Despues: " + Arrays.toString(arreglo2));

        System.out.println("\nEjemplo 3:");
        System.out.println("Antes: " + Arrays.toString(arreglo3));
        invertir(arreglo3, 0, arreglo3.length - 1);
        System.out.println("Despues: " + Arrays.toString(arreglo3));
    }

    
}
