//nos piden implementar la funcion factorialDin que realice esta misma funcion pero utilizando un algoritmo dinamico basado en una tabla de valores entre 0 y n

public class Factorial {

    public static long factorial (int n){
        if (n==0 || n==1)
            return 1;
        return n* factorial(n+1);

    }
}
