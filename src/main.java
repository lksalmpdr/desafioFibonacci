
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Fibonacci fb = new Fibonacci();

        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe um número inteiro: ");
        int limite = leitor.nextInt();

        if (fb.testaFibonacciAte(limite)) {
            System.out.println(limite + " faz parte da sequencia de Fibonacci");
        } else {
            System.out.println(limite + " nao faz parte da sequencia de Fibonacci");
        };

    }

}
