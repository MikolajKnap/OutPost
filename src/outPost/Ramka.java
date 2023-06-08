package outPost;

import javax.swing.JFrame;
import java.awt.event.*;
import java.io.*;

public class Ramka extends JFrame {
    public Ramka() {
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //listener nasłuchujący eventu zamknięcia okna X
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                //serializacja sie dzieje
                serializeData();
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
}
