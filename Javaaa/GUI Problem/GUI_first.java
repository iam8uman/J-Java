import java.awt.*;

import javax.swing.ButtonGroup;
import javax.swing.plaf.LabelUI;

public class GUI_first {
    public GUI_first(){
        Frame f=new Frame("Form");  //form ko top view yehi ho
        f.setSize(400,500);

    Label l=new Label("Name");  
    l.setBounds(50,60,20,30);

    TextField tf=new TextField();   
    tf.setBounds(150,60,100,30);

    Button b=new Button("submit");  
    b.setBounds(150,350,100,35);

    f.add(b);   
    f.add(tf);  
    f.add(l);  
    f.setVisible(true);
    f.setLayout(null);


    
    }
    public static void main(String[] args)
    {
        new GUI_first();    
    }
}
