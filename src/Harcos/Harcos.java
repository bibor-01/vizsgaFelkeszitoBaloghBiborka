package Harcos;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Harcos extends Karakter implements Iterable<Eszkoz> {

    private int ero, ugyesseg;

    public Harcos(int ero, int ugyesseg, String nev, String faj) {
        super(nev, faj);
        this.ero = ero;
        this.ugyesseg = ugyesseg;
    }

    public int getEro() {
        return ero;
    }

    public int getUgyesseg() {
        return ugyesseg;
    }

    @Override
    public void felveszEszkoz(Eszkoz eszkozFelvesz) {
        eszkozok.add(eszkozFelvesz);
    }

    @Override
    public void eldobEszkoz(int index) {
        eszkozok.remove(index);
    }

    @Override
    public void eldobEszkoz(Eszkoz eszkozEldob) {
        eldobEszkoz(eszkozok.indexOf(eszkozEldob));
    }

    @Override
    public List<Eszkoz> rendezEszkoz() {
        Collections.sort(eszkozok);
        return Collections.unmodifiableList(eszkozok);
    }

    @Override
    public Iterator<Eszkoz> iterator() {
        return eszkozok.iterator();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Harcos{" + "\nnev=" + this.getNev() + "\nfaj=" + this.getFaj());
        sb.append("\nerő=" + ero + "\nügyesség=" + ugyesseg + "\neszkozok=");
        sb.append(rendezEszkoz() + "\n}");
        return sb.toString();
    }
}
