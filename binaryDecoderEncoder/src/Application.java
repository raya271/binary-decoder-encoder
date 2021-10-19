import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Application {

    private static Umrechner umrechner;

    public static void main(String args[]) {

        JFrame frame = new JFrame();

        JTextField eingabe = new JTextField(16);
        JButton button = new JButton("umrechnen");
        JLabel label = new JLabel("Ergebnis:");
        JLabel ergebnis = new JLabel();

        button.addActionListener(new ListenerUmrechnen());

        frame.add(eingabe);
        frame.add(button);
        frame.add(label);
        frame.add(ergebnis);
        frame.setSize(400,500);
        frame.setLayout(new GridLayout(2,2));
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);





//        umrechner = new Umrechner();
//        long zahlErgebnis;
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Um eine Binärzahl umzurechnen, gib eine 1 ein.");
//        System.out.println("Um eine Dezimalzahl umzurechnen, gib eine 2 ein.");
//        int programm = scanner.nextInt();
//        if (programm != 1 && programm != 2) {
//            System.out.println("Kein gültiges Programm ausgewählt!");
//            return;
//        }
//        System.out.println("Gib deine Zahl ein:");
//        int zahlEingabe = scanner.nextInt();
//        if (programm == 1){
//            zahlErgebnis = umrechner.decode(""+zahlEingabe);
//        } else {
//            zahlErgebnis = umrechner.encode(zahlEingabe);
//        }
//        System.out.println(zahlErgebnis);

    }

    public static class ListenerUmrechnen implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
}
