package outPost;

import outPost.paczki.Paczka;
import outPost.paczki.PaczkaXXL;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class PaczkomatGUI {
    static final public Color kolorTlaTytulu = new Color(255, 224, 179);
    static final public Color kolorPrzyciskow = new Color(255, 218, 137);
    final Ramka ramka;
    final PanelPIN panelPIN;
    final PanelADMIN panelADMIN;
    final PanelGlowny panelGlowny;
    final PanelOutpost panelOutpost;
    final PanelOdbioru panelOdbioru;
    final PanelPlatnosc panelPlatnosc;
    final PanelDanePaczki panelDanePaczki;
    final PanelKoniecNadania panelKoniecNadania;
    final PanelWybierzPaczke panelWybierzPaczke;
    final PanelPowrotZatwierdz panelPowrotZatwierdz;
    final PanelOtwarciaSkrytki panelOtwarciaSkrytki;

    // Paczka
    String nrTelefonuNadawcy;
    String nrTelefonuOdbiorcy;
    String kodPaczkomatuDocelowego;

    // Paczkomat
    String kodPaczkomatu;
    ArrayList<Paczka> listaPaczek;


    // ------------------------------- PACZKOMAT ----------------------------------------

   

    public PaczkomatGUI(String nazwaPaczkomatu, String kodPaczkomatu) {
        ramka =  new Ramka();
        panelPIN = new PanelPIN();
        panelADMIN = new PanelADMIN();
        panelGlowny = new PanelGlowny();
        panelOutpost = new PanelOutpost();
        panelOdbioru = new PanelOdbioru();
        panelPlatnosc = new PanelPlatnosc();
        panelDanePaczki = new PanelDanePaczki();
        panelKoniecNadania = new PanelKoniecNadania();
        panelWybierzPaczke = new PanelWybierzPaczke();
        panelPowrotZatwierdz = new PanelPowrotZatwierdz();
        panelOtwarciaSkrytki = new PanelOtwarciaSkrytki();

        ramka.setTitle(nazwaPaczkomatu);
        this.kodPaczkomatu = kodPaczkomatu;
        listaPaczek = new ArrayList<>();


//--------------------------------- ACTION LISTENERY GUI ----------------------------------------

        // ------------------------------- PANEL PIN ----------------------------------------
        panelPIN.dolnyPanel.buttonPowrot.addActionListener(e -> {
            panelPIN.remove(panelPIN.napisZlyPIN);
            ramka.remove(panelPIN);
            ramka.add(panelGlowny);
            redraw();
        });;

        panelPIN.dolnyPanel.buttonZatwierdz.addActionListener(e -> {
            if (panelPIN.polePIN.getText().equals(panelPIN.PIN)) {
                panelPIN.remove(panelPIN.napisZlyPIN);
                ramka.remove(panelPIN);
                ramka.add(panelADMIN);
                redraw();
            }
            else {
                panelPIN.add(panelPIN.napisZlyPIN, panelPIN.gbc);
                redraw();
            }
        });

        // ------------------------------- PANEL ADMIN ----------------------------------------
        panelADMIN.buttonPowrot.addActionListener(e -> {
            ramka.remove(panelADMIN);
            ramka.add(panelGlowny);
            redraw();
        });

        // ------------------------------- PANEL GLOWNY ----------------------------------------
        panelGlowny.buttonNadaj.addActionListener(e -> {
            ramka.remove(panelGlowny);
            ramka.add(panelWybierzPaczke, BorderLayout.CENTER);
            redraw();
        });

        panelGlowny.buttonOdbierz.addActionListener(e -> {
            ramka.remove(panelGlowny);
            ramka.add(panelOdbioru, BorderLayout.CENTER);
            redraw();
        });

        panelGlowny.buttonADMIN.addActionListener(e -> {
            panelADMIN.listaPaczek = listaPaczek;
            panelADMIN.setTekstPaczek();
            System.out.println(listaPaczek.toString());
            ramka.remove(panelGlowny);
            ramka.add(panelPIN);
            redraw();
        });

        // ------------------------------- PANEL KONIEC NADANIA ----------------------------------------
        panelKoniecNadania.buttonPowrot.addActionListener(e -> {
            ramka.remove(panelKoniecNadania);
            ramka.add(panelGlowny);
            redraw();
        });

        // ------------------------------- PANEL ODBIORU ----------------------------------------
        panelOdbioru.dolnyPanel.buttonPowrot.addActionListener(e -> {
            ramka.remove(panelOdbioru);
            ramka.add(panelGlowny);
            redraw();
        });

        panelOdbioru.dolnyPanel.buttonZatwierdz.addActionListener(e -> {
            System.out.println(String.format("Kod odbioru: %s\nNr telefonu: %s",
                    panelOdbioru. poleKodOdbioru.getText(), panelOdbioru.poleTelefon.getText()));

            ramka.remove(panelOdbioru);
            ramka.add(panelOtwarciaSkrytki);
            redraw();
            Timer timer = new Timer(5000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ramka.remove(panelOtwarciaSkrytki);
                    ramka.add(panelGlowny);
                    redraw();
                }
            });
            timer.setRepeats(false);
            timer.start();
        });

        // ------------------------------- PANEL OTWARCIA SKRYTKI ----------------------------------------
        panelOtwarciaSkrytki.buttonPowrot.addActionListener(e -> {
            ramka.remove(panelOtwarciaSkrytki);
            ramka.add(panelGlowny);
            redraw();ramka.repaint();
        });

        // ------------------------------- PANEL PLATNOSC ----------------------------------------
        // ------------------------ DODAWANIE PACZEK DO LISTY TUTAJ ----------------------------------------
        panelPlatnosc.buttonPowrot.addActionListener(e -> {
            ramka.remove(panelPlatnosc);
            ramka.add(panelDanePaczki);
            redraw();
        });

        panelPlatnosc.buttonZaplac.addActionListener(e -> {
            // Dodaj paczke do listyPaczek po zakonczonym nadaniu, do zoptymalizowania
            Paczka paczkaDoNadania = new PaczkaXXL(kodPaczkomatuDocelowego, nrTelefonuNadawcy, nrTelefonuOdbiorcy, kodPaczkomatu);
            listaPaczek.add(paczkaDoNadania);
            

            ramka.remove(panelPlatnosc);
            ramka.add(panelKoniecNadania);
            redraw();
        });

        // ------------------------------- PANEL WYBIERZ PACZKE ----------------------------------------
        panelWybierzPaczke.buttonXXL.addActionListener(e -> {
            ramka.remove(panelWybierzPaczke);
            ramka.add(panelDanePaczki);
            redraw();
        });

        // ButtonM onClick
        panelWybierzPaczke.buttonM.addActionListener(e -> {
            ramka.remove(panelWybierzPaczke);
            ramka.add(panelDanePaczki);
            redraw();
        });

        // ButtonS onClick
        panelWybierzPaczke.buttonS.addActionListener(e -> {
            ramka.remove(panelWybierzPaczke);
            ramka.add(panelDanePaczki);
            redraw();
        });

        panelWybierzPaczke.przyciskPowrot.addActionListener(e -> {
            ramka.remove(panelWybierzPaczke);
            ramka.add(panelGlowny, BorderLayout.CENTER);
            redraw();
        });

        // ------------------------------- PANEL DANE PACZKI ----------------------------------------
        panelDanePaczki.dolnyPanel.buttonPowrot.addActionListener(e -> {
            ramka.remove(panelDanePaczki);
            ramka.add(panelWybierzPaczke);
            redraw();
        });

        panelDanePaczki.dolnyPanel.buttonZatwierdz.addActionListener(e -> {
            System.out.println(String.format("Nr telefonu nadawcy: %s\nNr telefonu odbiorcy: %s\nKod Paczkomatu: %s",
                    panelDanePaczki.poleTelefonNadawcy.getText(), panelDanePaczki.poleTelefonOdbiorcy.getText(), panelDanePaczki.poleKodPaczkomatu.getText()));

            kodPaczkomatuDocelowego = panelDanePaczki.poleKodPaczkomatu.getText();
            nrTelefonuNadawcy = panelDanePaczki.poleTelefonNadawcy.getText();
            nrTelefonuOdbiorcy = panelDanePaczki.poleTelefonOdbiorcy.getText();

            ramka.remove(panelDanePaczki);
            ramka.add(panelPlatnosc);
            redraw();
        });

        ramka.add(panelOutpost, BorderLayout.NORTH);
        ramka.add(panelGlowny, BorderLayout.CENTER);
        ramka.setVisible(true);
    }

    void redraw() {
        ramka.revalidate();
        ramka.repaint();
    }
    public String getKodPaczkomatu() {
        return kodPaczkomatu;
    }
    public ArrayList<Paczka> getListaPaczek() {
        return listaPaczek;
    }

    public void setListaPaczek(ArrayList<Paczka> listaPaczek) {
        this.listaPaczek = listaPaczek;
    }
    
}
