package outPost;

import javax.swing.*;

import outPost.buttons.PrzyciskBazowy;

import java.awt.*;

public class PanelADMIN extends JPanel {
    private JPanel panelPaczki;
    private JLabel labelADMIN;
    private JLabel labelPaczki;
    private JButton buttonPowrot;

    public PanelADMIN() {
        setBackground(PaczkomatGUI.kolorTlaTytulu);
        setLayout(new BorderLayout());

        // Header
        labelADMIN = new JLabel("PACZKI W PACZKOMACIE:");
        labelADMIN.setFont(new Font(Font.DIALOG, Font.BOLD, 28));
        labelADMIN.setHorizontalAlignment(JLabel.CENTER);
        labelADMIN.setForeground(Color.RED);

        // Panel na wyswietlanie listy paczek
        panelPaczki = new JPanel(new BorderLayout());
        panelPaczki.setBackground(PaczkomatGUI.kolorTlaTytulu);

        // Label do paczek
        labelPaczki = new JLabel();
        labelPaczki.setFont(new Font(Font.MONOSPACED, Font.BOLD, 18));
        labelPaczki.setHorizontalAlignment(JLabel.CENTER);

        // Dodanie paczek do wyswietlenia (tymczasowe)
        String paczki = "<html> ";
        for (int i = 0; i < 20; i++) {
            paczki += "SKRYTKA " + i + ": PACZKA DOSTEPNA DO 2023-06-" + i + "<br>";
        }
        paczki += "</html>";
        labelPaczki.setText(paczki);
        panelPaczki.add(labelPaczki, BorderLayout.NORTH);

        // Scroll do paczek
        JScrollPane scrollPane = new JScrollPane(panelPaczki);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        // ButtonPowrot
        buttonPowrot = new PrzyciskBazowy("Powrót");

        // ButtonPowrot onClick
        buttonPowrot.addActionListener(e -> {
            PaczkomatGUI.ramka.remove(this);
            PaczkomatGUI.ramka.add(PaczkomatGUI.panelGlowny);
            PaczkomatGUI.ramka.revalidate();
            PaczkomatGUI.ramka.repaint();
        });

        add(labelADMIN, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(buttonPowrot, BorderLayout.SOUTH);
    }
}
