package outPost;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelGlowny extends JPanel{
    public JLabel napisWyboru;
    public JButton buttonOdbierz;
    public JButton buttonNadaj;

    public PanelGlowny() {
        setBackground(PaczkomatGUI.kolorTlaTytulu);
        setLayout(new GridBagLayout());
        // Napis wyboru
        napisWyboru = new JLabel("Co chciałbyś dzisiaj zrobić?");
        napisWyboru.setFont(new Font(Font.DIALOG, Font.PLAIN, 30));
        napisWyboru.setHorizontalAlignment(JLabel.CENTER);

        // Tworzenie button1 - odbierz paczke
        buttonOdbierz = new JButton("Odbierz paczkę");
        buttonOdbierz.setBackground(PaczkomatGUI.kolorPrzyciskow);
        buttonOdbierz.setForeground(Color.DARK_GRAY);
        buttonOdbierz.setFont(new Font("Tahoma", Font.BOLD, 32));
        buttonOdbierz.setFocusPainted(false);

        // // Tworzenie button2 - odbierz paczke
        buttonNadaj = new JButton("Nadaj paczkę");
        buttonNadaj.setBackground(PaczkomatGUI.kolorPrzyciskow);
        buttonNadaj.setForeground(Color.DARK_GRAY);
        buttonNadaj.setFont(new Font("Tahoma", Font.BOLD, 32));
        buttonNadaj.setFocusPainted(false);

        buttonNadaj.addActionListener(e -> {
            PaczkomatGUI.ramka.remove(this);
            PaczkomatGUI.ramka.remove(PaczkomatGUI.przyciskADMIN);
            PaczkomatGUI.ramka.add(PaczkomatGUI.panelWybierzPaczke, BorderLayout.CENTER);
            PaczkomatGUI.ramka.add(PaczkomatGUI.przyciskPowrot, BorderLayout.SOUTH);
            PaczkomatGUI.ramka.revalidate();
            PaczkomatGUI.ramka.repaint();
        });

    
        // Ustawienie preferowanych rozmiarów przycisków
        buttonOdbierz.setPreferredSize(new Dimension(500, 80));
        buttonNadaj.setPreferredSize(new Dimension(500, 80));

        // To sprawia ze mozemy ulozyc elementy w gridzie
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 30, 0); // Ustawienie odstępów między przyciskami

        gbc.gridy = 0; // wiersz 0 - to sprawia ze te 3 elementy nie nachodza na siebie a są pod sobą
        add(napisWyboru, gbc);
        gbc.gridy = 1; // wiersz 1
        add(buttonOdbierz, gbc);
        gbc.gridy = 2; // wiersz 2
        add(buttonNadaj, gbc);

    }
    void buttonNadajOnClick() {

    }
}
