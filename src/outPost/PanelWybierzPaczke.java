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
public class PanelWybierzPaczke extends JPanel {
    private JLabel napisWyboru;
    private JButton buttonXXL;
    private JButton buttonM;
    private JButton buttonS;
    private JButton przyciskPowrot;

    public PanelWybierzPaczke() {
        setBackground(PaczkomatGUI.kolorTlaTytulu);
        setLayout(new GridBagLayout());

        // Tworze przycisk powrot i ustawiam jego onClick
        przyciskPowrot = new PrzyciskPowrot();
        przyciskPowrot.addActionListener(e -> {
            PaczkomatGUI.ramka.remove(this);
            PaczkomatGUI.ramka.add(PaczkomatGUI.panelGlowny, BorderLayout.CENTER);
            PaczkomatGUI.ramka.revalidate();
            PaczkomatGUI.ramka.repaint();
        });

        // Napis wyboru
        napisWyboru = new JLabel("Wybierz rozmiar paczki!");
        napisWyboru.setFont(new Font(Font.DIALOG, Font.PLAIN, 30));
        napisWyboru.setHorizontalAlignment(JLabel.CENTER);

        // Tworzenie button1 - XXL
        buttonXXL = new JButton("XXL");
        buttonXXL.setBackground(PaczkomatGUI.kolorPrzyciskow);
        buttonXXL.setForeground(Color.DARK_GRAY);
        buttonXXL.setFont(new Font("Tahoma", Font.BOLD, 32));
        buttonXXL.setFocusPainted(false);

        // // Tworzenie button2 - M
        buttonM = new JButton("M");
        buttonM.setBackground(PaczkomatGUI.kolorPrzyciskow);
        buttonM.setForeground(Color.DARK_GRAY);
        buttonM.setFont(new Font("Tahoma", Font.BOLD, 32));
        buttonM.setFocusPainted(false);

        // // Tworzenie button3 - S
        buttonS = new JButton("S");
        buttonS.setBackground(PaczkomatGUI.kolorPrzyciskow);
        buttonS.setForeground(Color.DARK_GRAY);
        buttonS.setFont(new Font("Tahoma", Font.BOLD, 32));
        buttonS.setFocusPainted(false);

        // Ustawienie preferowanych rozmiarów przycisków
        buttonXXL.setPreferredSize(new Dimension(500, 80));
        buttonM.setPreferredSize(new Dimension(500, 80));
        buttonS.setPreferredSize(new Dimension(500, 80));

        // ButtonXXL onClick
        buttonXXL.addActionListener(e -> {
            // ustaw paczke na XXL
            // przejdz do kolejnego panelu czyli do PanelDanePaczki
            PaczkomatGUI.ramka.remove(this);
            PaczkomatGUI.ramka.add(PaczkomatGUI.panelDanePaczki);
            PaczkomatGUI.ramka.revalidate();
            PaczkomatGUI.ramka.repaint();
        });

        // ButtonM onClick
        buttonM.addActionListener(e -> {
            // ustaw paczke na M
            // przejdz do kolejnego panelu czyli do PanelDanePaczki
            PaczkomatGUI.ramka.remove(this);
            PaczkomatGUI.ramka.add(PaczkomatGUI.panelDanePaczki);
            PaczkomatGUI.ramka.revalidate();
            PaczkomatGUI.ramka.repaint();
        });

        // ButtonS onClick
        buttonS.addActionListener(e -> {
            // ustaw paczke na S
            // przejdz do kolejnego panelu czyli do PanelDanePaczki
            PaczkomatGUI.ramka.remove(this);
            PaczkomatGUI.ramka.add(PaczkomatGUI.panelDanePaczki);
            PaczkomatGUI.ramka.revalidate();
            PaczkomatGUI.ramka.repaint();
        });

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


