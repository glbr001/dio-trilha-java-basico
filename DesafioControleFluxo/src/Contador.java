import java.util.Scanner;


public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Contador de números entre um intervalo.");
        System.out.println("Digite dois números inteiros, onde o primeiro número deve3 ser menor que o primeiro.");
        System.out.print("Digite o primeiro número: ");
        int numero1 = terminal.nextInt();
        System.out.print("Digite o segundo número: ");
        int numero2 = terminal.nextInt();
        terminal.close();
        try {
            System.out.println("Contando de " + numero1 + " até " + numero2 + ": "); 
            contar(numero1, numero2);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getErroMessage());
        }
    }

    static void contar(int numero1, int numero2) throws Exception {
        if (numero1 > numero2) {
            throw new ParametrosInvalidosException();
        }
        for (int i = numero1; i <= numero2; i++) {
            System.out.print(i + " ");
        }
    }
}
