import java.awt.*;
import java.awt.event.*;


public class Button2 extends Frame implements ActionListener {

    Button r,b,reset;
    
    Button2(){
        r = new Button("Red");
        b = new Button("Blue");
        reset = new Button("Reset");

        r.setBackground(Color.red);
        b.setBackground(Color.blue);

        r.addActionListener(this);
        b.addActionListener(this);
        reset.addActionListener(this);
        
        add(r);
        add(b);
        add(reset);

        setVisible(true);
        setSize(200,200);
        setLayout(new FlowLayout());

    }
    public void actionPerformed(ActionEvent a){
        if(a.getSource()==r){
            setBackground(Color.red);
        }
        if(a.getSource()==b){
            setBackground(Color.blue);
        }
        if(a.getSource()==reset){
            setBackground(Color.white);
        }
    }

    public static void main(String[] args) {
        new Button2();
    }
    
}
