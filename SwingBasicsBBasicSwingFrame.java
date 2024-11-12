import java.io.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingBasicsBBasicSwingFrame extends JFrame {
  String firstWord = "Hello";

  public SwingBasicsBBasicSwingFrame () {
    this.setTitle("My first swing frame");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(null);

    JLabel label = new JLabel("Hello World!");
    label.setBounds(30, 30, 180, 30);
    this.add(label);

    JTextArea ta = new JTextArea();
    ta.setBounds(30, 90, 180, 30);
    this.add(ta);

    JButton btn = new JButton("Say hello");
    btn.setBounds(30, 150, 180, 30);
    this.add(btn);

    btn.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed (ActionEvent arg0) {
        label.setText(firstWord + " " + ta.getText());
      }
    });

    JComboBox sel = new JComboBox();
    sel.addItem("Hello");
    sel.addItem("Namaste");
    sel.addItem("Bonjour");
    sel.addItem("Moshi moshi");
    sel.setBounds(30, 210, 180, 30);
    this.add(sel);

    sel.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed (ActionEvent arg0) {
        firstWord = sel.getSelectedItem().toString();
      }
    });

    this.setBounds(0, 20, 440, 440);
    this.setVisible(true);
  }
}
