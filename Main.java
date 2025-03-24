import java.util.ArrayList;
import java.util.List;

public class Main {
    public static int rangePrimos = 600;
    public static int rangeFibonacci = 6;
    public static void main(String[] args) {
        List<Integer> listaPrimos;
        try {
            listaPrimos = problema.numeroPrimo(rangePrimos);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }

        System.out.println("Numeros primos linear{");
        listaPrimos.forEach(System.out::println);
        System.out.println("}\n");
        listaPrimos.clear();

        try {
            listaPrimos = problema.numeroPrimoRecursiva(rangePrimos);
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }

        System.out.println("Numeros primos recursiva{");
        listaPrimos.forEach(System.out::println);
        System.out.println("}\n");
        listaPrimos.clear();

        try{
            System.out.println("Numero "+ rangeFibonacci + " da sequencia de fibonacci(Recursivo): "+problema.fibonacciRecursivo(rangeFibonacci)+ '\n');
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try{
            System.out.println("Numero "+ rangeFibonacci + " da sequencia de fibonacci(Linear): "+problema.fibonacci(rangeFibonacci)+ '\n');
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }


}