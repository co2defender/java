package formegeometrice;

public class Rectangle extends ShapeForm {
	public int width;
	public int perimeter;
	public void describe () {
		super.describe();
		System.out.println("Dreptunghiul are in plus latime" + width + " si perimetrul " + perimeter);
		
	}
	

}
