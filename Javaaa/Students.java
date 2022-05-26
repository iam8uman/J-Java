class Address{
	String city;
	String ward;
	
	public Address(String city,String ward){
	this.city=city;
	this.ward=ward;
	}
	public void display(){
	System.out.println(" the city and ward is "+ city+ "and " + ward);
	}
	
}

class Students{
	String name;
	Address add;
	
	public Students(String name, Address add)
	{
	this.name=name;
	this.add=add;
	}
	public void displayyy(){
	System.out.println("name is "+this.name);
	this.add.display();
	}
	
	public static void main(String[] args){
		Address a=new Address("Kathamndu","20");
		Students s=new Students("sumannn", a);
		s.displayyy();	
	
}
}

