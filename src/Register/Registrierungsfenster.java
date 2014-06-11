package Register;
import javax.swing.*;
import java.awt.*;

/**
 * Created by Frances on 04.06.2014.
 */
public class Registrierungsfenster {
    public Registrierungsfenster() {

    //  Fenster erstellt und Größe festgelegt
        JFrame registrierungsFenster = new JFrame("Anmeldung");
        registrierungsFenster.setSize(400, 300);

    //  Panel wo alle Elemente drin sind in einem GridBagLayout

        JPanel registrierungspanel = new JPanel();
        GridBagLayout gbl = new GridBagLayout();
        registrierungspanel.setLayout(gbl);

    //  JLabel erstellt und Schriftart verändert
        JLabel neuanmeldung = new JLabel("Neuanmeldung", JLabel.CENTER);
        neuanmeldung.setFont(new Font("Agency FB", Font.BOLD ,30));

        JLabel id_label = new JLabel("ID: ");
        JLabel pw_label = new JLabel("PASSWORT: ");
        JLabel pwWH_label = new JLabel("PASSWORT Wh.: ");

    //  Textfelder zum Abfragen der Daten

        JTextField id_txt = new JTextField();
        JTextField pw_txt = new JTextField();
        JTextField pwWH_txt = new JTextField();

    //  Button wird hier erstellt

        JButton signUp_btn = new JButton("SIGN UP");

    //  hier werden alle Elemente dem registrierungspanel hinzugefügt

        registrierungspanel.add(neuanmeldung, new GridBagConstraints(0, 0, 0, 1, 1, 1,GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(5, 5, 5, 5),0, 0 ));
        registrierungspanel.add(id_label, new GridBagConstraints(0, 1, 1, 1, 1, 1,GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(5, 5, 5, 5),0, 0 ));
        registrierungspanel.add(id_txt, new GridBagConstraints(1, 1, 1, 1, 1, 1,GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(5, 5, 5, 5),150, 0 ));
        registrierungspanel.add(pw_label, new GridBagConstraints(0, 2, 1, 1, 1, 1,GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(5, 5, 5, 5),0, 0 ));
        registrierungspanel.add(pw_txt, new GridBagConstraints(1, 2, 1, 1, 1, 1,GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(5, 5, 5, 5),150, 0 ));
        registrierungspanel.add(pwWH_label, new GridBagConstraints(0, 3, 1, 1, 1, 1,GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(5, 5, 5, 5),0, 0 ));
        registrierungspanel.add(pwWH_txt, new GridBagConstraints(1, 3, 1, 1, 1, 1,GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(5, 5, 5, 5),150, 0 ));
        registrierungspanel.add(signUp_btn, new GridBagConstraints(0, 4, 0, 1, 1, 1,GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(5, 5, 5, 5),0, 0 ));



        registrierungsFenster.add(registrierungspanel);

        registrierungsFenster.setVisible(true);

    }
}
