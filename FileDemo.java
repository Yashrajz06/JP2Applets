import java.awt.*;
public class FileDemo extends Frame{

    FileDemo(String t){
        super(t);
    }

    public static void main(String[] args) {
        Frame f = new Frame("This is dialog");
        f.setVisible(true);
        f.setSize(200,200);
        FileDialog fd = new FileDialog(f,"Demo");
        fd.setVisible(true);
    }
    
}
