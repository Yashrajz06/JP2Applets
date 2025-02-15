import java.awt.*;
import java.awt.event.*;
class ChoiceDemo extends Frame implements ItemListener
  {
            Label L1;
	Choice a1;
        ChoiceDemo()
           {
	  FlowLayout f1=new FlowLayout();
               setLayout(f1);
	  a1=new Choice();
                L1=new Label("				");
	a1.add("pune");
	a1.add("mumbai");
	a1.add("delhi");
	a1.add("kolkata");
	a1.add("chennai");
           a1.addItemListener(this);
	add(a1);add(L1);
         }
    public void itemStateChanged(ItemEvent ae)
       {
              L1.setBounds(200,300,300,30);
             L1.setText("You have Selected:"+a1.getSelectedItem());
       }
   public static void main(String args[])
      {
            ChoiceDemo B1=new ChoiceDemo();
	B1.setTitle("button");
	B1.setSize(500,400);
	B1.setVisible(true);
       }
 }
