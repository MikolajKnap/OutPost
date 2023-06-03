package outPost;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelOutpost extends JPanel {
    JLabel tytul;
    public PanelOutpost() {
        // Ustawienie background kolor panelu
        setBackground(PaczkomatGUI.kolorTlaTytulu);

        // Napis tytul
        tytul = new JLabel("OutPost");
        tytul.setFont(new Font(Font.DIALOG, Font.BOLD, 50));
        tytul.setHorizontalAlignment(JLabel.CENTER);

        // Dodanie napisu do panelu
        add(tytul);
    }
}
