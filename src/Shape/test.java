package Shape;

import javax.swing.*;
import java.awt.*;

public class test {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("TEST");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Testshape testshape = new Testshape();
        testshape.setBackground(Color.WHITE);
        jFrame.add(testshape);
        jFrame.setSize(500,300);
        jFrame.setVisible(true);

    }
}
