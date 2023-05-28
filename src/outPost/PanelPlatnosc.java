package outPost;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import outPost.buttons.PrzyciskBazowy;
import outPost.buttons.PrzyciskPowrot;

public class PanelPlatnosc extends JPanel {
    private JButton buttonPowrot;
    private JButton buttonZaplac;
    private JLabel labelKwota;
    private double kwotaDoZaplaty;

    public PanelPlatnosc() {
        setLayout(new GridBagLayout());
        setBackground(PaczkomatGUI.kolorTlaTytulu);
        kwotaDoZaplaty = 19.99;

        // Buttony
        buttonPowrot = new PrzyciskPowrot();
        buttonZaplac = new PrzyciskBazowy("ZAPLAC KARTA");

        // Powrot onClick
        buttonPowrot.addActionListener(e -> {
            PaczkomatGUI.ramka.remove(this);
            PaczkomatGUI.ramka.add(PaczkomatGUI.panelDanePaczki);
            PaczkomatGUI.ramka.revalidate();
            PaczkomatGUI.ramka.repaint();
        });

        buttonZaplac.addActionListener(e -> {
            PaczkomatGUI.ramka.remove(this);
            PaczkomatGUI.ramka.add(PaczkomatGUI.panelKoniecNadania);
            PaczkomatGUI.ramka.revalidate();
            PaczkomatGUI.ramka.repaint(); 
        });

        // Label z wyswietlona kwota do zaplaty
        labelKwota = new JLabel("KWOTA DO ZAPLATY: " + kwotaDoZaplaty);
        labelKwota.setFont(new Font(Font.DIALOG, Font.BOLD, 28));
        labelKwota.setHorizontalAlignment(JLabel.CENTER);

        // Ulozenie elementow na gridzie
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 0); // Ustawienie odstępów między przyciskami
        
        add(labelKwota, gbc); gbc.gridy = 1;
        add(buttonZaplac, gbc); gbc.gridy = 2;
        add(buttonPowrot, gbc);
    }
}
