package outPost;

import outPost.fields.PoleTekstoweBazowe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelOdbioru extends JPanel {
    private PanelPowrotZatwierdz dolnyPanel;
    private PoleTekstoweBazowe poleTelefon, poleKodOdbioru;

    public PanelOdbioru() {
        setLayout(new GridBagLayout());
        setBackground(PaczkomatGUI.kolorTlaTytulu);

        // Tworze panel dolny(przycsik powrot i zatwierdz) i dodaje onClicki
        dolnyPanel = new PanelPowrotZatwierdz();

        // -----------------Action Listenery Przyciskow----------------------
        dolnyPanel.buttonPowrot.addActionListener(e -> {
            PaczkomatGUI.ramka.remove(this);
            PaczkomatGUI.ramka.add(PaczkomatGUI.panelGlowny);
            PaczkomatGUI.ramka.revalidate();
            PaczkomatGUI.ramka.repaint();
        });

        // Zatwierdz onClick() wyswietla wpisane dane
        dolnyPanel.buttonZatwierdz.addActionListener(e -> {
            System.out.println(String.format("Kod odbioru: %s\nNr telefonu: %s",
                    poleKodOdbioru.getText(), poleTelefon.getText()));

            // Sprawdzanie czy kodOdbioru sie zgadza
            // Jesli nie to wyswietlic komunikat (jesli jest taka opcja w swingu) ze kod odbioru bledny
            // (jesli nie ma takiej opcji w swingu to zrobimy inny panel ktory bedzie mial napisane ze nie ma)
            // Tutaj zakladamy na razie ze jest taka skrytka
            PaczkomatGUI.ramka.remove(this);
            PaczkomatGUI.ramka.add(PaczkomatGUI.panelOtwarciaSkrytki);
            PaczkomatGUI.ramka.revalidate();
            PaczkomatGUI.ramka.repaint();
            // Zamkniecie po 5 sekundach
            // Z pomoca chatu napisane wyglada fajnie i dziala
            // Bo inne sposoby zawieszaly GUI
            Timer timer = new Timer(5000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    PaczkomatGUI.ramka.remove(PaczkomatGUI.panelOtwarciaSkrytki);
                    PaczkomatGUI.ramka.add(PaczkomatGUI.panelGlowny);
                    PaczkomatGUI.ramka.revalidate();
                    PaczkomatGUI.ramka.repaint();
                }
            });
            timer.setRepeats(false);
            timer.start();
        });

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
