import java.util.Scanner;

public class ContaTerminal {
    
    
    static Scanner entrada = new Scanner(System.in);
    static int numeroConta;
    static String agencia;
    static String nomeCliente;
    static double saldo;
    
    public static void main(String[] args) throws Exception {
        System.out.println("Por favor, digite o número da agência! ");
        agencia = entrada.nextLine();

        System.out.println("Por favor, digite o número da Conta");
        numeroConta = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Por favor, informe o nome do cliente: ");
        nomeCliente = entrada.nextLine();

        System.out.println("Informe o saldo: ");
        saldo = entrada.nextDouble();

        System.out.print("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é ");
        System.out.println(agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");        
    }

    
}

