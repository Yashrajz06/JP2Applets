import java.awt.*;
import java.awt.event.*;

public class CalDemo implements ActionListener{

    Frame f;
    TextField num1,num2,res;    
    Button add,sub,div,mul,reset;
    Label l1,l2,l3;

    CalDemo(){
        f = new Frame("Calculator demo");

        l1 = new Label("Number1");
        l2 = new Label("Number2");
        l3 = new Label("Result");

        num1 = new TextField(10);
        num2 = new TextField(10);
        res = new TextField(10);

        add = new Button("ADD");
        sub = new Button("SUB");
        mul = new Button("MUL");
        div = new Button("DIV");
        

        f.setSize(200,200);
        f.setVisible(true);
        f.setLayout(new FlowLayout());
        f.add(l1);
        f.add(num1);
        f.add(l2);
        f.add(num2);
        f.add(l3);
        f.add(res);
        f.add(add);
        f.add(sub);
        f.add(mul);
        f.add(div);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        double a=0,b=0,result=0;
        try{
            a = Double.parseDouble(num1.getText());
            b = Double.parseDouble(num2.getText());
        }catch (NumberFormatException ef){
            System.out.println(ef);
        }
        if(e.getSource()==add){
            result = a + b;
            res.setText(String.valueOf(result));
        } 
        if(e.getSource()==sub){
            result = a-b;
            res.setText(String.valueOf(result));
        }
        if(e.getSource()==mul){
            result = a*b;
            res.setText(String.valueOf(result));
        }
        if(e.getSource()==div){
            result = a/b;
            res.setText(String.valueOf(result));
        }
    }
    

    public static void main(String[] args) {
        CalDemo c = new CalDemo();
    }

}
