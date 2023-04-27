package Components;

import Listener.ActionListener;
import Listener.MouseListener;

import javax.swing.*;
import java.awt.*;

public class Button extends JButton {

    private String label;
    public Button(){

        addActionListener(new ActionListener());
        addMouseListener(new MouseListener());
        setBackground(new Color(0x8f8f8f));
        setBorder(BorderFactory.createEmptyBorder());
        setPreferredSize(new Dimension(100,50));
        setFocusable(false);

    }

    public Button(String pLabel){

        label = pLabel;
        setText(label);
        addActionListener(new ActionListener());
        addMouseListener(new MouseListener());
        setBackground(new Color(0x8f8f8f));
        setBorder(BorderFactory.createEmptyBorder());
        setPreferredSize(new Dimension(100,50));
        setFocusable(false);

    }

}
