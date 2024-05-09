
import java.util.Scanner;

public class VerificacaoChequeEspecial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        double saque = scanner.nextDouble();
        double limiteChequeEspecial = 500;
        double soma = saldo + limiteChequeEspecial;
        System.out.println(soma);

        if (saque > saldo && saque > soma) {
            System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
        } else if (saque <= saldo) {
            System.out.println("Transação realizada com sucesso.");
        } else if (saque < soma) {
            System.out.println("Transação realizada com sucesso utilizando o cheque especial.");
        } else if (saque <= saldo) {
            System.out.println("Transação realizada com sucesso.");
        }

        scanner.close();
    }

}
