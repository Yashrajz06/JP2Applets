import java.applet.Applet;
import java.awt.*;

public class M2 extends Applet{
    Label lbl;

    public void init() {
        setLayout(null);

        lbl = new Label("Welcome to Java", Label.CENTER);
        lbl.setBounds(50, 50, 150, 30);
        add(lbl);
    }
}

/*
 <applet code="M2.class" width=250 height=150>
 </applet>
 */