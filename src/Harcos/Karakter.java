package Harcos;

import java.util.ArrayList;

public abstract class Karakter {

    private String nev, faj;
    final ArrayList<Eszkoz> eszkozok;

    public Karakter(String nev, String faj) {
        this.nev = nev;
        this.faj = faj;
        eszkozok = new ArrayList<>();
    }

    public String getNev() {
        return nev;
    }

    public String getFaj() {
        return faj;
    }

    @Override
    public abstract String toString();

}
