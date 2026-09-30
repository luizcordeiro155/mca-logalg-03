import java.util.Scanner;

public class Exercicio07CombustivelNave {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("O tanque está na reserva? (true/false): ");
        boolean tanqueReserva = scanner.nextBoolean();

        if (!tanqueReserva) {
            System.out.println("Decolagem autorizada! Sistemas em perfeito estado.");
        }

        scanner.close();
    }
}
