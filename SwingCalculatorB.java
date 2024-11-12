import java.io.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingCalculatorB extends JFrame implements ActionListener {
  void fontAndPlacing(JButton btn, int x, int y, int w, int h) {
    btn.setBounds(x, y, w, h);
    float size = btn.getFont().getSize() + 16;
    btn.setFont(btn.getFont().deriveFont(size));
  }

  public SwingCalculatorB () {
    this.setTitle("Calculator Using Swing");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(null);

    // Creating the text area to write the expression in
    JTextArea txtArea = new JTextArea();
    txtArea.setBounds(60, 60, 1000, 50);
    float size = txtArea.getFont().getSize() + 16;
    txtArea.setFont(txtArea.getFont().deriveFont(size));

    // Adding the text area to the JFrame
    this.add(txtArea);

    // Creating the number and operator buttons

    JButton btn0 = new JButton("0");
    fontAndPlacing(btn0, 180, 510, 75, 75);
    // btn0.setBounds(180, 150, 75, 75);
    // size = btn0.getFont().getSize() + 16;
    // btn0.setFont(btn0.getFont().deriveFont(size));

    JButton btn1 = new JButton("1");
    fontAndPlacing(btn1, 60, 150, 75, 75);
    JButton btn2 = new JButton("2");
    fontAndPlacing(btn2, 180, 150, 75, 75);
    JButton btn3 = new JButton("3");
    fontAndPlacing(btn3, 300, 150, 75, 75);
    JButton btn4 = new JButton("4");
    fontAndPlacing(btn4, 60, 270, 75, 75);
    JButton btn5 = new JButton("5");
    fontAndPlacing(btn5, 180, 270, 75, 75);
    JButton btn6 = new JButton("6");
    fontAndPlacing(btn6, 300, 270, 75, 75);
    JButton btn7 = new JButton("7");
    fontAndPlacing(btn7, 60, 390, 75, 75);
    JButton btn8 = new JButton("8");
    fontAndPlacing(btn8, 180, 390, 75, 75);
    JButton btn9 = new JButton("9");
    fontAndPlacing(btn9, 300, 390, 75, 75);

    JButton btnEqualTo = new JButton("=");
    fontAndPlacing(btnEqualTo, 300, 510, 75, 75);
    JButton btnClear = new JButton("CLR");
    fontAndPlacing(btnClear, 60, 510, 75, 75);

    JButton btnAdd = new JButton("+");
    fontAndPlacing(btnAdd, 420, 150, 75, 75);
    JButton btnSubtract = new JButton("-");
    fontAndPlacing(btnSubtract, 420, 270, 75, 75);
    JButton btnMultiply = new JButton("*");
    fontAndPlacing(btnMultiply, 420, 390, 75, 75);
    JButton btnDivide = new JButton("/");
    fontAndPlacing(btnDivide, 420, 510, 75, 75);

    JButton btnOpenBracket = new JButton("(");
    fontAndPlacing(btnOpenBracket, 540, 150, 75, 75);
    JButton btnCloseBracket = new JButton(")");
    fontAndPlacing(btnCloseBracket, 540, 270, 75, 75);
    JButton btnDecimalPoint = new JButton(".");
    fontAndPlacing(btnDecimalPoint, 540, 390, 75, 75);

    // Adding the ActionListeners in to make the buttons usable

    // SwingCalculatorB calc = new SwingCalculatorB();
    // btn0.addActionListener(calc);
    // btn1.addActionListener(calc);
    // btn2.addActionListener(calc);
    // btn3.addActionListener(calc);
    // btn4.addActionListener(calc);
    // btn5.addActionListener(calc);
    // btn6.addActionListener(calc);
    // btn7.addActionListener(calc);
    // btn8.addActionListener(calc);
    // btn9.addActionListener(calc);

    // btnEqualTo.addActionListener(calc);
    // btnClear.addActionListener(calc);

    // btnAdd.addActionListener(calc);
    // btnSubtract.addActionListener(calc);
    // btnMultiply.addActionListener(calc);
    // btnDivide.addActionListener(calc);

    // btnOpenBracket.addActionListener(calc);
    // btnCloseBracket.addActionListener(calc);
    // btnDecimalPoint.addActionListener(calc);

    public void actionPerformed(ActionEvent e) {

    }

    // Adding the number and operator buttons

    this.add(btn0);
    this.add(btn1);
    this.add(btn2);
    this.add(btn3);
    this.add(btn4);
    this.add(btn5);
    this.add(btn6);
    this.add(btn7);
    this.add(btn8);
    this.add(btn9);

    this.add(btnEqualTo);
    this.add(btnClear);

    this.add(btnAdd);
    this.add(btnSubtract);
    this.add(btnMultiply);
    this.add(btnDivide);

    this.add(btnOpenBracket);
    this.add(btnCloseBracket);
    this.add(btnDecimalPoint);

    // Making the JFrame visible
    this.setBounds(0, 20, 1400, 1000);
    this.setVisible(true);
  }
}
