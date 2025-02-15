import java.awt.*;
import javax.swing.*;
class tabDemo extends JFrame
  {
        tabDemo()
           {
	//Container cp=getContentPane();
	JTabbedPane tb=new JTabbedPane();
	tb.addTab("News papers",new news());
           tb.addTab("Cities",new city());
	tb.addTab("Websites",new website());
            //cp.add(tb);
add(tb);
         }
   public static void main(String args[])
      {
            tabDemo B1=new tabDemo();
	B1.setTitle("button");
	B1.setSize(500,400);
	B1.setVisible(true);
       }
 }
class news extends JPanel
  {
          news()
             {
		JComboBox cb=new JComboBox();
                          cb.addItem("Sakal");
		cb.addItem("Lokmat");
		cb.addItem("pudhari");
		add(cb);
             }
}
class city extends JPanel
  {
         city()
             {
		JComboBox cb=new JComboBox();
                          cb.addItem("pune");
		cb.addItem("mumbai");
		cb.addItem("kolkata");
		add(cb);
             }
}
class website extends JPanel
  {
          website()
             {
		JComboBox cb=new JComboBox();
                          cb.addItem("google.com");
		cb.addItem("yahoo.com");
		cb.addItem("mahadbt.com");
		add(cb);
             }
}
