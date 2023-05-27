package outPost;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;

public class PrzyciskPowrot extends JButton {
    public PrzyciskPowrot() {
        setText("ADMIN");
        setBackground(PaczkomatGUI.kolorPrzyciskow);
        setForeground(Color.DARK_GRAY);
        setFont(new Font("Tahoma", Font.BOLD, 32));
        setFocusPainted(false);
        setPreferredSize(new Dimension(200, 50));
    }
}
