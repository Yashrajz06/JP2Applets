import java.awt.Frame;
import java.awt.List;

public class _List {
    Frame f;
    List l,l2;
    _List(){
        f = new Frame("List Tutorial");
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

        l = new List(1);
        l2 = new List(2,true);

        l.setBounds(50, 50, 100, 80);
        l2.setBounds(150,50,100,50);
        l.add("1");
        l.add("2");
        l.add("3");
        l.add("4");
        l.add("5");

        l2.add("11");
        l2.add("12");
        l2.add("13");
        l2.add("14");
        l2.add("15");

        f.add(l);
        f.add(l2);        
    }
    public static void main(String[] args) {
        new _List();
    }
    
}
