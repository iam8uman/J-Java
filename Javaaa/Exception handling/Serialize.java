import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
    String name;    

    public Student(String name)
    {
        this.name=name; 
    }
    public void print()
    {
        System.out.println(this.name);  
    }
}
class Serialize{
    public static void main(String[] args)
    {
        Student s=new Student("SumanTheProgrammer");    
        try{
            FileOutputStream fos=new FileOutputStream("apple.txt"); 
            ObjectOutputStream os=new ObjectOutputStream(fos);  

            os.writeObject(s);
            os.close();
            fos.close();
        }catch(IOException e)
        {
            System.out.println(e.getMessage()); 
        }
    }
}
