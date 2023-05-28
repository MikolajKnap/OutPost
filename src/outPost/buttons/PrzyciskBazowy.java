package outPost.buttons;

import outPost.PaczkomatGUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;

public class PrzyciskBazowy  extends JButton{

    public PrzyciskBazowy() {
        setText(" ");
        setBackground(PaczkomatGUI.kolorPrzyciskow);
        setForeground(Color.DARK_GRAY);
        setFont(new Font("Tahoma", Font.BOLD, 28));
        setFocusPainted(false);
        setPreferredSize(new Dimension(250, 50));
    }
    public PrzyciskBazowy(String text) {
        setText(text);
        setBackground(PaczkomatGUI.kolorPrzyciskow);
        setForeground(Color.DARK_GRAY);
        setFont(new Font("Tahoma", Font.BOLD, 28));
        setFocusPainted(false);
        setPreferredSize(new Dimension(250, 50));
    }

}
