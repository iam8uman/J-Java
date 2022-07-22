import javax.swing.*;
import java.awt.event.*;    
import java.awt.*;  
import java.awt.Color;  


class Bgcolor extends JFrame implements ActionListener{
    JButton black,red,blue; 
    
    public Bgcolor()
    {
        setSize(600,500);

        black=new JButton("Black"); 
        red=new JButton("Red"); 
        blue=new JButton("Blue"); 
        add(black); 
        add(blue); 
        add(red);
        
        setVisible(true);   
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        black.addActionListener(this);
        blue.addActionListener(this);
        red.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==black)
        {
            getContentPane().setBackground(Color.BLACK);  
        }
        else if(e.getSource()==red)
        {
            getContentPane().setBackground(Color.RED);
        }
        else
        {
            getContentPane().setBackground(Color.blue);
        }
    }

    public static void main (String[] args)
    {
        new Bgcolor();  
    }
    

}
