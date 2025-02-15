import java.applet.Applet;
import java.awt.*;

public class Radio extends Applet {
    Checkbox c1,c2;
    Label l1,l2;
    CheckboxGroup g;
    @Override
    public void init() {
	setLayout(null);
        g = new CheckboxGroup();
        c1 = new Checkbox("Male",g,true);
        c2 = new Checkbox("Female",g,false);
        l1 = new Label("Checked");
        l2 = new Label("Unchecked");
        
        l1.setBounds(30,30,50,30);
        c1.setBounds(90,30,70,30);
        l2.setBounds(30,70,50,30);
        c2.setBounds(90,70,70,30);
        add(c1);
        add(c2);
        add(l1);
        add(l2);
        
    }
}

/*
<applet code="Radio.class" width=500 height=500></applet>
*/
