// Design an applet/application to demonstrate the use of Radio Button and
// Checkbox.

/*
 <applet code="M1.class" height=500 width=500>
 </applet>
 */
import java.awt.*;
import java.applet.Applet;

public class M1 extends Applet{

    Checkbox c1, c2 ,c3 , c4,c5,c6;
    CheckboxGroup ch1;
    Label l1, l2;

    public void init() {
        l1 = new Label("Select Gender");
        ch1 = new CheckboxGroup();
        c1 = new Checkbox("Male",ch1,false);
        c2 = new Checkbox("Female",ch1,false);
        l1.setBounds(20, 20, 100, 20);
        c1.setBounds(130, 20, 60, 20);
        c2.setBounds(200, 20, 70, 20);

        l2 = new Label("Select Hobbies");
        c3 = new Checkbox("Cricket");
        c4 = new Checkbox("Reading");
        c5 = new Checkbox("Singing");
        c6 = new Checkbox("Painting");

        l2.setBounds(20, 50, 100, 20);
        c3.setBounds(130, 50, 70, 20);
        c4.setBounds(130, 75, 70, 20);
        c5.setBounds(130, 100, 70, 20);
        c6.setBounds(130, 125, 70, 20);
        add(l1);
        add(l2);
        add(c1);
        add(c2);
        add(c3);
        add(c4);
        add(c5);
        add(c6);
        setVisible(true);
        setLayout(null);

    }
} 