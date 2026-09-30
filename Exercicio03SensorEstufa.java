import java.util.Scanner;

public class Exercicio03SensorEstufa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("O solo está úmido? (true/false): ");
        boolean soloUmido = scanner.nextBoolean();

        if (!soloUmido) {
            System.out.println("Irrigadores ligados: umidade abaixo do ideal.");
        }

        scanner.close();
    }
}
