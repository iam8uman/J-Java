 abstract class  Sportperson{
	String name;
	int age;
	
	public Sportperson(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	public void displayinfo(){
		System.out.println("Name="+name+"Age="+age);
		}
	
	abstract void display();
	}
	
class Football extends Sportperson{
	int goals;
	
	public Football(String name, int age, int goals){
		super(name,age);
		this.goals=goals;
		}
	
	public void display(){
		System.out.println(super.displayinfo() + "and NO of goals="+this.goals);
		}
	}
	
class Cricket extends Sportperson{
	int runs;
	
	public Cricket(String name, int age, int runs){
		super(name,age);
		this.runs=runs;
		}
	
	public void display(){
		System.out.println(super.displayinfo() + "and NO of runs="+this.runs);
		}
	}
	
class abstract_class{
	public static void main(String[] args){
		Football F=new Football("Ronaldo",23,101);
		F.display();
		
		Cricket C=new Cricket("AB Deviliers",25,1700);
		C.display();
		
	}
}	
