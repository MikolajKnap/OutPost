package outPost;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PrzyciskADMIN extends JButton {

    /*
     * Ogolnie o co chodzi, bo jest tak ze nie trzeba tworzyc 
     * JButton butonik = new JButton();
     * a potem np.
     * butonik.setBackground();
     * 
     * tylko robimy normalnie extends JButton i w konstruktorze 
     * modyfikujemy sobie ten butonik, a potem tworzymy go tam gdzie chcemy
     */

    public PrzyciskADMIN() {
        setText("ADMIN");
        setBackground(PaczkomatGUI.kolorPrzyciskow);
        setForeground(Color.DARK_GRAY);
        setFont(new Font("Tahoma", Font.BOLD, 32));
        setFocusPainted(false);
        setPreferredSize(new Dimension(200, 50));


    }
}
