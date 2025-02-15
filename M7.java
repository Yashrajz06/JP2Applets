import java.awt.*;

public class M7 extends Frame {
    public M7() {
        setTitle("BorderLayout Demo");
        setSize(400, 300);
        setLayout(new BorderLayout(2, 2));

        // Adding buttons in different positions
        add(new Button("North"), BorderLayout.NORTH);
        add(new Button("South"), BorderLayout.SOUTH);
        add(new Button("East"), BorderLayout.EAST);
        add(new Button("West"), BorderLayout.WEST);
        add(new Button("Center"), BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new M7();
    }
}
    