import java.awt.*;
import java.applet.Applet;

public class M3 extends Applet {
     Checkbox lang1, lang2, lang3, lang4;
    Label lbl;

    public void init() {
        setLayout(null);

        lbl = new Label("Select languages you know:");
        lbl.setBounds(20, 20, 200, 20);
        add(lbl);

        lang1 = new Checkbox("Marathi");
        lang1.setBounds(20, 50, 100, 20);
        add(lang1);

        lang2 = new Checkbox("Hindi");
        lang2.setBounds(20, 80, 100, 20);
        add(lang2);

        lang3 = new Checkbox("English");
        lang3.setBounds(20, 110, 100, 20);
        add(lang3);

        lang4 = new Checkbox("Sanskrit");
        lang4.setBounds(20, 140, 100, 20);
        add(lang4);
    }
    
}
/*
 <applet code="M3.class" width=250 height=200>
 </applet>
 */
