import java.util.Scanner;

public class Exercicio04ValidacaoTermos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("O usuário aceitou os termos? (true/false): ");
        boolean aceitouTermos = scanner.nextBoolean();

        if (!aceitouTermos) {
            System.out.println("Acesso negado. Você precisa aceitar os termos de serviço para jogar.");
        }

        scanner.close();
    }
}
