import java.awt.*;
import javax.swing.*;    
public class ToolTipExample {  
    public static void main(String[] args) {    
     JFrame frame=new JFrame("Tootl Tip Example");    
     JLabel l=new JLabel("Name:");
JTextField T=new JTextField("",10);
T.setToolTipText("Enter your name");
JButton B=new JButton("Submit");
B.setToolTipText("Click to submit");
frame.setLayout(new FlowLayout());
frame.add(l);
frame.add(T);
frame.add(B);
frame.setSize(300,250);
frame.setVisible(true);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}  

