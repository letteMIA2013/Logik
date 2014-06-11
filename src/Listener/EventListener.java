package Listener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by e3_fernitz on 15.05.14.
 */
public class EventListener {


    // Erstellt einen button mit Variabelen EventListener
    public EventListener(final JFrame Seite, final JFrame Seiteschließen, final JButton button) {


        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Seite.setVisible(true);
                Seiteschließen.setVisible(false);
            }
        };
        button.addActionListener(listener);
    }
}
