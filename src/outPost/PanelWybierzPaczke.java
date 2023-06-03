package outPost;
import outPost.buttons.PrzyciskBazowy;
import outPost.buttons.PrzyciskPowrot;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class PanelWybierzPaczke extends JPanel {
    JLabel napisWyboru;
    PrzyciskBazowy buttonXXL,buttonM,buttonS;
    JButton przyciskPowrot;

    public PanelWybierzPaczke() {
        setBackground(PaczkomatGUI.kolorTlaTytulu);
        setLayout(new GridBagLayout());

        // ------------------------Napisy----------------------------

        // Napis wyboru
        napisWyboru = new JLabel("Wybierz rozmiar paczki!");
        napisWyboru.setFont(new Font(Font.DIALOG, Font.PLAIN, 30));
        napisWyboru.setHorizontalAlignment(JLabel.CENTER);


        // ------------------------Przyciski----------------------------

        // Tworzenie button1 - XXL
        buttonXXL = new PrzyciskBazowy("XXL");

        // Tworzenie button2 - M
        buttonM = new PrzyciskBazowy("M");

        // Tworzenie button3 - S
        buttonS = new PrzyciskBazowy("S");

        // Tworzenie button4 - Powrot
        przyciskPowrot = new PrzyciskPowrot();

        // Ustawienie preferowanych rozmiarów przycisków
        buttonXXL.setPreferredSize(new Dimension(150, 50));
        buttonM.setPreferredSize(new Dimension(150, 50));
        buttonS.setPreferredSize(new Dimension(150, 50));

        // ---------------------------Grid--------------------------------

        // To sprawia ze mozemy ulozyc elementy w gridzie
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 30, 0); // Ustawienie odstępów między przyciskami

        gbc.gridy = 0; // wiersz 0 - to sprawia ze te 4 elementy nie nachodza na siebie a są pod sobą
        add(napisWyboru, gbc);
        gbc.gridy = 1; // wiersz 1
        add(buttonXXL, gbc);
        gbc.gridy = 2; // wiersz 2
        add(buttonM, gbc);
        gbc.gridy = 3; // wiersz 3
        add(buttonS, gbc);
        gbc.gridy = 4; // wiersz 4
        add(przyciskPowrot, gbc);
    }
}


