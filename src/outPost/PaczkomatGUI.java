package outPost;

import javax.swing.*;
import java.awt.*;

public class PaczkomatGUI{
    static final Color kolorTlaTytulu = new Color(255, 224, 179);
    static final Color kolorPrzyciskow = new Color(255, 218, 137);
    public static void main(String[] args) {
        // Tworzenie okna
        JFrame frame = new JFrame("Paczkomat");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout());

        // Napis tytul
        JLabel tytul = new JLabel("OutPost");
        tytul.setFont(new Font(Font.DIALOG, Font.BOLD, 50));
        tytul.setHorizontalAlignment(JLabel.CENTER);

        // Napis wyboru
        JLabel napisWyboru = new JLabel("Co chciałbyś dzisiaj zrobić?");
        napisWyboru.setFont(new Font(Font.DIALOG, Font.PLAIN, 30));
        napisWyboru.setHorizontalAlignment(JLabel.CENTER);

        // Panel text
        JPanel textPanel = new JPanel();
        textPanel.setLayout(new GridLayout(2, 1));
        textPanel.setBackground(kolorTlaTytulu);

        // Dodanie napisów do panelu text
        textPanel.add(tytul);
        textPanel.add(napisWyboru);

        // Dodanie panelu text do okna
        frame.add(textPanel, BorderLayout.NORTH);

        // Tworzenie button1 - odbierz paczke
        JButton buttonOdbierz = new JButton("Odbierz paczkę");
        buttonOdbierz.setBackground(kolorPrzyciskow);
        buttonOdbierz.setForeground(Color.DARK_GRAY);
        buttonOdbierz.setFont(new Font("Tahoma", Font.BOLD, 32));
        buttonOdbierz.setFocusPainted(false);

        // Tworzenie button2 - odbierz paczke
        JButton buttonNadaj = new JButton("Nadaj paczkę");
        buttonNadaj.setBackground(kolorPrzyciskow);
        buttonNadaj.setForeground(Color.DARK_GRAY);
        buttonNadaj.setFont(new Font("Tahoma", Font.BOLD, 32));
        buttonNadaj.setFocusPainted(false);

        // Tworzenie panelu dla przycisków
        JPanel buttonPanel = new JPanel(new GridBagLayout());
        buttonPanel.setBackground(kolorTlaTytulu);

        // Ustawienie preferowanych rozmiarów przycisków
        buttonOdbierz.setPreferredSize(new Dimension(500, 80));
        buttonNadaj.setPreferredSize(new Dimension(500, 80));

        // Ustawienie przycisków w panelu przy użyciu GridBagLayout
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 0, 60, 0); // Ustawienie odstępów między przyciskami
        buttonPanel.add(buttonOdbierz, gbc);

        gbc.gridy = 1;
        buttonPanel.add(buttonNadaj, gbc);

        // Dodanie panelu z przyciskami do okna
        frame.add(buttonPanel, BorderLayout.CENTER);

        // Wyświetlanie okna
        frame.setVisible(true);

    }

}