package Homework;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.print("Please, tell me a number: ");
		int nr = in.nextInt();  //read an int value
		
		if (nr > 0) {
			System.out.println("Numarul " + nr + " este pozitiv");
		}
		else if (nr < 0) {
			System.out.println("Numarul " + nr + " este negativ");
		}
		else {
			System.out.println("Numarul " + nr + " este zero");
		}
			
		in.close();
	}

}
