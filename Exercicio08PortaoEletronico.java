import java.util.Scanner;

public class Exercicio08PortaoEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Há obstáculo detectado? (true/false): ");
        boolean obstaculoDetectado = scanner.nextBoolean();

        if (!obstaculoDetectado) {
            System.out.println("Portão abrindo com segurança.");
        }

        scanner.close();
    }
}
