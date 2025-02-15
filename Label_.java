
import java.awt.Frame;
import java.awt.Label;

public class Label_ {
    Frame f;
    Label l1,l2,l3;
    Label_(){
        f = new Frame("Label Tutorial.");
        f.setSize(500,300);
        f.setVisible(true);
        f.setLayout(null);
        l1 = new Label("Label One");
        l2 = new Label("Label Two",Label.CENTER);
        l3 = new Label("Label Three",Label.RIGHT);
        l1.setBounds(50,50,100,100);
        l2.setBounds(150,50,100,100);
        l3.setBounds(250,50,100,100);
        f.add(l1);
        f.add(l2);
        f.add(l3);
    }
    public static void main(String[] args) {
        new Label_();
    }
}
