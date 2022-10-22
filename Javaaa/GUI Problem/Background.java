import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.*;
import java.awt.event.*;

class Background implements ActionListener{
    JFrame f;   
    JButton black,red,blue; 

    public Background(){
        f=new JFrame("Background"); 
        f.setSize(400,500); 

        black=new JButton("Balck"); 
        
        red=new JButton("Red"); 
        
        blue=new JButton("Blue"); 

        // black.setBounds(150,50,50,20);
        // red.setBounds(150,100,50,20);
        // blue.setBounds(150,150,50,20);

        f.add(black);    f.add(blue);   f.add(red); 

        f.setVisible(true);
        f.setLayout(new FlowLayout(FlowLayout.CENTER));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        black.addActionListener(this);   
        red.addActionListener(this);
        blue.addActionListener(this);

    }
    // @overide
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==black)
        {
            f.getContentPane().setBackground(Color.BLACK);
        }
        else if(e.getSource()==red)
        {
            f.getContentPane().setBackground(Color.RED);
        }
        else
        {
            f.getContentPane().setBackground(Color.blue);
        }
    }
    public static void main(String[] args)
    {
        new Background();   
    }
}
