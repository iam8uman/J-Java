import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class chatserver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            ServerSocket ss = new ServerSocket(5000);
            System.out.println("Server Running on 5000 port");

            Socket s = ss.accept();
            System.out.println("Client is also connected");

            DataInputStream dis;
            DataOutputStream dos;

            while (true) {
                dis = new DataInputStream(s.getInputStream());
                String cMsg = (String) dis.readUTF();

                System.out.println("Client says: " + cMsg);

                System.out.println("Type your reply");

                String reply = scan.next();
                dos = new DataOutputStream(s.getOutputStream());

                dos.writeUTF(reply);
                dos.flush();

                if (cMsg.toLowerCase().equals("bye")) {
                    break;
                }
            }
            scan.close();
            s.close();
            ss.close();
            dis.close();
            dos.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
