import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
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
class Deserialize{
    public static void main(String[] args)
    {
        try{

            FileInputStream fis=new FileInputStream("apple.txt"); 
            ObjectInputStream os=new ObjectInputStream(fis);  

            Student obj=(Student) os.readObject();    

            obj.print();
            os.close();
            fis.close();    

        }catch(IOException e)
        {
            System.out.println(e.getMessage()); 
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Class Nai xaina hai guys!!!");
        }
    }
}
