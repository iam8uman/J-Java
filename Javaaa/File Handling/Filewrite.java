import java.io.*;


class Filewrite {
    public static void main(String[] args) throws IOException
    {
        FileOutputStream fout=new FileOutputStream("New.txt");  
        String a="NCIT-The Beginning Of All The Success";    
        byte[] b=a.getBytes();  
        fout.write(b);
        fout.close();
    }
}

