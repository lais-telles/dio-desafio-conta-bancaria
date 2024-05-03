import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite seu nome");
        String nome = scanner.next();

        System.out.println("Por favor, digite seu sobrenome");
        String sobreNome = scanner.next();

        System.out.println("Por favor, digite o número da sua conta");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o numero da sua agência");
        String numeroAgencia = scanner.next();

        System.out.println("Por favor, digite seu saldo");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + " " + sobreNome 
        + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia
        + ", conta " + numeroConta + " e seu saldo de " + saldo + " reais já está disponível para saque.");
    }
}
