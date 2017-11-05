package formegeometrice;

public class Square extends Rectangle {
	boolean lengthEqualsWidth=true;
	public void describe () {
		super.describe();
		System.out.println("Patratul are latura egala cu lungimea");	
	}

}
