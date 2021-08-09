import java.util.Scanner;

public class Application {

    private static Umrechner umrechner;

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String binaerZahl = scanner.nextLine();

        umrechner = new Umrechner();
        int dezimalZahl = umrechner.decode(binaerZahl);

        System.out.println(dezimalZahl);
    }
}
