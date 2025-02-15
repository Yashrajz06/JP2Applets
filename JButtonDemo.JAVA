import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class JButtonDemo extends JFrame implements ActionListener
  {
          JRadioButton b1,b2,b3;
	Container cp;
        JButtonDemo()
           {
           cp=getContentPane();
	cp.setLayout(new FlowLayout());
	JRadioButton b1=new JRadioButton("Pink");
	JRadioButton b2=new JRadioButton("cyan");
	JRadioButton b3=new JRadioButton("red");
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
             cp.add(b1);cp.add(b2);cp.add(b3);
	ButtonGroup b=new ButtonGroup();
              b.add(b1);b.add(b2);b.add(b3);
         }
    public void actionPerformed(ActionEvent ae)
       {
            String str=ae.getActionCommand();
             if(str.equals("Pink"))
               {
                      cp.setBackground(Color.pink);
               }
           else if(str.equals("cyan"))
               {
	       cp.setBackground(Color.cyan);
	  }
          else
               {
                    cp.setBackground(Color.red);
                }
        }
   public static void main(String args[])
      {
            JButtonDemo B1=new JButtonDemo();
	B1.setTitle("button");
	B1.setSize(500,400);
	B1.setVisible(true);
       }
 }
