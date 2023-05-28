package outPost;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;


import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelDanePaczki extends JPanel{
    private String nrTelefonuNadawcy;
    private String nrTelefonuOdbiorcy;
    private String kodPaczkomatu;
    private PanelPowrotZatwierdz dolnyPanel;
    private JTextField poleTelefonNadawcy;
    private JTextField poleTelefonOdbiorcy; 
    private JTextField poleKodPaczkomatu;

    public PanelDanePaczki() {
        setLayout(new GridBagLayout());
        setBackground(PaczkomatGUI.kolorTlaTytulu);

        // Tworze panel dolny(przycsik powrot i zatwierdz) i dodaje onClicki
        dolnyPanel = new PanelPowrotZatwierdz();
        dolnyPanel.buttonPowrot.addActionListener(e -> {
            PaczkomatGUI.ramka.remove(this);
            PaczkomatGUI.ramka.add(PaczkomatGUI.panelWybierzPaczke);
            PaczkomatGUI.ramka.revalidate();
            PaczkomatGUI.ramka.repaint();
        });

        // Zatwierdz onClick() wyswietla wpisane dane
        dolnyPanel.buttonZatwierdz.addActionListener(e -> {
            System.out.println(String.format("Nr telefonu nadawcy: %s\nNr telefonu odbiorcy: %s\nKod Paczkomatu: %s",
            poleTelefonNadawcy.getText(), poleTelefonOdbiorcy.getText(), poleKodPaczkomatu.getText()));
        });

        // Napis NrNadawcy
        JLabel napisTelefonNadawcy = new JLabel("Wpisz swoj numer:");
        napisTelefonNadawcy.setFont(new Font(Font.DIALOG, Font.BOLD, 20));
        napisTelefonNadawcy.setHorizontalAlignment(JLabel.CENTER);
        // Napis NrOdbiorcy
        JLabel napisTelefonOdbiorcy  = new JLabel("Wpisz numer odbiorcy:");
        napisTelefonOdbiorcy.setFont(new Font(Font.DIALOG, Font.BOLD, 20));
        napisTelefonOdbiorcy.setHorizontalAlignment(JLabel.CENTER);
        // Napis kodPaczkomatu
        JLabel napisKodPaczkomatu  = new JLabel("Wpisz kod paczkomatu:");
        napisKodPaczkomatu .setFont(new Font(Font.DIALOG, Font.BOLD, 20));
        napisKodPaczkomatu .setHorizontalAlignment(JLabel.CENTER);

        // Stworzenie trzech inputow
        poleTelefonNadawcy = new JTextField();
        poleTelefonOdbiorcy = new JTextField();
        poleKodPaczkomatu = new JTextField();

        poleKodPaczkomatu.setFont(new Font("Tahoma", Font.BOLD, 13));
        poleTelefonNadawcy.setFont(new Font("Tahoma", Font.BOLD, 13));
        poleTelefonOdbiorcy.setFont(new Font("Tahoma", Font.BOLD, 13));

        poleKodPaczkomatu.setHorizontalAlignment(JTextField.CENTER);
        poleTelefonNadawcy.setHorizontalAlignment(JTextField.CENTER);
        poleTelefonOdbiorcy.setHorizontalAlignment(JTextField.CENTER);

        poleKodPaczkomatu.setPreferredSize(new Dimension(200, 40));
        poleTelefonNadawcy.setPreferredSize(new Dimension(200, 40));
        poleTelefonOdbiorcy.setPreferredSize(new Dimension(200, 40));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 0); // Ustawienie odstępów między przyciskami

        // grid y, ustawia wiersz w jakim ma byc element
        gbc.gridy = 1;
        add(napisTelefonNadawcy,gbc);
        gbc.gridy = 2;
        add(poleTelefonNadawcy, gbc);
        gbc.gridy = 3;
        add(napisTelefonOdbiorcy,gbc);
        gbc.gridy = 4;
        add(poleTelefonOdbiorcy, gbc);
        gbc.gridy = 5;
        add(napisKodPaczkomatu, gbc);
        gbc.gridy = 6;
        add(poleKodPaczkomatu, gbc);
        gbc.gridy = 7;
        add(dolnyPanel, gbc);
    }
}
