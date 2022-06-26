class employee{
	int id,salary;
	String name;

	public employee(int id , int salary, String name)
	{
		this.id=id;
		this.salary=salary;
		this.name=name;
	}
	public String toString(){
		return "id, salary and name is "+this.id+this.name+this.salary;
	}
	
	}
	
class Employee{
	public static void main(String[] args){
	employee E= new employee(23,22222,"Sumannn");
	System.out.println(E);
}
} 
