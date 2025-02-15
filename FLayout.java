import java.awt.*;

public class FLayout {
        Frame f;
        Button b1,b2,b3;
        FlowLayout flowLayout;
        FLayout(){
            f = new Frame("Flow Layout Demo");
            f.setVisible(true);
            f.setSize(200,200);
            flowLayout = new FlowLayout(FlowLayout.CENTER,10,10);
            f.setLayout(flowLayout);

            b1 = new Button("Button1");
            b2 = new Button("Button2");
            b3 = new Button("Button3");
            f.add(b1);
            f.add(b2);
            f.add(b3);
        }
        public static void main(String[] args){
            new FLayout();
        }
}
