import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo = 0.0;

        System.out.print("Por favor, digite o número da Conta: ");
        numeroConta = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Por favor, digite o número da Agência: ");
        agencia = scanner.nextLine();

        System.out.print("Por favor, digite o nome do Cliente: ");
        nomeCliente = scanner.nextLine();

        boolean saldoValido = false;
        while (!saldoValido) {
            System.out.print("Por favor, digite o saldo da Conta: ");
            if (scanner.hasNextDouble()) {
                saldo = scanner.nextDouble();
                saldoValido = true;
            } else {
                System.out.println("Valor inválido para o saldo. Por favor, digite um número decimal.");
                scanner.nextLine();
            }
        }

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo
                + " já está disponível para saque.");

        scanner.close();
    }
}