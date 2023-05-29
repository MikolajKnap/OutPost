package outPost;

import javax.swing.JPanel;

import outPost.fields.PoleTekstoweBazowe;
import javax.swing.*;
import java.awt.*;

public class PanelPIN extends JPanel {
    private PanelPowrotZatwierdz dolnyPanel;
    private PoleTekstoweBazowe polePIN;
    private final String PIN;
    public PanelPIN() {
        PIN =  "1234";
        setLayout(new GridBagLayout());
        setBackground(PaczkomatGUI.kolorTlaTytulu);

        // Tworze panel dolny(przycsik powrot i zatwierdz) i dodaje onClicki
        dolnyPanel = new PanelPowrotZatwierdz();

        // --------------------------Napisy--------------------------------
        JLabel napisPIN = new JLabel("WPROWADZ PIN:");
        napisPIN.setFont(new Font(Font.DIALOG, Font.BOLD, 20));
        napisPIN.setHorizontalAlignment(JLabel.CENTER);

        JLabel napisZlyPIN = new JLabel("WPROWADZONO ZLY PIN, SPROBÓJ PONOWNIE");
        napisZlyPIN.setFont(new Font(Font.DIALOG, Font.BOLD, 20));
        napisZlyPIN.setHorizontalAlignment(JLabel.CENTER);
        napisZlyPIN.setForeground(Color.RED);


        // --------------------------Pola input------------------------------
        polePIN = new PoleTekstoweBazowe();

        // ---------------------------Grid--------------------------------
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 0); // Ustawienie odstępów między przyciskami

        // grid y, ustawia wiersz w jakim ma byc element
        add(napisPIN, gbc);
        gbc.gridy = 1;
        add(polePIN, gbc);
        gbc.gridy = 2;
        add(dolnyPanel, gbc);
        gbc.gridy = 3;

        // -----------------Action Listenery Przyciskow----------------------
        dolnyPanel.buttonPowrot.addActionListener(e -> {
            remove(napisZlyPIN);
            PaczkomatGUI.ramka.remove(this);
            PaczkomatGUI.ramka.add(PaczkomatGUI.panelGlowny);
            PaczkomatGUI.ramka.revalidate();
            PaczkomatGUI.ramka.repaint();
        });

        // Zatwierdz onClick() wyswietla wpisane dane
        dolnyPanel.buttonZatwierdz.addActionListener(e -> {
            if (polePIN.getText().equals(PIN)) {
                remove(napisZlyPIN);
                PaczkomatGUI.ramka.remove(this);
                PaczkomatGUI.ramka.add(PaczkomatGUI.panelADMIN);
                PaczkomatGUI.ramka.revalidate();
                PaczkomatGUI.ramka.repaint();
            }
            else {
                add(napisZlyPIN, gbc);
                PaczkomatGUI.ramka.revalidate();
                PaczkomatGUI.ramka.repaint();
            }
        });
    }
}
