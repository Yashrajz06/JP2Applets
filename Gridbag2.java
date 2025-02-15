import java.awt.*;

public class Gridbag2 {
    Frame f;
    GridBagConstraints gbc;
    Gridbag2(){
        f = new Frame("Grid bag Tutorial");
        gbc = new GridBagConstraints();
        f.setVisible(true);
        f.setSize(400,400);
        f.setLayout(new GridBagLayout());

        gbc.gridx = 0;
        gbc.gridy = 0;
        f.add(new Button("Button1"),gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 1;
        f.add(new Button("Button1"),gbc);
        
        gbc.gridx = 2;
        gbc.gridy = 2;
        f.add(new Button("Button1"),gbc);
        
        gbc.gridx = 3;
        gbc.gridy = 3;
        f.add(new Button("Button1"),gbc);

    }
    public static void main(String[] args) {
        new Gridbag2();
    }
}