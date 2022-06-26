import java.awt.*;  
import java.awt.event.*;    

class ButtonOnForm extends Frame implements ActionListener{
    TextField tf;   
    Button b;   

    public  ButtonOnForm(){
        tf=new TextField(); 
        b=new Button("click");  
        setSize(500,400);   

        tf.setBounds(200,50,30,40);
        b.setBounds(200,250,30,40);

        add(b); 
        add(tf); 
        
        setVisible(true);
        setLayout(null);
        // setDefaultCloseOperation(Frame.EXIT_ON_CLOSE);   Yo garna paidaina hai awt ma chai But swing vaye ko vaye chai paine thiyoo

        b.addActionListener(this);


    }
    // @Override
    public void actionPerformed(ActionEvent e)
    {
        tf.setText("NCIT"); 
    }

    // main function
    public static void main(String[] args)
    {
        new ButtonOnForm(); 
    }

}