import calculator.PlusMultiplication;
import calculator.SubstractionAddition;
import formegeometrice.Rectangle;
import formegeometrice.Square;
import school.Profesor;
import school.Math;
import school.Physics;


public class MainSubstractionAddition {

	public static void main(String[] args) {
		SubstractionAddition calculator = new SubstractionAddition();
		int sum = calculator.sum(2, 3);
		System.out.println(sum);
		int diff = calculator.diff(3, 2);
		System.out.println(diff);
		
		PlusMultiplication calculatoravansat = new PlusMultiplication();
		int  suma2 = calculatoravansat.sum(10,2);
		System.out.println(suma2);
		int  produs = calculatoravansat.multiplication(10,2);
		System.out.println(produs);
		
		Math profesormatematica = new Math();
		Physics profesorfizica = new Physics();
		profesormatematica.actions();
		profesorfizica.actions();
		System.out.println(profesormatematica.name);
		System.out.println(profesorfizica.name);
		
		Rectangle dreptunghi = new Rectangle();
		dreptunghi.describe();
		
		Square cerc =  new Square();
		cerc.describe();
		
	}

}
