import java.io.*;

class BufferRead {
    
    public static void main(String[] args) throws IOException
    {
        FileInputStream fis= new FileInputStream("Original.jpg");   

        FileOutputStream fos=new FileOutputStream("DupliBuffer.jpg"); 

        BufferedInputStream bis=new BufferedInputStream(fis);   

        BufferedOutputStream bos=new BufferedOutputStream(fos); 

        int content;    
        while((content=bis.read())!=-1)
        {
            bos.write(content);
        }
        fis.close();
        bis.close();
        fos.close();
        bos.close();

    }
}
