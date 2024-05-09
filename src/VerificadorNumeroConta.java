import java.util.Scanner;

public class VerificadorNumeroConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.next();

        try {

            verificarNumeroConta(num);

            System.out.println("Numero de conta válido");

        } catch (Exception e) {

            System.out.println("Erro: " + e.getMessage());

        } finally {
            scanner.close();
        }
    }

    private static void verificarNumeroConta(String numeroConta) {
        int tmp = 0;

        for (int i = 1; i < numeroConta.length(); i++) {
            tmp = i + 1;
        }
        if (tmp != 8) {
            throw new IllegalArgumentException("Numero de conta invalido.\n" + "Digite exatamente 8 digitos.");
        }

    }
}