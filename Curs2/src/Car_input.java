import java.util.Scanner;

public class Car_input {
	static String brand = "Dacia";
	static String model = "1310";
	static int year = 1989;
	static float cityConsumption;
	static float highwayConsumption = 4.5f;
	static boolean usage = true;
	static float mediumConcumption;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    
		Scanner in = new Scanner (System.in);
		System.out.print("Enter city consumtion value: ");
		cityConsumption = in.nextFloat();  //read an float value
		
		float mediumConcumption = (cityConsumption+highwayConsumption)/2;
		
		System.out.println("My car description is:" + brand + "," + model + "," + year + "," + cityConsumption + "," + highwayConsumption + "," + "usage:" + usage);
		System.out.println("Media consumului este: " +  mediumConcumption);
	}

}
