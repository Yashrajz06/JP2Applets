import java.awt.*;
import javax.swing.*;
/*
<applet code="TableDemo.class" width=400 height=200>
</applet>
*/

public class TableDemo extends JApplet {
    Container pane;
    JTable table;
    int v,h;
    
    JScrollPane sPane;

    public void init() {
            pane = getContentPane();
            pane.setLayout(new BorderLayout());
            final Object[][] data = {
                {"Yashraj","Zagade","2206209"},
            };
            final String[] label = {"Name","Lastnamt","Enrollno"};
            table = new JTable(data, label);
            v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
            h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
            sPane = new JScrollPane(table, v, h);
            pane.add(sPane,BorderLayout.CENTER);
    }
}

