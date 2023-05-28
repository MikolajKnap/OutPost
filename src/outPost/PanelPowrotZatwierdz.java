package outPost;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelPowrotZatwierdz extends JPanel {
    public JButton buttonZatwierdz;
    public JButton buttonPowrot;

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
