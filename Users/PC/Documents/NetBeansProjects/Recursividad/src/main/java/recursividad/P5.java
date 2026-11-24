package recursividad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P5 {

    int[] numeros = new int[3];
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
        for (int i = 0; i < 3; i++) {
            numeros[i] = reader.nextInt();
        }
    }

    // Fibonacci malo
    public long fibBad(int n) {
        if (n <= 1) {
            return n;
        }

        return fibBad(n - 2) + fibBad(n - 1);
    }

    // Fibonacci bueno
    public long[] fibGood(int n) {
        if (n <= 1) {
            return new long[]{n, 0};
        }

        long[] temp = fibGood(n - 1);

        return new long[]{
            temp[0] + temp[1],
            temp[0]
        };
    }

    public void resuelve() {
        for (int i = 0; i < 3; i++) {

            int n = numeros[i];

            long malo = fibBad(n);
            long bueno = fibGood(n)[0];

            System.out.println("N: " + n);
            System.out.println("Fibonacci malo: " + malo);
            System.out.println("Fibonacci bueno: " + bueno);
            System.out.println("-------------------");
        }
    }

    public static void main(String[] args) {
        P5 id = new P5();

        id.leerDatos();
        id.resuelve();
    }
}
