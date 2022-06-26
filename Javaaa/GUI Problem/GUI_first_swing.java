import javax.swing.*;   
// import java.awt.event.*;

// package GUI Problem;

public class GUI_first_swing {
    public GUI_first_swing()
    {
        JFrame f=new JFrame("Form");  //form ko top view yehi ho
        f.setSize(400,500);

    JLabel l=new JLabel("Name");  
    l.setBounds(50,60,20,30);

    JTextField tf=new JTextField();   
    tf.setBounds(150,60,100,30);

    JButton b=new JButton("submit");  
    b.setBounds(150,350,100,35);

    f.add(b);   
    f.add(tf);  
    f.add(l);  
    f.setVisible(true);
    f.setLayout(null);


    
    }
    public static void main(String[] args)
    {
        new GUI_first_swing();    
    }
    }
