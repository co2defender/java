package calculator;

public class PlusMultiplication extends SubstractionAddition {
	
	public PlusMultiplication () {
		System.out.println("Initializare constructor Multiplicare");
	}
	
	public int multiplication (int a, int b) { 
		return (a * b);
	}
	
	public int sum (int a, int b) {
		System.out.println("adunare din multiplicare");
		//return (a + b); 
		return super.sum(a, b);
	}
	
	
}
