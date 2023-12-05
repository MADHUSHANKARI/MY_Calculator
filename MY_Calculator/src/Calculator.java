import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Calculator implements ActionListener {

    double num1 = 0, num2 = 0, result = 0;
    int calculation;

    JFrame frame = new JFrame("Calculator");
    JLabel label = new JLabel();
    JTextField textField = new JTextField();
    JRadioButton onRadioButton = new JRadioButton("on");
    JRadioButton offRadioButton = new JRadioButton("off");
    JButton btn0 = new JButton("0");
    JButton btn00 = new JButton("00");
    JButton btn1 = new JButton("1");
    JButton btn2 = new JButton("2");
    JButton btn3 = new JButton("3");
    JButton btn4 = new JButton("4");
    JButton btn5 = new JButton("5");
    JButton btn6 = new JButton("6");
    JButton btn7 = new JButton("7");
    JButton btn8 = new JButton("8");
    JButton btn9 = new JButton("9");
    JButton btnpoint = new JButton(".");
    JButton btnClear = new JButton("AC");
    JButton btnDel = new JButton("DEL");
    JButton btnEql = new JButton("=");
    JButton btnPlus = new JButton("+");
    JButton btnMinus = new JButton("-");
    JButton btnMul = new JButton("*");
    JButton btnDiv = new JButton("/");
    JButton btnSquare = new JButton("x\u00B2");
    JButton btnRec = new JButton("1/x");
    JButton btnSqrt = new JButton("\u221A");






    Calculator(){
        prepareGui();
        addComponents();
        addActionEvent();
    }

    public void prepareGui(){
        frame.setSize(305,510);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void addComponents(){
        label.setBounds(250,0,50,50);
        label.setForeground(Color.white);
        frame.add(label);

        textField.setBounds(10,40,270,40);
        textField.setFont(new Font("Arial",Font.BOLD,20));
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField);

        ButtonGroup buttonGroup = new ButtonGroup();

        btn7.setBounds(10,230,60,40);
        btn7.setFont(new Font("Arial",Font.BOLD,20));
        btn7.setFocusable(false);
        frame.add(btn7);

        btn8.setBounds(80,230,60,40);
        btn8.setFont(new Font("Arial",Font.BOLD,20));
        btn8.setFocusable(false);
        frame.add(btn8);

        btn9.setBounds(150,230,60,40);
        btn9.setFont(new Font("Arial",Font.BOLD,20));
        btn9.setFocusable(false);
        frame.add(btn9);

        btn4.setBounds(10,290,60,40);
        btn4.setFont(new Font("Arial",Font.BOLD,20));
        btn4.setFocusable(false);
        frame.add(btn4);

        btn5.setBounds(80,290,60,40);
        btn5.setFont(new Font("Arial",Font.BOLD,20));
        btn5.setFocusable(false);
        frame.add(btn5);

        btn6.setBounds(150,290,60,40);
        btn6.setFont(new Font("Arial",Font.BOLD,20));
        btn6.setFocusable(false);
        frame.add(btn6);

        btn1.setBounds(10,350,60,40);
        btn1.setFont(new Font("Arial",Font.BOLD,20));
        btn1.setFocusable(false);
        frame.add(btn1);

        btn2.setBounds(80,350,60,40);
        btn2.setFont(new Font("Arial",Font.BOLD,20));
        btn2.setFocusable(false);
        frame.add(btn2);

        btn3.setBounds(150,350,60,40);
        btn3.setFont(new Font("Arial",Font.BOLD,20));
        btn3.setFocusable(false);
        frame.add(btn3);

        btn00.setBounds(10,410,60,40);
        btn00.setFont(new Font("Arial",Font.BOLD,20));
        btn00.setFocusable(false);
        frame.add(btn00);

        btn0.setBounds(80,410,60,40);
        btn0.setFont(new Font("Arial",Font.BOLD,20));
        btn0.setFocusable(false);
        frame.add(btn0);

        btnpoint.setBounds(150,410,60,40);
        btnpoint.setFont(new Font("Arial",Font.BOLD,20));
        btnpoint.setFocusable(false);
        frame.add(btnpoint);


        btnEql.setBounds(220,350,60,100);
        btnEql.setFont(new Font("Arial",Font.BOLD,20));
        btnEql.setBackground(new Color(23,135,26));
        btnEql.setFocusable(false);
        frame.add(btnEql);

        btnPlus.setBounds(220,110,60,40);
        btnPlus.setFont(new Font("Arial",Font.BOLD,20));
        btnPlus.setBackground(new Color(239,188,2));
        btnPlus.setFocusable(false);
        frame.add(btnPlus);

        btnSqrt.setBounds(10,170,60,40);
        btnSqrt.setFont(new Font("Arial",Font.BOLD,18));
        btnSqrt.setFocusable(false);
        frame.add(btnSqrt);

        btnMul.setBounds(220,230,60,40);
        btnMul.setFont(new Font("Arial",Font.BOLD,20));
        btnMul.setBackground(new Color(239,188,2));
        btnMul.setFocusable(false);
        frame.add(btnMul);

        btnMinus.setBounds(220,170,60,40);
        btnMinus.setFont(new Font("Arial",Font.BOLD,20));
        btnMinus.setBackground(new Color(239,188,2));
        btnMinus.setFocusable(false);
        frame.add(btnMinus);

        btnDiv.setBounds(220,290,60,40);
        btnDiv.setFont(new Font("Arial",Font.BOLD,20));
        btnDiv.setBackground(new Color(239,188,2));
        btnDiv.setFocusable(false);
        frame.add(btnDiv);

        btnSquare.setBounds(80,170,60,40);
        btnSquare.setFont(new Font("Arial",Font.BOLD,20));
        btnSquare.setFocusable(false);
        frame.add(btnSquare);

        btnRec.setBounds(150,170,60,40);
        btnRec.setFont(new Font("Arial",Font.BOLD,15));
        btnRec.setFocusable(false);
        frame.add(btnRec);

        btnDel.setBounds(150,110,60,40);
        btnDel.setFont(new Font("Arial",Font.BOLD,12));
        btnDel.setBackground(Color.red);
        btnDel.setForeground(Color.white);
        btnDel.setFocusable(false);
        frame.add(btnDel);

        btnClear.setBounds(80,110,60,40);
        btnClear.setFont(new Font("Arial",Font.BOLD,12));
        btnClear.setBackground(Color.red);
        btnClear.setForeground(Color.white);
        btnClear.setFocusable(false);
        frame.add(btnClear);

    }

    public void addActionEvent(){
        btnClear.addActionListener(this);
        btnDel.addActionListener(this);
        btnDiv.addActionListener(this);
        btnSqrt.addActionListener(this);
        btnSquare.addActionListener(this);
        btnRec.addActionListener(this);
        btnMinus.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btnMul.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btnPlus.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btnEql.addActionListener(this);
        btn0.addActionListener(this);
        btn00.addActionListener(this);
        btnpoint.addActionListener(this);





    }
    public static void main(String[] args){

        Calculator cal = new Calculator();
    }
    @Override
    public  void  actionPerformed(ActionEvent e){
        Object obj = e.getSource();

        if(obj == btnClear){
            label.setText("");
            textField.setText("");
        } else if (obj == btnDel) {
             int len = textField.getText().length();
             int number = len-1;
             if (len>0){
                 StringBuilder back = new StringBuilder(textField.getText());
                 back.deleteCharAt(number);
                 textField.setText(back.toString());
             }if (textField.getText().endsWith(""));
             label.setText("");
        } else if (obj == btn0) {
            if(textField.getText().equals("0")){
                return;
            }else {
                textField.setText(textField.getText() + "0");
            }

        }else if (obj == btn00) {
            if(textField.getText().equals("00")){
                return;
            }else {
                textField.setText(textField.getText() + "00");
            }

        } else if (obj == btn1) {
            textField.setText(textField.getText() + "1");
        }else if (obj == btn2) {
            textField.setText(textField.getText() + "2");
        }else if (obj == btn3) {
            textField.setText(textField.getText() + "3");
        }else if (obj == btn4) {
            textField.setText(textField.getText() + "4");
        }else if (obj == btn5) {
            textField.setText(textField.getText() + "5");
        }else if (obj == btn6) {
            textField.setText(textField.getText() + "6");
        }else if (obj == btn7) {
            textField.setText(textField.getText() + "7");
        }else if (obj == btn8) {
            textField.setText(textField.getText() + "8");
        }else if (obj == btn9) {
            textField.setText(textField.getText() + "9");
        } else if (obj == btnpoint) {
            if(textField.getText().contains(".")){
                return;
            }else {
                textField.setText(textField.getText() + ".");
            }

        } else if (obj == btnPlus ) {
             String str = textField.getText();
             num1 = Double.parseDouble(textField.getText());
             calculation = 1;
             textField.setText("");
             label.setText(str + "+");
        }else if (obj == btnMinus ) {
            String str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculation = 2;
            textField.setText("");
            label.setText(str + "-");
        }else if (obj == btnMul ) {
            String str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculation = 3;
            textField.setText("");
            label.setText(str + "X");
        }else if (obj == btnDiv ) {
            String str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculation = 4;
            textField.setText("");
            label.setText(str + "/");
        }else if (obj == btnSquare ) {
            num1 = Double.parseDouble(textField.getText());
            double square = Math.pow(num1,2);
            String string = Double.toString(square);
            if (string.endsWith(".0")){
                textField.setText(string.replace(".0",""));
            }else{
                textField.setText(string);
            }
        } else if (obj == btnSqrt) {
            num1 = Double.parseDouble(textField.getText());
            double sqrt = Math.sqrt(num1);
            textField.setText(Double.toString(sqrt));

        } else if (obj == btnRec) {
            num1 = Double.parseDouble(textField.getText());
            double rec = 1/num1;
            String string = Double.toString(rec);
            if (string.endsWith(".0")){
                textField.setText(string.replace(".0", ""));
            }else {
                textField.setText(string);
            }
        } else if (obj == btnEql) {
            num2 = Double.parseDouble(textField.getText());
            switch (calculation){
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    result = num1 / num2;
                    break;

            }if (Double.toString(result).endsWith(".0")){
                textField.setText(Double.toString(result).replace(".0",""));

            }else {
                textField.setText(Double.toString(result));
            }
            label.setText("");
            num1 = result;

        }
    }
}
