import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        int numeroConta = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite o número da Agência:");
        String numeroAgencia = scanner.nextLine();

        System.out.print("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite seu saldo:");
        double saldo = Double.parseDouble(scanner.nextLine());

        System.out.println("Olá " + nome +", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo de R$"+ saldo + " já está disponível para saque.");
    }
}
