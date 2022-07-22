import java.net.*;
import java.io.*;




class serverpali {
    public static void main(String[] args)
    {
        try{
            ServerSocket ss=new ServerSocket(4000); 
            System.out.println("Server Running at 4000");

            Socket s=ss.accept();   

            System.out.println("Client Connected");

            DataInputStream dis=new DataInputStream(s.getInputStream());    

            String alpha=dis.readUTF();  
            // Display that inputed String 
            System.out.println("You entered = "+alpha);
    
            char first;
            String reverse="";
    
            
            for(int i=0;i<alpha.length();i++)
            {
                first=alpha.charAt(i);
                reverse=first+reverse;
            }
            String sq="";
    
            if(alpha.equals(reverse))
            {
                 sq="Palindrome";
    
            }
            else
            {
                 sq="Not Palindrome";
            }
// mcmcmcmcm    

            DataOutputStream dos=new DataOutputStream(s.getOutputStream()); 

            dos.writeUTF(sq);
            dos.flush();

            dos.close();
            dis.close();
            ss.close();
            s.close();

        }catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }

}
