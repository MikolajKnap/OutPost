package outPost;

import java.awt.BorderLayout;
import java.awt.Color;


public class PaczkomatGUI {
    static final Color kolorTlaTytulu = new Color(255, 224, 179);
    static final Color kolorPrzyciskow = new Color(255, 218, 137);
    public static void main(String[] args) {
        // Ramka i PanelOutpost - cos co zawsze ma byc na ekranie
        Ramka ramka =  new Ramka();
        PanelOutpost panelOutpost = new PanelOutpost();
        ramka.add(panelOutpost, BorderLayout.NORTH);

        // Panel Głowny
        PanelGlowny panelGlowny = new PanelGlowny();
        PrzyciskADMIN przyciskADMIN = new PrzyciskADMIN();
        ramka.add(panelGlowny, BorderLayout.CENTER);
        ramka.add(przyciskADMIN, BorderLayout.SOUTH);

        ramka.setVisible(true);
    }
}