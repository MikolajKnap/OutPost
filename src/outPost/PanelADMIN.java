package outPost;

import javax.swing.*;

import outPost.buttons.PrzyciskBazowy;
import outPost.paczki.Paczka;

import java.awt.*;
import java.util.ArrayList;

public class PanelADMIN extends JPanel {
     JPanel panelPaczki;
     JLabel labelADMIN;
     JLabel labelPaczki;
     JButton buttonPowrot;


     ArrayList<Paczka> listaPaczek;

    public PanelADMIN() {
        setBackground(PaczkomatGUI.kolorTlaTytulu);
        setLayout(new BorderLayout());
        listaPaczek = new ArrayList<>();

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

        // Scroll do paczek
        JScrollPane scrollPane = new JScrollPane(panelPaczki);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        // ButtonPowrot
        buttonPowrot = new PrzyciskBazowy("Powrót");

        add(labelADMIN, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(buttonPowrot, BorderLayout.SOUTH);
    }

    void setTekstPaczek() {
        // Dodanie paczek do wyswietlenia (tymczasowe)
        String paczki = "<html> ";
        for (Paczka p: listaPaczek) {
            paczki += p.toString() + "<br>";
        }
        paczki += "</html>";

        System.out.println(listaPaczek.toString());
        labelPaczki.setText(paczki);
        panelPaczki.add(labelPaczki, BorderLayout.NORTH);
    }
}
