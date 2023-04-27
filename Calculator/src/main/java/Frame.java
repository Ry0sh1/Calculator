import Components.All;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame implements ActionListener {

    public Frame(){

        add(new All());

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        pack();

    }

    @Override
    public void actionPerformed(ActionEvent e) {



    }

    public static void main(String[] args){

        new Frame();

    }

}
