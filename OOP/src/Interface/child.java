package Interface;

public class child implements parent {
	
	public static void main(String args[]){
		
		// 2scenarios are possible 
		child obj1 = new child();
		
		obj1.add();
		obj1.sub();
		obj1.mul();
		obj1.Div();
		
		parent obj2= new child();
		
		obj2.add();
		obj2.sub();
		
		
		
		
	}
	
	public void add(){
		
		System.out.println("I do addition but i am in child class");
		
	}
	
	
	public void sub(){
		
		System.out.println("I do Substraction but i am in child class");
		
	}

	
	public void mul(){
		
		System.out.println("I do multipication but i am in child class");
		
		}
	
	public void Div(){
		
		
		System.out.println("I do division but i am in child class");
		
	}
}
