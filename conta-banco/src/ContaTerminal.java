import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int numero_conta;
        String agencia, nome_cliente;
        float saldo_conta;

        System.out.println("Olá!, Seja Bem Vindo.");
        System.out.println("Agradecemos a preferência!, insira o dados solicitados abaixo: \n");

        System.out.print("Por favor, digite o seu nome completo: ");
        nome_cliente = scanner.nextLine();
        System.out.println();

        System.out.print("Por favor, digite o número da Agência: ");
        agencia = scanner.nextLine();
        System.out.println();

        System.out.print("Por favor, digite o número da Conta: ");
        numero_conta = scanner.nextInt();
        System.out.println();

        System.out.print("Por favor, digite o valor a ser depositado: ");
        saldo_conta = scanner.nextInt();
        System.out.println();

        System.out.println("Olá " + nome_cliente.toUpperCase()
                + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                ", conta " + numero_conta + " e seu saldo " + saldo_conta + " já esta disponível para saque");

    }
}
