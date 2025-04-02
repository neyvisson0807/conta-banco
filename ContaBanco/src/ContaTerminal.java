import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitando e lendo os dados do usuário
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();
        
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha
        
        System.out.println("Por favor, digite o seu Nome:");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o saldo inicial:");
        double saldo = scanner.nextDouble();
        
        // Exibindo a mensagem final
        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        
        scanner.close();
    }
}
