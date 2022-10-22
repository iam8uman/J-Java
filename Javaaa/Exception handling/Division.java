import java.util.Scanner;
import java.util.InputMismatchException;

public class Division {
         static Scanner scan=new Scanner(System.in); 

        public static void main(String[] args)
        {
            try{
                System.out.println("Enter a number");
                int a=scan.nextInt();   

                System.out.println("Enter another number");
                int b=scan.nextInt();   

                int ans=a/b;    
                System.out.println("The result is "+ans);

            }catch(ArithmeticException e)
            {
                System.out.println(e.getMessage());
            }
            //catch(InputMismatchException e)
            // {
            //     System.out.println("Eyy please enter the valid type");
            // }
            finally{
                System.out.println("The End!!!!");
            }
        }
}
