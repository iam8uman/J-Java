class employee{
    int id,salary;
    String name,post;

    public employee(int id,int salary,String name,String post)
    {
        this.id=id;
        this.salary=salary; 
        this.name=name; 
        this.post=post; 
    }
    public String toString()
    {
        return ("ID="+this.id+"salary="+this.salary+"name==="+this.name+"Post=="+this.post);

    }
    

}
class OverloadToString{
    public static void main(String[] args) {
        employee e=new employee(5, 3500, "Sumannn", "Programmer");
        System.out.println(e);
    }
}

