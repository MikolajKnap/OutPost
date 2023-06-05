package outPost.paczki;

import java.io.Serializable;

public abstract class Paczka implements Serializable {
    protected double rozmiarWysokosc;
    protected double rozmiarSzerokosc;
    protected double rozmiarGlebokosc;

    protected String numerTelefonuOdbiorcy;
    protected String numerTelefonuNadawcy;

    protected String kodPaczkomatuDocelowego;
    protected String kodPaczkomatuNadajcego;

    protected boolean dostarczona;
    protected boolean odebrana;

    protected String kodOdbioru;

    public Paczka(String numerTelefonuOdbiorcy,
                  String numerTelefonuNadawcy,
                  String kodPaczkomatuDocelowego,
                  String kodPaczkomatuNadajcego,
                  boolean dostarczona,
                  String kodOdbioru) {
        this.numerTelefonuOdbiorcy = numerTelefonuOdbiorcy;
        this.numerTelefonuNadawcy = numerTelefonuNadawcy;
        this.kodPaczkomatuDocelowego = kodPaczkomatuDocelowego;
        this.kodPaczkomatuNadajcego = kodPaczkomatuNadajcego;
        this.dostarczona = dostarczona;
        this.kodOdbioru = kodOdbioru;
        this.odebrana = false;
    }
    public Paczka() {};

    @Override
    public String toString() {
        return "Paczka\n" +
                "numerOdbiorcy =" + numerTelefonuOdbiorcy +
                " numerNadawcy =" + numerTelefonuNadawcy +
                " kodPaczkomatuDoc =" + kodPaczkomatuDocelowego +
                " czyDostarczona =" + isDostarczona() +
                " czyOdebrana = " + isOdebrana();
    }

    public double getRozmiarWysokosc() {
        return rozmiarWysokosc;
    }

    public double getRozmiarSzerokosc() {
        return rozmiarSzerokosc;
    }

    public double getRozmiarGlebokosc() {
        return rozmiarGlebokosc;
    }

    public String getNumerTelefonuOdbiorcy() {
        return numerTelefonuOdbiorcy;
    }

    public String getNumerTelefonuNadawcy() {
        return numerTelefonuNadawcy;
    }

    public String getKodPaczkomatuDocelowego() {
        return kodPaczkomatuDocelowego;
    }

    public String getKodPaczkomatuNadajcego() {
        return kodPaczkomatuNadajcego;
    }

    public boolean isDostarczona() {
        return dostarczona;
    }

    public String getKodOdbioru() {
        return kodOdbioru;
    }

    public void setNumerTelefonuOdbiorcy(String numerTelefonuOdbiorcy) {
        this.numerTelefonuOdbiorcy = numerTelefonuOdbiorcy;
    }

    public void setNumerTelefonuNadawcy(String numerTelefonuNadawcy) {
        this.numerTelefonuNadawcy = numerTelefonuNadawcy;
    }

    public void setKodPaczkomatuDocelowego(String kodPaczkomatuDocelowego) {
        this.kodPaczkomatuDocelowego = kodPaczkomatuDocelowego;
    }
    public void setRozmiarWysokosc(double rozmiarWysokosc) {
        this.rozmiarWysokosc = rozmiarWysokosc;
    }
    public void setRozmiarSzerokosc(double rozmiarSzerokosc) {
        this.rozmiarSzerokosc = rozmiarSzerokosc;
    }
    public void setRozmiarGlebokosc(double rozmiarGlebokosc) {
        this.rozmiarGlebokosc = rozmiarGlebokosc;
    }
    public void setKodPaczkomatuNadajcego(String kodPaczkomatuNadajcego) {
        this.kodPaczkomatuNadajcego = kodPaczkomatuNadajcego;
    }
    public void setDostarczona(boolean dostarczona) {
        this.dostarczona = dostarczona;
    }
    public void setKodOdbioru(String kodOdbioru) {
        this.kodOdbioru = kodOdbioru;
    }

    public boolean isOdebrana() {
        return odebrana;
    }

    public void setOdebrana(boolean odebrana) {
        this.odebrana = odebrana;
    }
}
