package oop;

public class main {

	public main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Vehicle vehicle1= new Vehicle();
			System.out.println(vehicle1.getName());
			
			vehicle1.setName("city");
			System.out.println(vehicle1.getName());
			System.out.println(vehicle1.count);
			
			Vehicle vehicle2= new Vehicle("civic", "black", "2012", "honda", "0800");
			System.out.println(vehicle2.getColor());
			vehicle2.setColor("green");
			System.out.println(vehicle2.getColor());
			System.out.println(vehicle2.getSpeed());
			System.out.println(vehicle1.count);
			
			System.out.println(Vehicle.getVehicle());
	}	

}
