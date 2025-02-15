import java.awt.*;
import javax.swing.*;

public class Jtext extends JApplet {
    JTextField field;
    JTextArea area;
    Container content;
    JComboBox box;
    String[] items = {"Pune","Mumbai","Kerala","Delhi","Odisha"};

    public void init(){
        box = new JComboBox<>(items);
        field = new JTextField(50);
        content = getContentPane();
        content.add(field);
        content.add(box);
        area = new JTextArea(8,50);
        content.add(area);
        content.setLayout(new FlowLayout()); 
    }
}

/*
 <applet code="Jtext" width=300 height=300>
 </applet>
 */