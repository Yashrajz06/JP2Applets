import java.awt.*;
public class Card {

    Frame f;
    Card(){
        f = new Frame("Card Layout Demo");
        CardLayout c = new CardLayout(10,10);
        f.setLayout(c);
        f.setVisible(true);
        f.setSize(200,200);
        f.add(new Button("Button"));
        f.add(new Button("Panel"));
        f.add(new Button("Window"));
    }
    public static void main(String[] args) {
        new Card();
    }
}
