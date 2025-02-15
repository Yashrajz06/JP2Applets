import java.awt.Button;
import java.awt.Frame;

public class _Button extends Frame {
    Button b1, b2;
    _Button(){
        b1 = new Button("Submit");
        b2 = new Button("Reset");
        b1.setBounds(50,50,50,50);
        b2.setBounds(150,50,50,50);
        setVisible(true);
        setLayout(null);
        setSize(200,200);
        add(b1);
        add(b2);
    }

    public static void main(String[] args) {
        new _Button();
    }
    
}
