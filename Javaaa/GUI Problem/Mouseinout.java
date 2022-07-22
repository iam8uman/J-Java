import javax.swing.*;

import org.w3c.dom.events.MouseEvent;

import java.awt.*;  
import  java.awt.event.*;   


class Mouseinout extends JFrame implements MouseListener,MouseMotionListener {
    JTextField t1,t2;   

    public Mouseinout()
    {
        setSize(600,500);

        t1=new JTextField();    
        t2=new JTextField();    

        add(t1);    
        add(t2);    

        setVisible(true);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addMouseMotionListener(this);
        addMouseListener(this);

    }
    // now override the all function of MouseListener
    public void mouseEntered(MouseEvent e)
    {
        t1.setText("IN");
    }
    public void mouseExited(MouseEvent e)
    {
        t1.setText("OUT");
    }
    public void mouseMoved(MouseEvent e)
    {
        String loc="X:"+e.getClientX()+"Y:"+e.getClientY(); 
        t2.setText(loc);

    }
    public void mouseDragged(MouseEvent e){}
    public void mouseClicked(MouseEvent e){}
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}

    public static void main(String[] args)
    {
        new Mouseinout();   
    }

    

}
