package outPost;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    public static void main(String[] args) {
        JFrame okienko = new JFrame("Testowe okienko");
        JPanel panel = new JPanel();
        JButton przycisk = new JButton("Wcisnij mnie");
        JButton przycisk2 = new JButton("Wcisnij mnie2");
        przycisk.addActionListener(new GUI());

        panel.add(przycisk); // dodanie do panelu przycisku
        panel.add(przycisk2); // dodanie drugiego przycisku
        okienko.add(panel);  // dodanie do okienka panelu

        okienko.setSize(400,500); // startowy rozmiar okienka, mozna go zmienic ciagnac za rogi
        okienko.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // jak klikniemy na x'a to sie program tez wylaczy
        okienko.setVisible(true); // uwidocznienie okienka
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Kliknales mnie");
    }
}
