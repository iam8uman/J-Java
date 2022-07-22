import java.util.Scanner;
import java.io.*;
import java.net.*;  

class clientpali {
    public static void main(String[] args)
    {
        try{
            Socket s=new Socket("localhost",4000);  
            System.out.println("Enter Anything to check palindrome");    
            
            Scanner scan=new Scanner(System.in);    
            String alpha=scan.next(); 

            DataOutputStream dos=new DataOutputStream(s.getOutputStream()); 

            dos.writeUTF(alpha);
            dos.flush();

            DataInputStream dis=new DataInputStream(s.getInputStream());    

            String ans=dis.readUTF();  
            System.out.print("The Result is "+ans);

            scan.close();
            dis.close();
            dos.close();
            s.close();
        }catch(IOException e)
        {
            System.out.println("Exception caught from client side ");
        }
    }

}
