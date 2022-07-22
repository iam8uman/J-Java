import java.awt.*;  
import java.awt.event.*;
import java.util.logging.Formatter;




class onclickNcit extends Frame implements ActionListener{
    TextField t;    
    Button b;   

    public onclickNcit()
    {
        t=new TextField(); 
        t.setBounds(100,200,70,23); 

        b=new Button("Click");  
        b.setBounds(300,200,45,35);

        setSize(500,500);
        add(b); 
        add(t); 

        setVisible(true);
        setLayout(null);
        // setDefaultCloseOperation(Frame.EXIT_ON_CLOSE);  

        b.addActionListener(this);
    }

    // override 
    public void actionPerformed(ActionEvent e)
    {
        t.setText("NCIT");
    }


    public static void main(String[] args)
    {
        new onclickNcit();  
    }
}
