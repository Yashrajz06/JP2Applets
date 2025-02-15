import javax.swing.*;
import java.awt.*;

public class ButtonDemo extends JApplet {

    JButton button;
    JRadioButton r1,r2,r3;
    JCheckBox c1,c2;
    Container content;
    ButtonGroup grp;

    @Override
    public void init() {
        content = getContentPane();
        button = new JButton("Button");
        r1 = new JRadioButton("Button1",true);
        r2 = new JRadioButton("Button2",false);
        r3 = new JRadioButton("Button3",false);
        grp = new ButtonGroup();
        grp.add(r1);
        grp.add(r2);
        grp.add(r3);

        c1 = new JCheckBox("Java");
        c2 = new JCheckBox("Python");

        content.setLayout(new FlowLayout(FlowLayout.CENTER));
        content.add(button);
        content.add(r1);
        content.add(r2);
        content.add(r3);
        content.add(c1);
        content.add(c2);
    }
    
}
/*
 <applet code="ButtonDemo.class" width=500 height=500>
 </applet>
 */