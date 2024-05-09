import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();

        double saque = 0.0;
        boolean validador = true;

        for (int i = 0; validador == true; i++) {
            saque = scanner.nextDouble();
            if (saque < saldo) {
                saldo = saldo - saque;
                System.out.println("Saque realizado. Limite restante: " + saldo);

            }
            double limiteDiario = scanner.nextDouble();
            validador = limiteDiario == 0 || saldo < saque ? false : true;
            if (limiteDiario == 0) {
                validador = false;
            } else {
                validador = true;

            }
            // validador = limiteDiario == 0 ? false : true;
        }

        scanner.close();
    }

}