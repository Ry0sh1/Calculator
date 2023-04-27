package Components;

import javax.swing.*;
import java.awt.*;

public class ButtonPanel extends JPanel {

    public String[] labels = {"%","CE","C","L","7","8","9","x","4","5","6","-","1","2","3","+","/","0",",","="};

    public ButtonPanel(){

        int rows = 5;
        int columns = 4;
        setLayout(new GridLayout(rows,columns));

        for (int i = 0; i < rows*columns; i++){

            add(new Button(labels[i]));

        }

        setPreferredSize(new Dimension(600,600));
        setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

    }

}
