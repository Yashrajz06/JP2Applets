import java.applet.Applet;
import java.awt.*;

public class M4 extends Applet {
    Button btnOk, btnReset, btnCancel;

    public void init() {
        setLayout(null);

        btnOk = new Button("OK");
        btnOk.setBounds(20, 50, 80, 30);
        add(btnOk);

        btnReset = new Button("RESET");
        btnReset.setBounds(110, 50, 80, 30);
        add(btnReset);

        btnCancel = new Button("CANCEL");
        btnCancel.setBounds(200, 50, 80, 30);
        add(btnCancel);
    }
}
/*
 <applet code="M4.class" width=300 height=150>
 </applet>
 */