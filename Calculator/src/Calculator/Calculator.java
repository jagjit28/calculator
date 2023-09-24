package Calculator;
public class Calculator {

	public static void main(String[] args) {
		System.out.println("starting Calculator");
		run();		
		
	}

	public static void run() {
		// this is the method that I will use to 
		// run my Method Choreography 	
		DoArithematic a = new DoArithematic();
		
		double add = a.Add(2, 2);
		System.out.println(add);
		
		double sub = a.Subtract(2, 2);
		System.out.println(sub);
		
		double multi = a.Multiply(2, 2);
		System.out.println(multi);
		
		double div = a.Divide(2, 2);
		System.out.println(div);

	}
	
}


