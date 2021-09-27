import java.util.Scanner;

public class Application {

    private static Umrechner umrechner;

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Um eine Binärzahl umzurechnen, gib eine 1 ein.");
        System.out.println("Um eine Dezimalzahl umzurechnen, gib eine 2 ein.");
        int programm = scanner.nextInt();
        if (programm != 1 && programm != 2) {
            System.out.println("Kein gültiges Programm ausgewählt!");
            return;
        }
        System.out.println("Gib deine Zahl ein:");
        int zahlEingabe = scanner.nextInt();
        if (programm == 1){
            zahlErgebnis = umrechner.decode(""+zahlEingabe);
        } else {
            zahlErgebnis = umrechner.encode(zahlEingabe);
        }
        System.out.println(zahlErgebnis);

    }
}
