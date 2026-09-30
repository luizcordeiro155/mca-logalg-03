import java.util.Scanner;

public class Exercicio06ConexaoInternet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Há conexão com a internet? (true/false): ");
        boolean comConexao = scanner.nextBoolean();

        if (!comConexao) {
            System.out.println("Modo Offline ativado. Executando músicas baixadas.");
        }

        scanner.close();
    }
}
