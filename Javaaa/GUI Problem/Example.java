import java.awt.*;  
import java.awt.event.*;
import java.lang.NullPointerException;  

import javax.swing.plaf.metal.MetalBorders.TextFieldBorder;    


public class Example extends Frame implements ActionListener{
        TextField first , second,ans;   
        Button sub, sum;    

        public Example()
        {
            first=new TextField("ENter first number");  
            second=new TextField(); 
            sum=new Button("SUM");  
            sub=new Button("DIFF");  

            setSize(300,350);
            first.setBounds(50,60,40,25);
            second.setBounds(200,60,40,25);
            ans.setBounds(140,160,40,25);
            sum.setBounds(50,300,40,25);
            sub.setBounds(200,300,40,25);

            add(sub);   add(sum);   add(ans);   add(first); add(second);    

            ans.setEditable(false);

            setVisible(true);
            setLayout(null);

            sum.addActionListener(this);
            sub.addActionListener(this);
        }
        // @Override
        public void actionPerformed(ActionEvent e)
        {
            int num1=Integer.parseInt(first.getText()); 
            int num2=Integer.parseInt(second.getText()); 

            if(e.getSource()==sum)
            {
                int sum=num1+num2;  
                ans.setText(""+sum);
            }
            else
            {
                int sub=num1-num2;  
                ans.setText(""+sub);    

            }
        }
        public static void main(String[] args)
        {
            new Example();  
        }
    }
