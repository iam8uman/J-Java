import java.util.Scanner;
import java.security.spec.EncodedKeySpec;
import java.util.InputMismatchException;
class SemException extends Exception
{
    public SemException(String msg)
    {
        super(msg); 
    }
}

class Student
{
    String name;    
    int sem;    

    public Student(String name,int sem) throws SemException
    {
    if(sem>8|| sem<1)
    {
        throw new SemException("Enter Semester");   
    }
    else
    {
        this.name=name; 
        this.sem=sem;   
    }
    }
}

public class Alpha {
    public static void main(String[] args)
    {
        try{
            Student s=new Student("SumanTheProgrammer",10); 
        }catch(SemException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}
