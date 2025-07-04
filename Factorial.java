//nos piden implementar la funcion factorialDin que realice esta misma funcion pero utilizando un algoritmo dinamico basado en una tabla de valores entre 0 y n

    public class Factorial {

    //creamos la funcion de factorialDin

        public static long factorialDin(int n) {
            if (n < 0) {
                throw new IllegalArgumentException("n no puede se negativo");
            }

            //tabla de valores entre 0 y n
            long[] table = new long[n + 1];
            table[0] = 1; // donde 0! = 1

            for (int i = 1; i <= n; i++) {
                table[i] = i * table[i - 1];
            }

            return table[n];
        }

        public static void main(String[] args) {
            int n = 5;
            System.out.println("el factorial de:  " + n + " es: " + factorialDin(n));
        }
    }