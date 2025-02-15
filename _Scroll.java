import java.awt.Frame;
import java.awt.Scrollbar;

public class _Scroll extends Frame {
    
    Scrollbar bar,bar2;
    _Scroll(){
        new Frame("This is a Scroll Bar");
        setSize(500,500);
        setVisible(true);
        setLayout(null);
        bar = new Scrollbar(Scrollbar.HORIZONTAL);
        bar2 = new Scrollbar(Scrollbar.VERTICAL,25,20,0,50);

        bar.setBounds(50,50,100,50);
        bar2.setBounds(50,120,100,100);

        add(bar);
        add(bar2);
    }

    public static void main(String[] args) {
        new _Scroll();
    }
    
}
