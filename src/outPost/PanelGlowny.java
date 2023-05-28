package outPost;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelGlowny extends JPanel{
    public JLabel napisWyboru;
    public PrzyciskDefault buttonOdbierz, buttonNadaj, buttonAdmin;

    public PanelGlowny() {
        setBackground(PaczkomatGUI.kolorTlaTytulu);
        setLayout(new GridBagLayout());
        // Napis wyboru
        napisWyboru = new JLabel("Co chciałbyś dzisiaj zrobić?");
        napisWyboru.setFont(new Font(Font.DIALOG, Font.PLAIN, 30));
        napisWyboru.setHorizontalAlignment(JLabel.CENTER);

        // Tworzenie button1 - odbierz paczke
        buttonOdbierz = new PrzyciskOdbierz();

        //Tworzenie button2 - nadaj paczke
        buttonNadaj = new PrzyciskNadaj();

        //Tworzenie button3 - admin
        buttonAdmin = new PrzyciskADMIN();

        // To sprawia ze mozemy ulozyc elementy w gridzie
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(20, 0, 30, 0); // Ustawienie odstępów między przyciskami
        gbc.gridx = 0;
        gbc.gridy = 0; // wiersz 0 - to sprawia ze te 3 elementy nie nachodza na siebie a są pod sobą
        add(napisWyboru, gbc);
        gbc.gridy = 1; // wiersz 1
        add(buttonOdbierz, gbc);
        gbc.gridy = 2; // wiersz 2
        add(buttonNadaj, gbc);
        gbc.gridy = 3;
        add(buttonAdmin, gbc);
    }
}
