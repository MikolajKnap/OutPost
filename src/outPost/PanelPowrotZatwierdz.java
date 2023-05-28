package outPost;

import outPost.buttons.PrzyciskBazowy;
import outPost.buttons.PrzyciskPowrot;
import outPost.buttons.PrzyciskZatwierdz;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class PanelPowrotZatwierdz extends JPanel {
    public PrzyciskBazowy buttonZatwierdz, buttonPowrot;

    public PanelPowrotZatwierdz() {
        // Ustawienie atrybutow JPanel
        setLayout(new BorderLayout());
        setBackground(PaczkomatGUI.kolorTlaTytulu);

        // Tworzenie przycisku "Zatwierdz"
        buttonZatwierdz = new PrzyciskZatwierdz();

        // Tworzenie przycisku "Powrót"
        buttonPowrot = new PrzyciskPowrot();

        // Dodanie buttonikow do JPanel
        add(buttonZatwierdz, BorderLayout.EAST);
        add(buttonPowrot, BorderLayout.WEST);
    }
}
