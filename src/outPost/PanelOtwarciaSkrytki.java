package outPost;

import outPost.buttons.PrzyciskPowrot;

import javax.swing.*;
import java.awt.*;

public class PanelOtwarciaSkrytki extends JPanel{
    JButton buttonPowrot;
    JLabel labelPlatnosc;
    JLabel labelPlatnosc2;

    public PanelOtwarciaSkrytki() {
        setLayout(new GridBagLayout());
        setBackground(PaczkomatGUI.kolorTlaTytulu);

        // Buttony
        buttonPowrot = new PrzyciskPowrot();

        // Label z wyswietlona kwota do zaplaty
        labelPlatnosc = new JLabel("Skrytka nr XX została otwarta");
        labelPlatnosc.setFont(new Font(Font.DIALOG, Font.BOLD, 28));
        labelPlatnosc.setHorizontalAlignment(JLabel.CENTER);

        labelPlatnosc2 = new JLabel("Po 5 sekundach nastąpi automatyczne zamknięcie");
        labelPlatnosc2.setFont(new Font(Font.DIALOG, Font.BOLD, 28));
        labelPlatnosc2.setHorizontalAlignment(JLabel.CENTER);

        // Ulozenie elementow na gridzie
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 0); // Ustawienie odstępów między przyciskami

        add(labelPlatnosc, gbc); gbc.gridy = 1;
        add(labelPlatnosc2, gbc); gbc.gridy = 2;
        add(buttonPowrot, gbc);
    }

}
