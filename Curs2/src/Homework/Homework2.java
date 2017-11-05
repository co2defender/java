package Homework;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.print("Please, tell me first number: ");
		int nr1 = in.nextInt();  //read an int value
		
		System.out.print("Please, tell me second number: ");
		int nr2 = in.nextInt();  //read an int value
		
		System.out.print("Please, tell me third number: ");
		int nr3 = in.nextInt();  //read an int value
			
		if ((nr1 > nr2) && (nr1 > nr3)) {
			System.out.println(nr1);
		}
		else if ((nr2 > nr1) && (nr2 > nr3)) {
			System.out.println(nr2);
		}
		else {
			System.out.println(nr3);
		}
		
		in.close();
	}

}
