package outPost;

import outPost.fields.PoleTekstoweBazowe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelOdbioru extends JPanel {
    PanelPowrotZatwierdz dolnyPanel;
    PoleTekstoweBazowe poleTelefon, poleKodOdbioru;

    public PanelOdbioru() {
        setLayout(new GridBagLayout());
        setBackground(PaczkomatGUI.kolorTlaTytulu);

        // Tworze panel dolny(przycsik powrot i zatwierdz) i dodaje onClicki
        dolnyPanel = new PanelPowrotZatwierdz();


        // --------------------------Napisy--------------------------------
        // Napis kodu odbioru
        JLabel napisOdbioru = new JLabel("Wpisz kod odbioru:");
        napisOdbioru.setFont(new Font(Font.DIALOG, Font.BOLD, 20));
        napisOdbioru.setHorizontalAlignment(JLabel.CENTER);

        // Napis nr telefonu
        JLabel napisTelefon  = new JLabel("Wpisz swój numer telefonu:");
        napisTelefon.setFont(new Font(Font.DIALOG, Font.BOLD, 20));
        napisTelefon.setHorizontalAlignment(JLabel.CENTER);


        // --------------------------Pola input------------------------------
        // Stworzenie trzech inputow
        poleTelefon = new PoleTekstoweBazowe();
        poleKodOdbioru = new PoleTekstoweBazowe();

        // ---------------------------Grid--------------------------------

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 0); // Ustawienie odstępów między przyciskami

        // grid y, ustawia wiersz w jakim ma byc element
        gbc.gridy = 1;
        add(napisOdbioru,gbc);

        gbc.gridy = 2;
        add(poleKodOdbioru, gbc);

        gbc.gridy = 3;
        add(napisTelefon,gbc);

        gbc.gridy = 4;
        add(poleTelefon, gbc);

        gbc.gridy = 7;
        add(dolnyPanel, gbc);
    }
}
