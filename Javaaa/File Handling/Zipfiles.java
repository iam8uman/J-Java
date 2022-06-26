import java.util.zip.*; 
import java.io.*;   

class Zipfiles {
    public static void Zip(File path) throws IOException
    {
        if(!path.isDirectory())
        {
            throw new IllegalArgumentException("This is not a valid Path");  
        }
    File[] files=path.listFiles();  

    if(files.length==0)
    {
        throw new IllegalArgumentException("Folder Empty"); 
    }

    FileOutputStream fos=new FileOutputStream("Myfolder.zip");  
    ZipOutputStream zos = new ZipOutputStream(fos); 

    for(File file:files)
    {
        FileInputStream fis=new FileInputStream(file);  

        ZipEntry ze=new ZipEntry(file.getName());   
        // ze.putNextEntry();  

        int data;   
        while((data=fis.read())!=-1)
        {
            zos.write(data);
        }
        fis.close();
        fos.close();
        zos.close();
    }
    public static void main(String[] args)
    {
        Zip("File Handling");
    }
}
