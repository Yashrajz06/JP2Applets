import java.applet.Applet;
import java.awt.*;

public class M5 extends Applet {
    List cityList;
    Label lbl;

    public void init() {
        setLayout(null);

        lbl = new Label("Select a City:");
        lbl.setBounds(20, 20, 100, 20);
        add(lbl);

        cityList = new List(5,false);
        cityList.setBounds(20, 50, 150, 100);

        cityList.add("Kolkata");
        cityList.add("Pune");
        cityList.add("Hyderabad");
        cityList.add("Ahmedabad");
        cityList.add("Jaipur");
        cityList.add("Lucknow");
        cityList.add("Mumbai");
        cityList.add("Delhi");
        cityList.add("Bangalore");
        cityList.add("Chennai");

        add(cityList);
    }
}
/*
 <applet code="M5.class" width=250 height=200>
 </applet>
 */