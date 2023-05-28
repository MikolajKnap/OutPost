package outPost;

import java.awt.BorderLayout;
import java.awt.Color;

public class PaczkomatGUI {
    static final Color kolorTlaTytulu = new Color(255, 224, 179);
    static final Color kolorPrzyciskow = new Color(255, 218, 137);
    static final PanelOutpost panelOutpost = new PanelOutpost();
    static final Ramka ramka =  new Ramka();
    static final PanelGlowny panelGlowny = new PanelGlowny();
    static final PanelWybierzPaczke panelWybierzPaczke = new PanelWybierzPaczke();
    static final PanelDanePaczki panelDanePaczki = new PanelDanePaczki();
    static final PanelPowrotZatwierdz panelPowrotZatwierdz = new PanelPowrotZatwierdz();

    public static void main(String[] args) {
        ramka.add(panelOutpost, BorderLayout.NORTH);
        ramka.add(panelGlowny, BorderLayout.CENTER);
        ramka.setVisible(true);
    }
}