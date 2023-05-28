package outPost;

import java.awt.*;

public class PrzyciskOdbierz extends PrzyciskDefault{
    public PrzyciskOdbierz() {
        super("Odbierz paczkę");

        addActionListener(e -> {
            PaczkomatGUI.ramka.remove(PaczkomatGUI.panelGlowny);
            PaczkomatGUI.ramka.add(PaczkomatGUI.panelOdbierzPaczke, BorderLayout.CENTER);
            PaczkomatGUI.ramka.add(PaczkomatGUI.przyciskPowrot, BorderLayout.SOUTH);
            PaczkomatGUI.ramka.revalidate();
            PaczkomatGUI.ramka.repaint();
        });
    }
}
