package outPost;

import javax.swing.*;
import java.awt.*;

public class PrzyciskDefault extends JButton {
    public PrzyciskDefault(String napis) {
        setText(napis);
        setBackground(PaczkomatGUI.kolorPrzyciskow);
        setForeground(Color.DARK_GRAY);
        setFont(new Font("Tahoma", Font.BOLD, 32));
        setFocusPainted(false);
        setPreferredSize(new Dimension(400, 70));
    }
}
