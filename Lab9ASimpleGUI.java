import javax.swing.*;
public class Lab9ASimpleGUI extends JFrame{
    JFrame f;
    Lab9ASimpleGUI(){
        JButton b=new JButton("click");//create button
        b.setBounds(130,100,100, 40);
        this.add(b);//adding button on frame
        this.setSize(300,300);
        this.setLayout(null);
        this.setVisible(true);
        this.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Lab9ASimpleGUI();
    }
}
