package outPost;

import java.awt.Dimension;


public class PrzyciskADMIN extends PrzyciskDefault {

    /*
     * Ogolnie o co chodzi, bo jest tak ze nie trzeba tworzyc 
     * JButton butonik = new JButton();
     * a potem np.
     * butonik.setBackground();
     * 
     * tylko robimy normalnie extends JButton i w konstruktorze 
     * modyfikujemy sobie ten butonik, a potem tworzymy go tam gdzie chcemy
     */

    public PrzyciskADMIN() {
        super("Admin");
        setPreferredSize(new Dimension(200, 40));
    }
}
