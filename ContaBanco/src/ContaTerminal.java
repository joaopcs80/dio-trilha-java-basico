import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta:");
        int numeroConta = entrada.nextInt();
        entrada.nextLine(); 

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = entrada.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = entrada.nextLine();

        System.out.println("Por favor, digite o saldo:");
        double saldo = entrada.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

        entrada.close();
    }
}
