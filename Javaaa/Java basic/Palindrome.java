import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        
        System.out.println("ENter anything to check palindrome or not ");
        
        // take input from user
        String alpha=scan.next();  
        
        // Display that inputed String 
        System.out.println("You entered = "+alpha);

        char first;
        String reverse="";

        
        for(int i=0;i<alpha.length();i++)
        {
            first=alpha.charAt(i);
            reverse=first+reverse;
        }

        if(alpha.equals(reverse))
        {
            System.out.println("Palindrome");

        }
        else
        {
            System.out.println("Not Palindrome");
        }

    }
}
