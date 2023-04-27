package Components;

import javax.swing.*;
import java.awt.*;

public class Output extends JTextArea {

    private String first_arg;
    private char op;
    private String sec_arg;

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

    public String getFirst_arg() {
        return first_arg;
    }

    public void setFirst_arg(String first_arg) {
        this.first_arg = first_arg;
    }

    public char getOp() {
        return op;
    }

    public void setOp(char op) {
        this.op = op;
    }

    public String getSec_arg() {
        return sec_arg;
    }

    public void setSec_arg(String sec_arg) {
        this.sec_arg = sec_arg;
    }

}
