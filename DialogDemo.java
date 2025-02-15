import java.awt.*;

public class DialogDemo extends Dialog {
    DialogDemo(Frame parent , String title){
        super(parent,title,false);
        setLayout(new FlowLayout());
        setSize(300,300);
        add(new Button("Button"));
    }
    public static void main(String[] args) {
        Frame f = new Frame();
        DialogDemo db = new DialogDemo(f, "Dialog");
        db.setVisible(true);
    }
}