package outPost;

import javax.swing.*;
import java.awt.*;

public class PanelOdbierzPaczke extends JPanel {
    public JLabel napisWyboru;

    public PanelOdbierzPaczke() {
        setBackground(PaczkomatGUI.kolorTlaTytulu);
        setLayout(new GridBagLayout());

        // Napis wyboru
        napisWyboru = new JLabel("Tutaj cos bedzie");
        napisWyboru.setFont(new Font(Font.DIALOG, Font.PLAIN, 30));
        napisWyboru.setHorizontalAlignment(JLabel.CENTER);

        // To sprawia ze mozemy ulozyc elementy w gridzie
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 30, 0); // Ustawienie odstępów między przyciskami

        gbc.gridy = 0; // wiersz 0 - to sprawia ze te 4 elementy nie nachodza na siebie a są pod sobą
        add(napisWyboru, gbc);
    }
}
