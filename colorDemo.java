import java.awt.*;
import javax.swing.*;
import java.awt.Color.*;
import java.awt.event.*;
class colorDemo extends JFrame implements ActionListener
   {
	   Container c1=getContentPane();
         colorDemo()
           {
              c1.setLayout(new FlowLayout());
               JRadioButton b1=new JRadioButton("Red");
                b1.addActionListener(this);
               c1.add(b1);
               JRadioButton b2=new JRadioButton("Cyan");
                b2.addActionListener(this);
               c1.add(b2);
              ButtonGroup g1=new ButtonGroup();
              g1.add(b1);
	g1.add(b2);
          }
     public void actionPerformed(ActionEvent a)
           {
                  String s=a.getActionCommand();
                   if(s.equals("Red"))
                       {
                             c1.setBackground(Color.red);
                       }
                  if(s.equals("Cyan"))
                       {
                             c1.setBackground(Color.cyan);
                       }
               }
     public static void main(String args[])
         {
               colorDemo a1=new colorDemo();
               a1.setTitle("colorDemo");
 	a1.setSize(500,500);
	a1.setVisible(true);
        }
 }
