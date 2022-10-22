import java.util.Scanner;
// import java.Exception;

class DivisionException {
    
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args)
    
    {
        try {

        System.out.println("Please enter a number ");
        int a=scan.nextInt();

        System.out.println("Enter another number ");
        int b=scan.nextInt();

        int ans=a/b;

        System.out.println(ans);
     } 
     catch (Exception e) {
        //TODO: handle exception
        System.out.println(e.getMessage());
    }
}

    }