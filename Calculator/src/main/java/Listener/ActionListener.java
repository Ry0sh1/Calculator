package Listener;

import Components.*;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ActionListener implements java.awt.event.ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

        Button b = (Button) e.getSource();

        if (b.getText().equals("=")){



        }

        ButtonPanel bp = (ButtonPanel) b.getParent();
        All all = (All) bp.getParent();

        Screen sc = (Screen) all.getComponentAt(0);
        Output out = (Output) sc.getComponent(0);
        String text = out.getText();
        sc.remove((Output) sc.getComponent(0));
        sc.add(new Output(text + "" + b.getText()));

    }

}
