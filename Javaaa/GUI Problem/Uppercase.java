import java.awt.font.*;
import javax.swing.*;   
import java.awt.event.*;    
import java.awt.Color;
import java.awt.Font;  


class Uppercase extends JFrame implements  ActionListener{
     
    JButton click;  
    JTextField t;   

    public Uppercase(){
        setSize(400,500);

        click =new JButton("Click");    
        click.setBounds(180,350,30,30);

        t=new JTextField("ENter Text here");    
        t.setBounds(120,100,300,200);    

        add(t);  add(click);    

        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        click.addActionListener(this);

    }
    // @override 
    public void actionPerformed (ActionEvent e)
    {
        String text=t.getText();    
        t.setText(text.toUpperCase());  

        t.setBackground(Color.cyan);

        Font f=new Font("Ariel",Font.ITALIC,21);    

        t.setFont(f);   



    }
    public static void main(String[] args)
    {
        new Uppercase();    
    }

}
