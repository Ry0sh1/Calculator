package Components;

import javax.swing.*;
import java.awt.*;

public class ButtonPanel extends JPanel {

    private String[] labels = {"%","CE","C","L","7","8","9","*","4","5","6","-","1","2","3","+","/","0",",","="};
    private char operator;
    private double first_arg;
    private double sec_arg;

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

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public double getFirst_arg() {
        return first_arg;
    }

    public void setFirst_arg(double first_arg) {
        this.first_arg = first_arg;
    }

    public double getSec_arg() {
        return sec_arg;
    }

    public void setSec_arg(double sec_arg) {
        this.sec_arg = sec_arg;
    }

}
