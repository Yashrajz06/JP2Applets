import java.awt.*;

public class GridBag extends Frame{
    GridBagConstraints gbc ;
    Label user,pass;
    TextField u,p;
    GridBag(){
            //Adding the Frame first
            setVisible(true);
            setSize(400,300);
            setLayout(new GridBagLayout());
            gbc = new GridBagConstraints();
            gbc.insets = new Insets(5, 5, 5, 5);
            user = new Label("Username");
            pass = new Label("Password");
            u = new TextField(25);
            p = new TextField(25);

            //
            gbc.gridx = 0;
            gbc.gridy = 0;
            add(user,gbc);
            //
            gbc.gridx = 1;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            gbc.weightx = 1.0;
            add(u,gbc);

            gbc.fill = GridBagConstraints.NONE;
            gbc.weightx = 0;

            gbc.gridx = 0;
            gbc.gridy = 1;
            add(pass,gbc);
            //
            gbc.gridx = 1;          
            gbc.fill = GridBagConstraints.HORIZONTAL;
            gbc.weightx = 1.0;
            add(p,gbc);

            gbc.fill = GridBagConstraints.NONE;
            gbc.weightx = 0;

            gbc.gridx = 1;
            gbc.gridy = 2;
            // gbc.fill = GridBagConstraints.HORIZONTAL;

            
            add(new Button("Submit"),gbc);


    }
    public static void main(String[] args) {
        new GridBag();
    }
}
