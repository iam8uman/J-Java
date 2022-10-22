class voterException extends Exception{
    public voterException(String msg)
    {
        super(msg);
    }
}


class alpha  {
    String name;
    int age;

    public alpha(String name,int age) throws voterException
    {

        if(age<18)
        {
            throw new voterException("Age is not sufficient for voting ");
        }
        else
        {
            this.name=name;
            this.age=age;
        }
    }
    public String toString()
    {
        return("You can voteeee");
    }
    
    
}

class Voter{
    public static void main(String[] args)
    {
        try{

            alpha a=new alpha("smsss", 12);
            System.out.println(a);
        }catch(voterException e)
        {
            System.out.println("exxxxceptin caught");
        }

    }
}