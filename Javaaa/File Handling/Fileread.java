import java.io.*;   

class Fileread {
    public static void main(String[] args) throws IOException
    {
        FileInputStream fis=new FileInputStream("New.txt"); 
        int content=fis.read(); 
        System.out.println(content);
        fis.close();
    }
}
