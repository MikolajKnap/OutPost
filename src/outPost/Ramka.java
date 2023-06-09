package outPost;

import outPost.Outpost.*;

import javax.swing.JFrame;
import java.awt.event.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import static outPost.Outpost.serializePaczkomaty;


public class Ramka extends JFrame {
    public Ramka() {
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //String serializePaczkomaty = "../paczkomaty.ser";
        //listener nasłuchujący eventu zamknięcia okna X
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                //ArrayList<PaczkomatGUI> paczkomatsy = new ArrayList<>();
                //paczkomatsy = Outpost.getPaczkomaty();
                //serializacja sie dzieje
                System.out.println("eee manyZramki");
                serializeData();
                serializePaczkomaty();
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
