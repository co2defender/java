import java.util.Scanner;

public class Gamearrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.print("Enter your name: ");
		String nume = in.next(); // read a string value

		int[] lotosecret = { 23, 45, 34, 56, 77, 34, 66 };

		int nr = lotosecret.length;

		boolean rezultat = false;
		int incercare = 0;
		do {
			System.out.print("Enter secret value: ");
			int secret = in.nextInt(); // read an int value
			for (int i = 0; i < nr; i++) {
				if (secret == lotosecret[i])
					rezultat = true;
			}

			if (rezultat == true) {
				System.out.println("Bravo" + nume + "! Ai nimerit-o");
				break;
			} else {
				System.out.println(nume + ", mai baga o fisa");
			}
			incercare++;
		} while (incercare < 3);

	}

}
