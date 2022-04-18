package Harcos;

import java.util.ArrayList;
import java.util.List;

public abstract class Karakter implements java.io.Serializable{

    private String nev, faj;
    final ArrayList<Eszkoz> eszkozok;

    public Karakter(String nev, String faj) {
        this.nev = nev;
        this.faj = faj;
        eszkozok = new ArrayList<>();
        if (nev.length() < 3) {
            throw new ArithmeticException("A megadott név nem lehet 3 betűnél rövidebb");//throw new ArithmeticException-> A throw kulcsszót főként egyéni kivételek dobására használják.  
        }

    } 

    public String getNev() {
        return nev;
    }

    public String getFaj() {
        return faj;
    }
    public abstract void felveszEszkoz(Eszkoz eszkozFelvesz);
    public abstract void eldobEszkoz(int index);
    public abstract void eldobEszkoz(Eszkoz eszkozEldob);
        public abstract  List<Eszkoz> rendezEszkoz();

    @Override
    public abstract String toString();

}
