import java.util.Scanner;
import java.io.*;
import java.net.*;  

class Client {
    public static void main(String[] args)
    {
        try{
            Socket s=new Socket("localhost",4000);  
            System.out.println("Please Enter a number");    
            
            Scanner scan=new Scanner(System.in);    
            int num=scan.nextInt(); 

            DataOutputStream dos=new DataOutputStream(s.getOutputStream()); 

            dos.writeInt(num);
            dos.flush();

            DataInputStream dis=new DataInputStream(s.getInputStream());    

            int ans=dis.readInt();  
            System.out.print("The square is "+ans);

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
