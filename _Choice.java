import java.awt.*;
public class _Choice{
    Choice choice;
    Frame f;
    _Choice(){
        f = new Frame("Choice Tutorial");
        f.setSize(400,400);
        f.setVisible(true);
        f.setLayout(null);
        choice = new Choice();
        choice.add("Pune");
        choice.add("Mumbai");
        choice.add("Bangalore");
        choice.add("Chennai");

        choice.setBounds(50,50,100,100);
        f.add(choice);

    }
        public static void main(String[] args) {
            new _Choice();  
        }    
}