import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class chatclient {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);

        try{
            Socket s=new Socket("localhost",5000);
            DataInputStream dis;
            DataOutputStream dos;

            while(true)
            {
                System.out.println("Your msg for the server");
                dos=new DataOutputStream(s.getOutputStream()); 
                String msg=scan.next();

                dos.writeUTF(msg);
                dis=new DataInputStream(s.getInputStream());    
                String sReply=(String)dis.readUTF();    
                 System.out.println("Server says:"+sReply);

                 if(msg.toLowerCase().equals("bye"))
                 {
                    break;
                 }
            }
            dis.close();
            scan.close();
            dos.close();
            s.close();

        }catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
