package Inheritance;

public class child extends parent{

	public static void main(String[] args) {
	
			  child object = new child(); //---- all methods of child n parent
			//parent object1 = new parent(); //---- all methods of  parent
			//	parent object2 = new child(); //---- all methods of parent
			
			object.add();
			object.div();
			object.sub();
			object.mul();
			
			
			parent object2 = new child();
			
			object2.add();
			object2.div();
			
			
	}
	
	
	public void add(){
		
		int a=20, b=21, c=a+b;
		System.out.println("Addition of a and b is " + c + " But i am in child class");
		
		
	}



	public void sub(){
	
	int a=20, b=21, c=a+b;
	System.out.println("Substraction of a and b is " + c + " But i am in child class");
	
	
}



	public void mul(){
	
	int a=20, b=21, c=a*b;
	System.out.println("multiplication of a and b is " + c + " But i am in child class");
	
	
}

}
