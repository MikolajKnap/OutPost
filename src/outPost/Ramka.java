package outPost;

import outPost.paczki.Paczka;
import Outpost;

import javax.swing.JFrame;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;



public class Ramka extends JFrame {
    public Ramka() {
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //String serializePaczkomaty = "../paczkomaty.ser";
        //listener nasłuchujący eventu zamknięcia okna X
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                //serializacja sie dzieje
                serializeData();
                //serializePaczkomaty();
                //właściwe zamkniecie okienka
                System.exit(0);
            }
        });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);

    }

    private void serializeData() {
        System.out.println("listener działa ez, a MP nic nie wie co robi omg");
    }

    /*private void serializePaczki(ArrayList<Paczka> listaPaczek) {
        String filePaczki = "../paczki.ser";
        try {
            FileOutputStream fileOut = new FileOutputStream(filePaczki);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(listaPaczek);
            out.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/


}
