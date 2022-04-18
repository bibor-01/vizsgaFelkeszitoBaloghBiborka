package Harcos;

import java.util.Iterator;
import java.io.*;

public class HarcosProgram {

    public static void main(String[] args) {
        Harcos h1 = new Harcos(20, 16, "Joe", "sárkány");
        Harcos h2 = new Harcos(10, 5, "Luna", "Tündér");
        //kivétel
        //Harcos h3 = new Harcos(5, 2, "P");
        Harcos h4 = new Harcos(10, 6, "Elfo", "manó");
        h1.felveszEszkoz(new Eszkoz("Lánc", 500));
        System.out.println(h1);
        h1.eldobEszkoz(0);
        System.out.println(h1);

        for (Eszkoz eszkoz : h2) {
            System.out.println(h2);
        }


        //Serialize
        try {
            FileOutputStream fileOut = new FileOutputStream("harcos.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(h1);
            out.close();
            fileOut.close();
            System.out.printf("Sikeres mentés harcos.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
        System.out.println(h1);

        Harcos h5 = null;
        
        //Deserialise
        try {
            FileInputStream fileIn = new FileInputStream("harcos.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            h5 = (Harcos) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Sikertelen beolvasás!");
            c.printStackTrace();
            return;
        }
        System.out.println("beolvasott érték:");
        System.out.println(h5);
    }

}
