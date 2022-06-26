import java.io.*;   

class Copyfiles {
    public static void main(String[] args)
    {
        try{
            // i will copy img files here 

            FileInputStream fis= new FileInputStream("Original.jpg");   

            FileOutputStream fos=new FileOutputStream(("Duplicate.jpg"));   

            int content;    
            while((content=fis.read())!=-1)
            {
                fos.write(content);
            }
            fis.close();
            fos.close();
        }catch(IOException e)
        {
            System.out.println("INPUT output exception aayo hai guys");
        }
    }
}
