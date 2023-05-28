package outPost.fields;

import javax.swing.*;
import java.awt.*;

public class PoleTekstoweBazowe extends JTextField {
    public PoleTekstoweBazowe() {
        setFont(new Font("Tahoma", Font.BOLD, 13));
        setHorizontalAlignment(JTextField.CENTER);
        setPreferredSize(new Dimension(200, 40));
    }

    public PoleTekstoweBazowe(String text) {
        setText(text);
        setFont(new Font("Tahoma", Font.BOLD, 13));
        setHorizontalAlignment(JTextField.CENTER);
        setPreferredSize(new Dimension(200, 40));
    }
}
