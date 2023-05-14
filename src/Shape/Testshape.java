package Shape;

import javax.swing.*;
import java.awt.*;

public class Testshape extends JPanel {

    public void paint(Graphics g) {
        this.setBackground(Color.WHITE);


        g.setColor(Color.GREEN);
        g.drawLine(10,20,100,50);

        g.setColor(Color.BLUE);
        g.drawRect(10,50,100,50);

        g.setColor(Color.RED);
        g.fillOval(10,90,100,100);

        g.setColor(Color.MAGENTA);
        g.fill3DRect(10,150,100,50,true);
    }
}
