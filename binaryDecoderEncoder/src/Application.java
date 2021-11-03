import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Application extends JFrame implements ActionListener {

    private static Umrechner umrechner;

    private JTextField eingabe;
    private JLabel ergebnis;
    private JRadioButton dezToBin;
    private JRadioButton binToDez;

    public static void main(String args[]) {
        umrechner = new Umrechner();
        Application app = new Application();
        app.setSize(400, 500);
        app.setLayout(new GridLayout(3, 2));
        app.setVisible(true);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public Application() {
        dezToBin = new JRadioButton("Dezimalzahl in Binärzahl");
        binToDez = new JRadioButton("Binärzahl in Dezimalzahl");
        ButtonGroup radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(dezToBin);
        radioButtonGroup.add(binToDez);

        eingabe = new JTextField(16);
        JButton button = new JButton("umrechnen");
        JLabel labelErgebnis = new JLabel("Ergebnis:");
        ergebnis = new JLabel();

        button.addActionListener(this);

        add(dezToBin);
        add(binToDez);
        add(eingabe);
        add(button);
        add(labelErgebnis);
        add(ergebnis);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int dezimalZahl = umrechner.decode(eingabe.getText());
        ergebnis.setText("" + dezimalZahl);
    }

}
