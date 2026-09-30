import java.util.Scanner;

public class Exercicio02AlarmeCofre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("O cofre está trancado? (true/false): ");
        boolean trancado = scanner.nextBoolean();

        if (!trancado) {
            System.out.println("ALERTA: O cofre está aberto! Disparando alarme!");
        }

        scanner.close();
    }
}
