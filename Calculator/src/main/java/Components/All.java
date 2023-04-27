package Components;

import javax.swing.*;
import java.awt.*;

public class All extends JPanel {

    private Screen screen = new Screen();
    private ButtonPanel buttonPanel = new ButtonPanel();

    public All(){

        setLayout(new BorderLayout());
        add(screen, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.SOUTH);

    }

    public JPanel getComponentAt(int c) {

        if (c==0){

            return screen;

        }else {

            return buttonPanel;

        }

    }

}
