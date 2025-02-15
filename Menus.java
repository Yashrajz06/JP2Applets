import java.awt.*;

public class Menus extends Frame{
    MenuBar bar;
    Menu m1,m2;
    MenuItem i1,i2,i3,i4;
    CheckboxMenuItem citem ;
    Menus(){
        setSize(400,400);
        setVisible(true);
        bar = new MenuBar();
        m1 = new Menu("File");
        m2 = new Menu("Edit");
        bar.add(m1);
        bar.add(m2);
        i1 = new MenuItem("Open");
        i2 = new MenuItem("Save");
        i3 = new MenuItem("Cut");
        i4 = new MenuItem("Paste");
        m1.add(i1);
        m1.addSeparator();
        m1.add(i2);
        m2.add(i3);
        m2.add(i4);
        citem = new CheckboxMenuItem("Light", true);
        m2.addSeparator();
        m2.add(citem);
        setMenuBar(bar);
        }
        public static void main(String[] args) {
            new Menus();
        }

}
