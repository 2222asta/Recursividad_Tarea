
package tema3.estructurasnolineales;

/**
 *
 * @author PC
 */
public class LinearSum {
      public static int linearSum(int[] data, int n) {

        if (n == 0) {
            return 0;
        }

        return linearSum(data, n - 1) + data[n - 1];
    }

    public static void main(String[] args) {

        int[] arreglo1 = {2, 4, 6};
        int[] arreglo2 = {5, 10, 15, 20};
        int[] arreglo3 = {3, 7, 8, 12, 10};

        System.out.println("Ejemplo 1: "
                + linearSum(arreglo1, arreglo1.length));

        System.out.println("Ejemplo 2: "
                + linearSum(arreglo2, arreglo2.length));

        System.out.println("Ejemplo 3: "
                + linearSum(arreglo3, arreglo3.length));
    }
}
    

