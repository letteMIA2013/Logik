package Login;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Frances on 29.05.2014.
 */
public class Loginfenster {



    public Loginfenster() {

//  Fenster
        JFrame loginFenster = new JFrame("Anmeldung");
        loginFenster.setSize(400, 300);

//  Panel wo alle Elemente drin sind
        JPanel loginPanel = new JPanel();
        GridBagLayout gbl = new GridBagLayout();
        loginPanel.setLayout(gbl);

//  JLabel erstellt und Schriftart verändert
        JLabel anmeldung = new JLabel("Anmeldung", JLabel.CENTER);
        anmeldung.setFont(new Font("Agency FB", Font.BOLD ,30));

        JLabel id_label = new JLabel("ID: ");
        JLabel pw_label = new JLabel("PASSWORT: ");

//  Textfelder zum Abfragen der Logindaten
        JTextField id_txt = new JTextField();
        JTextField pw_txt = new JTextField();

//  Button werden hier erstellt

        JButton zumMenue_btn = new JButton("X");
        JButton registrierungs_btn = new JButton("Registrierung");
        JButton login_btn = new JButton("Login");

//Der Classe Login wird der JFrame loginFenster zugewiesen und der login_btn bekommt einen actionListener made by Deafalt

        Login einloggen = new Login(loginFenster);
        login_btn.addActionListener(einloggen.getButton_listener());

//Der Classe Login wird der JFrame loginFenster zugewiesen und der registrierungs_btn bekommt einen actionListener made by Deafalt

        registrierungs_btn.addActionListener(einloggen.getButton_listener());



//  hier werden alle Elemente dem loginPanel hinzugefügt
        loginPanel.add(anmeldung, new GridBagConstraints(0, 0, 0, 1, 1, 10, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(2, 0, 2, 0), 0, 0));
        loginPanel.add(zumMenue_btn, new GridBagConstraints(1, 0, 0, 1, 1, 10,GridBagConstraints.LINE_END, GridBagConstraints.NONE, new Insets(2, 0, 2, 0),0, 0 ));

        loginPanel.add(registrierungs_btn,new GridBagConstraints(0, 1, 0, 1, 1, 10,GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(2, 0, 2,0),0, 0 ));

        loginPanel.add(id_label,new GridBagConstraints(0, 2, 1, 1, 1, 10,GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 70, 0, 5),0, 0 ) );
        loginPanel.add(id_txt, new GridBagConstraints(1, 2, 1, 1, 1, 10,GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 5, 0, 70),150, 0 ));

        loginPanel.add(pw_label, new GridBagConstraints(0, 3,1, 1, 1, 10,GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 70, 0, 5),0, 0 ));
        loginPanel.add(pw_txt, new GridBagConstraints(1, 3, 1, 1, 1, 10,GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 5, 0, 70),150, 0 ));

        loginPanel.add(login_btn, new GridBagConstraints(0, 4, 0, 1, 1, 10,GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(2, 0, 2,0),50, 0 ));


        loginFenster.add(loginPanel);


        loginFenster.setVisible(true);

    }
    //zum testen by Defalt
public static void main(String args[]){
    Loginfenster test = new Loginfenster();

}
}
