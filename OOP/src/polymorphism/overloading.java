package polymorphism;

public class overloading {

	public static void main(String[] args) {
		overloading object = new overloading();
		object.add(45,96);
		object.add(25.25, 63);
			
	}	
		
		
		public void add(int a, int b)
		{
			int c=a+b;
			System.out.println("sum of two integers is " + c );
			
		}

		
		public void add(double a, int b)
		{
			double c=a+b;
			System.out.println("sum of two integers is " + c );
			
		}
		
	}


