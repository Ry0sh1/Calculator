package Components;

import javax.swing.*;
import java.awt.*;

public class Output extends JTextArea {

    public Output(){

        setFocusable(false);
        setEditable(false);
        setBackground(new Color(0x001a00));
        setForeground(Color.white);
        setPreferredSize(new Dimension(600,200));

    }

    public Output(String text){

        setText(text);
        setFocusable(false);
        setEditable(false);
        setBackground(new Color(0x001a00));
        setForeground(Color.white);
        setPreferredSize(new Dimension(600,200));

    }

}
