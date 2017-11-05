
public class Car {
	static String brand = "Dacia";
	static String model = "1310";
	static int year = 1989;
	static float cityConsumption = 6.3f;
	static float highwayConsumption = 4.5f;
	static boolean usage = true;
	static float mediumConcumption = (cityConsumption+highwayConsumption)/2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("My car description is:" + brand + "," + model + "," + year + "," + cityConsumption + "," + highwayConsumption + "," + "usage:" + usage);
		System.out.println("Media consumului este: " +  mediumConcumption);
	}

}
