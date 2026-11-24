
package tema3.estructurasnolineales;

/**
 *
 * @author PC
 */
public class Potencias {
    
    // Metodo BAD: recursividad lineal
    public static double powerBad(double x, int n) {

        if (n == 0) {
            return 1;
        }

        return x * powerBad(x, n - 1);
    }

    // Metodo GOOD: exponenciacion rapida
    public static double powerGood(double x, int n) {

        if (n == 0) {
            return 1;
        }

        double parcial = powerGood(x, n / 2);
        double resultado = parcial * parcial;

        if (n % 2 != 0) {
            resultado = resultado * x;
        }

        return resultado;
    }

    public static void main(String[] args) {

        int[] exponentes = {10, 50, 100, 1000, 10000};
        double base = 1.0001;

        System.out.println("COMPARACION DE POTENCIAS");

        System.out.printf("%-10s %-20s %-20s%n",
                "N", "Tiempo BAD (ms)", "Tiempo GOOD (ms)");

        for (int n : exponentes) {

            long inicioBad = System.nanoTime();
            boolean badCorrecto = true;

            try {
                powerBad(base, n);
            } catch (StackOverflowError e) {
                badCorrecto = false;
            }

            long finBad = System.nanoTime();

            long inicioGood = System.nanoTime();
            double resultadoGood = powerGood(base, n);
            long finGood = System.nanoTime();

            if (badCorrecto) {
                double tiempoBad =
                        (finBad - inicioBad) / 1_000_000.0;

                System.out.printf("%-10d %-20.6f ",
                        n, tiempoBad);
            } else {
                System.out.printf("%-10d %-20s ",
                        n, "Desbordamiento de pila");
            }

            double tiempoGood =
                    (finGood - inicioGood) / 1_000_000.0;

            System.out.printf("%-20.6f%n", tiempoGood);

            System.out.println("Resultado GOOD: " + resultadoGood);
        }
    }
}
    

