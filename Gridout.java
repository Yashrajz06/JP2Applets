import java.awt.*;
public class Gridout{
    Frame f;
    GridLayout g;
    Gridout(){
        f = new Frame("Grid Layout");
        f.setVisible(true);
        f.setSize(200,200);
        g = new GridLayout(2,2,25,25);
        f.setLayout(g);
        f.add(new Button("Button1"));
        f.add(new Button("Button2"));
        f.add(new Button("Button3"));
        f.add(new Button("Button4"));
    }

    public static void main(String[] args) {
        new Gridout();
    }
}