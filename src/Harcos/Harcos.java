
package Harcos;

public class Harcos extends Karakter{
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
    public String toString() {
        return "Harcos{" + "ero=" + ero + ", ugyesseg=" + ugyesseg + '}';
    }
    
    
    
    
     
}
