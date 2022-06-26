import java.io.*;   

class ReadAllcontent {
    public static void main(String[] args) throws IOException
    {
        FileInputStream fis=new FileInputStream("New.txt"); 
        int content;    
        while((content=fis.read())!=-1)
        {
            System.out.println((char)content);
        }
        fis.close();
    }
}
