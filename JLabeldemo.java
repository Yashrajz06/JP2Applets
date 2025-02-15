import java.awt.*;
import javax.swing.*;

public class JLabeldemo extends JApplet{
    Container content;
    public void init() {
            content = getContentPane();
            ImageIcon icon = new ImageIcon("France.gif");
            // JLabel lable = new JLabel("This is JLabel",JLabel.TRAILING);
            JLabel l2 = new JLabel("France",icon, JLabel.LEFT);
            // content.add(lable);
            content.add(l2);
        }
}

/*
 <applet code="JLabeldemo.class" width=400 height=400>
 </applet>
 */