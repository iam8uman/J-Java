import java.awt.*;
import java.awt.event.*;    





class Addsub extends Frame implements ActionListener{
    TextField first,second,ans; 
    Button sum,sub; 

    public Addsub()
    {
        first=new TextField("Enter First Number");  
        second=new TextField("Enter second Number");  
        ans=new TextField();    
        sum=new Button("+");    
        sub=new Button("-");    
        setSize(500,699);

        first.setBounds(50,60,40,25);
        second.setBounds(200,60,40,25);
        ans.setBounds(150,160,40,25);
        sub.setBounds(200,300,40,25);
        sum.setBounds(50,300,40,25);

        add(sub);           
        add(sum);           
        add(first);           
        add(second);           
        add(ans);           

        ans.setEditable(false);
        setVisible(true);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        // setDefaultCloseOperation(Frame.EXIT_ON_CLOSE);

        sub.addActionListener(this);
        sum.addActionListener(this);

    }
    // @Override
    public void actionPerformed(ActionEvent e)
    {
        int num1=Integer.parseInt(first.getText()); 
        int num2=Integer.parseInt(second.getText()); 

        if(e.getSource()==sum)
        {
            int sum=num1+num2;  
            ans.setText(" "+sum);

        }
        else
        {
            int sub=num1-num2;  
            ans.setText(" "+sub);
        }
    }

    // main function start from here
    public static void main(String[] args)
    {
        new Example();  
    }

    
}

