import java.applet.Applet;
import java.awt.*;

public class Panel_Prog  {
    
    Frame f;
    Panel p;
    Panel_Prog() {
        f= new Frame("Panel tutorial");
        p = new Panel();
        p.setBounds(200, 200, 200, 200);
        p.setBackground(Color.BLACK);
        f.add(p);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new Panel_Prog();
    }
}
