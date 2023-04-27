package Components;

import javax.swing.*;
import java.awt.*;

public class Screen extends JPanel {
    public Screen(){

        //Set Settings for Panel

        setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        setBackground(new Color(0x001a00));

        //Set Settings for Output

        add(new Output());

    }

}
