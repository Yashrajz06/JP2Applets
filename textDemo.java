import java.awt.*;
import java.awt.event.*;
class textDemo extends Frame implements TextListener
  {
       Label L1;
       TextField t1;
        textDemo()
           {
	  FlowLayout f1=new FlowLayout();
               setLayout(f1);
	L1=new Label("             	");
            t1=new TextField(10);
            add(t1);add(L1);
          t1.addTextListener(this);
         }
     public void textValueChanged(TextEvent te)
        {
               L1.setText(""+t1.getText());
        }
   public static void main(String args[])
      {
            textDemo B1=new textDemo();
	B1.setTitle("button");
	B1.setSize(500,400);
	B1.setVisible(true);
       }
 }
