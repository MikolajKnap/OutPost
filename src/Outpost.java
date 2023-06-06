import java.util.ArrayList;
import java.util.Iterator;

import outPost.PaczkomatGUI;
import outPost.PanelOutpost;
import outPost.Ramka;
import outPost.paczki.Paczka;

public class Outpost {
    Ramka ramka = new Ramka();
    ArrayList<PaczkomatGUI> paczkomaty = new ArrayList<>();
    PanelOutpost panelOutpost = new PanelOutpost();
    PanelCentrala panelCentrala = new PanelCentrala();
    

    public static void main(String[] args) {
        Outpost outpost = new Outpost();

        PaczkomatGUI paczkomat1 = new PaczkomatGUI("Paczkomat Krakow 1111", "1111");
        PaczkomatGUI paczkomat2 = new PaczkomatGUI("Paczkomat Myslenice 2222", "2222"); // <3

        outpost.paczkomaty.add(paczkomat1);
        outpost.paczkomaty.add(paczkomat2);
    }

    public Outpost() {

        panelCentrala.przyciskBazowy.addActionListener(e -> {
            przeslijPaczki(panelCentrala.poleWysylka.getText());
        });

        ramka.setTitle("CENTRALA");
        ramka.add(panelOutpost);
        ramka.add(panelCentrala);
        ramka.setVisible(true);
    }

    void przeslijPaczki(String kod) {
        PaczkomatGUI paczkomat = znajdzPaczkomatZaPomocaKodu(kod);
        if (paczkomat != null) {
            ArrayList<Paczka> listaPaczek = new ArrayList<>(paczkomat.getListaPaczek()); // Create a copy of the list
            Iterator<Paczka> iterator = listaPaczek.iterator();
            while (iterator.hasNext()) {
                Paczka paczka = iterator.next();
                PaczkomatGUI paczkomatDocelowy = znajdzPaczkomatZaPomocaKodu(paczka.getKodPaczkomatuDocelowego());
                /* no trzeba sprawdzic czy w ogole istnieje taki paczkomat docelowy, a jesli istnieje to czy
                 paczkomat docelowy nie jest tym w ktorym jestesmy */
                paczka.setDostarczona(paczkomatDocelowy.getKodPaczkomatu() == paczkomat.getKodPaczkomatu());
                if (paczkomatDocelowy != null && !paczka.isDostarczona()) {
                    paczka.setDostarczona(true);
                    paczkomatDocelowy.getListaPaczek().add(paczka);
                    iterator.remove();
                }
            }
            paczkomat.setListaPaczek(listaPaczek);
        }
    }
    

    PaczkomatGUI znajdzPaczkomatZaPomocaKodu(String kod) {
        for (PaczkomatGUI paczkomat : paczkomaty) {
            if (kod.equals(paczkomat.getKodPaczkomatu())) {
                return paczkomat;
            }
        }
        return null;
    }

}