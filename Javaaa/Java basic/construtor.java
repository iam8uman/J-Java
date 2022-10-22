class shape{
    int x,y,l,w;

    public shape(int x, int y, int l, int w)
    {
        this.x=x;
        this.y=y;
        this.l=l;
        this.w=w;

    }
    public shape(int l, int w)
    {
        this(0, 0, l, w);
    }
    public shape()
    {
        this(0, 0, 1, 1);
    }
    public void display()
    {
        System.out.print("x="+this.x+"Y="+this.y+"L="+l+"W="+w);
    }
}


public class construtor {
    public static void main(String[] args)
    {
        shape s=new shape(2,2,2,2);
        s.display();
        shape s2=new shape(5,5);
        s2.display();
        
    }
}
