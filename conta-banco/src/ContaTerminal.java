import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Variáveis
        Integer number;
        String agency;
        String clientName;
        Double balance;

        System.out.println("\n--------------------------");
        System.out.println("| Bem vindo ao Banco XYB |");
        System.out.println("--------------------------\n");
        // Entrada de dados
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome completo: ");
        clientName = scanner.nextLine();
        System.out.print("Digite o número da conta: ");
        number = scanner.nextInt();
        System.out.print("Digite a agência: ");
        agency = scanner.next();
        System.out.print("Digite o saldo da conta: ");
        balance = scanner.nextDouble();
        scanner.close();
        // Saída de dados
        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %f já está disponivel para saque.\n",
                clientName, agency, number, balance);

    }
}
