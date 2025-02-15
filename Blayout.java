import java.awt.*;

public class Blayout{
    Frame f;
    Button a,b,c,d,e;
    Blayout(){
        BorderLayout bl = new BorderLayout(50,50);
        f= new Frame("Border Layout Tutorial");
        f.setVisible(true);
        f.setSize(300,300);
        f.setLayout(bl);
        a = new Button("North");
        f.add(a,BorderLayout.NORTH);
        b = new Button("South");
        f.add(b,BorderLayout.SOUTH);
        c = new Button("East");
        f.add(c,BorderLayout.EAST);
        d = new Button("West");
        f.add(d,BorderLayout.WEST);
        e = new Button("Center");
        f.add(e,BorderLayout.CENTER);
    }
    public static void main(String[] args) {
        new Blayout();
    }
}