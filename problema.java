import java.util.ArrayList;
import java.util.List;

public abstract class problema {
    public static List<Integer> numeroPrimo (int range) throws Exception {
        List<Integer> lista = new ArrayList<>();
        if (range < 1){
            throw new Exception("Numero invalido");
        }
        if (range == 1){
            return lista;
        }
        for (int i = 2; i < range; i++) {
            boolean ehPrimo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    ehPrimo = false;
                    break;
                }
            }
            if (ehPrimo) {
                lista.add(i);
            }

        }
        return lista;
    }
    public static List<Integer> numeroPrimoRecursiva (int range) throws Exception {
        List<Integer> lista = new ArrayList<>();
        if (range < 1){
            throw new Exception("Numero invalido");
        }
        encontrarNumerosPrimos(range,2,lista);
        return lista;
    }
    private static void encontrarNumerosPrimos(int range, int atual, List<Integer> primos) {
        if (atual > range) return;
        if (ehPrimo(atual, 2)) {
            primos.add(atual);
        }
        encontrarNumerosPrimos(range, atual + 1, primos);
    }
    private static boolean ehPrimo(int num, int divisor) {
        if (num < 2)
            return false;
        if (divisor > Math.sqrt(num))
            return true;
        if (num % divisor == 0)
            return false;
        return ehPrimo(num, divisor + 1);
    }
    public static int fibonacciRecursivo(int N) throws Exception {
        if (N < 0) {
            throw new Exception("Numero invalido");
        }
        if (N == 0)
            return 0;
        if (N == 1)
            return 1;
        return fibonacciRecursivo(N - 1) + fibonacciRecursivo(N - 2);
    }
    public static int fibonacci (int N) throws Exception {
        if (N < 0) {
            throw new Exception("Numero invalido");
        }
        if (N == 0)
            return 0;
        if (N == 1)
            return 1;
        int a = 0, b =1;
        for (int i = 2; i<= N; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
}
