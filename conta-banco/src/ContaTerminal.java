import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); 

        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("\nPor favor, digite o número da Agência:");
        agencia = scanner.nextLine();

        System.out.println("\nPor favor, digite o número da Conta:");
        numeroConta = scanner.nextInt();

        System.out.println("\nPor favor, digite o nome do Cliente:");
        nomeCliente = scanner.next();

        System.out.println("\nPor favor, digite o saldo:");
        saldo = scanner.nextDouble();

        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo de R$" + saldo + " já está disponível para saque.\n");
    
    }
}
