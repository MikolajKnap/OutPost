package outPost;

import java.awt.BorderLayout;
import java.awt.Button;
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

        addActionListener(e -> {
            PaczkomatGUI.ramka.remove(PaczkomatGUI.przyciskPowrot);
            PaczkomatGUI.ramka.remove(PaczkomatGUI.panelWybierzPaczke);
            PaczkomatGUI.ramka.add(PaczkomatGUI.panelGlowny, BorderLayout.CENTER);
            PaczkomatGUI.ramka.add(PaczkomatGUI.przyciskADMIN, BorderLayout.SOUTH);
            PaczkomatGUI.ramka.revalidate();
            PaczkomatGUI.ramka.repaint();
        });
    }
}
