import java.util.Scanner;

public class ControleSimplesDeSaquesEquivocado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        double saque = scanner.nextDouble();

        if (saldo < saque) {
            System.out.println("Transacoes encerradas. Limite diario de saque atingido.");
            System.exit(0);

        }
        double limiteDiario = scanner.nextDouble();

        double saque2 = saque;

        for (int i = 0; limiteDiario >= 0; i++) {

            saque2 = saque2;

            if (saldo >= saque2) {
                saldo = saldo - saque2;
                System.out.println("Saque realizado. Limite restante: " + saldo);
                if (limiteDiario == 0) {
                    limiteDiario = -1;
                    System.out.println("Transacoes encerradas.");
                } else if (saldo < saque2) {
                    System.out.println("Transacoes encerradas. Limite diario de saque atingido.");
                    System.exit(0);

                } else {
                    saque2 = scanner.nextDouble();
                }
                limiteDiario--;

            }

        }
        scanner.close();
    }
}