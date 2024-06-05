import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("***CADASTRO DE CONTA***");

        System.out.println("Por favor, digite o número da sua conta");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite sua agência");
        String agencia = scanner.next();

        System.out.println("Por favor, digite seu nome");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o seu saldo bancário");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}