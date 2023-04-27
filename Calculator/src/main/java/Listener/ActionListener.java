package Listener;

import Components.*;
import jdk.jfr.Event;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ActionListener implements java.awt.event.ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

        Button b = (Button) e.getSource();
        Screen sc = getScreen(e);
        Output out = getOutput(e);
        ButtonPanel bp = getButtonPanel(e);

        if (b.getText().equals("=")) {

            double first_arg = bp.getFirst_arg();
            double sec_arg = Double.parseDouble(out.getText());
            char op = bp.getOperator();
            bp.setSec_arg(sec_arg);

            if (op == '*') {
                out.setText(String.valueOf(first_arg * sec_arg));
            } else if (op == '/') {
                out.setText(String.valueOf(first_arg / sec_arg));
            } else if (op == '+') {
                out.setText(String.valueOf(first_arg + sec_arg));
            } else if (op == '-') {
                out.setText(String.valueOf(first_arg - sec_arg));
            } else if (op == '%') {
                out.setText(String.valueOf(first_arg % sec_arg));
            }

        }
        else if (b.getText().equals("*")) {

            bp.setOperator('*');
            bp.setFirst_arg(Double.parseDouble(out.getText()));
            out.setText("");

        } else if (b.getText().equals("/")) {

            bp.setOperator('/');
            bp.setFirst_arg(Double.parseDouble(out.getText()));
            out.setText("");

        } else if (b.getText().equals("-")) {

            bp.setOperator('-');
            bp.setFirst_arg(Double.parseDouble(out.getText()));
            out.setText("");

        } else if (b.getText().equals("+")) {

            bp.setOperator('+');
            bp.setFirst_arg(Double.parseDouble(out.getText()));
            out.setText("");

        } else if (b.getText().equals("%")) {

            bp.setOperator('%');
            bp.setFirst_arg(Double.parseDouble(out.getText()));
            out.setText("");

        }else if (b.getText().equals("CE")) {

            out.setText("");

        }else if (b.getText().equals("C")) {

            out.setText("");
            bp.setOperator('+');
            bp.setFirst_arg(0);
            bp.setSec_arg(0);

        }else if (b.getText().equals("L")) {

            String txt = out.getText();
            out.setText(txt.substring(0,txt.length()-1));
            bp.setOperator('+');
            bp.setFirst_arg(0);
            bp.setSec_arg(0);

        } else {

            String text = out.getText();
            sc.remove((Output) sc.getComponent(0));
            sc.add(new Output(text + "" + b.getText()));

        }

    }

    private Output getOutput(ActionEvent e){

        Screen sc = getScreen(e);
        return (Output) sc.getComponent(0);

    }

    private Screen getScreen(ActionEvent e){

        ButtonPanel bp = getButtonPanel(e);
        All all = (All) bp.getParent();

        return (Screen) all.getComponentAt(0);

    }

    private ButtonPanel getButtonPanel(ActionEvent e){

        Button b = (Button) e.getSource();

        return (ButtonPanel) b.getParent();

    }

}
