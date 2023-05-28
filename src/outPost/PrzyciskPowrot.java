package outPost;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;

public class PrzyciskPowrot extends JButton {
    public PrzyciskPowrot() {
        setText("POWROT");
        setBackground(PaczkomatGUI.kolorPrzyciskow);
        setForeground(Color.DARK_GRAY);
        setFont(new Font("Tahoma", Font.BOLD, 32));
        setFocusPainted(false);
        setPreferredSize(new Dimension(200, 50));

        // buttonPowrot onClick
        addActionListener(e -> {
            PaczkomatGUI.ramka.remove(PaczkomatGUI.przyciskPowrot);
            PaczkomatGUI.ramka.remove(PaczkomatGUI.panelWybierzPaczke);
            PaczkomatGUI.ramka.remove(PaczkomatGUI.panelOdbierzPaczke);
            PaczkomatGUI.ramka.add(PaczkomatGUI.panelGlowny, BorderLayout.CENTER);
            PaczkomatGUI.ramka.revalidate();
            PaczkomatGUI.ramka.repaint();
        });
    }
}
