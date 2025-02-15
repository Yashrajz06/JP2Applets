import java.applet.Applet;
import java.awt.*;

public class M6 extends Applet {
    List newspaperList;
    Label lbl;

    public void init() {
        setLayout(null);

        lbl = new Label("Select Newspapers:");
        lbl.setBounds(20, 20, 150, 20);
        add(lbl);

        newspaperList = new List(5, true); // List with multiple selection
        newspaperList.setBounds(20, 50, 150, 100);

        // Adding newspaper names
        newspaperList.add("The Times of India");
        newspaperList.add("The Hindu");
        newspaperList.add("Sakal");
        newspaperList.add("Lokmat");
        newspaperList.add("Deccan Chronicle");
        newspaperList.add("The Economic Times");
        newspaperList.add("Business Standard");

        add(newspaperList);
    }
}
/*
 <applet code="M6.class" width=250 height=200>
 </applet>
 */
