package Listener;

import Components.Button;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class MouseListener implements java.awt.event.MouseListener {
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

        Button b = (Button) e.getSource();
        b.setBorder(BorderFactory.createLineBorder(new Color(0xb30000),2));

    }

    @Override
    public void mouseExited(MouseEvent e) {

        Button b = (Button) e.getSource();
        b.setBorder(BorderFactory.createEmptyBorder());

    }

}
