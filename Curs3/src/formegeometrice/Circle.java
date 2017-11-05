package formegeometrice;

public class Circle extends ShapeForm {
	boolean hascorner=false;
	public void describe () {
		super.describe();
		System.out.println("Cercul nu are colturi");
	}
}
