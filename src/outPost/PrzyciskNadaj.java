package outPost;

import java.awt.*;

public class PrzyciskNadaj extends PrzyciskDefault{
    public PrzyciskNadaj() {
        super("Nadaj paczkę");

        addActionListener(e -> {
            PaczkomatGUI.ramka.remove(PaczkomatGUI.panelGlowny);
            PaczkomatGUI.ramka.add(PaczkomatGUI.panelWybierzPaczke, BorderLayout.CENTER);
            PaczkomatGUI.ramka.add(PaczkomatGUI.przyciskPowrot, BorderLayout.SOUTH);
            PaczkomatGUI.ramka.revalidate();
            PaczkomatGUI.ramka.repaint();
        });
    }
}
