package recursividad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P4 {

    int n;
    int[] datos;
    FastReader reader = new FastReader();

    // no modificar
    static class FastReader {
        BufferedReader b;
        StringTokenizer s;

        public FastReader() {
            b = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (s == null || !s.hasMoreElements()) {
                try {
                    s = new StringTokenizer(b.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return s.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
    // no modificar

    public void leerDatos() {
        n = reader.nextInt();
        datos = new int[n];

        for (int i = 0; i < n; i++) {
            datos[i] = reader.nextInt();
        }
    }

    public int binarySum(int[] datos, int low, int high) {

        if (low > high) {
            return 0;
        }

        if (low == high) {
            return datos[low];
        }

        int mid = (low + high) / 2;

        return binarySum(datos, low, mid)
                + binarySum(datos, mid + 1, high);
    }

    public void resuelve() {
        int resultado = binarySum(datos, 0, n - 1);
        System.out.println("Suma: " + resultado);
    }

    public static void main(String[] args) {
        P4 id = new P4();

        id.leerDatos();
        id.resuelve();
    }
}
