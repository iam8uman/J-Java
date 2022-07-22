import java.net.*;
import java.io.*;




class Server {
    public static void main(String[] args)
    {
        try{
            ServerSocket ss=new ServerSocket(4000); 
            System.out.println("Server Running at 4000");

            Socket s=ss.accept();   

            System.out.println("Client Connected");

            DataInputStream dis=new DataInputStream(s.getInputStream());    

            int num=dis.readInt();  
            int sq=num*num; 

            DataOutputStream dos=new DataOutputStream(s.getOutputStream()); 

            dos.writeInt(sq);
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
