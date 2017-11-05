package Homework;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		
		System.out.print("Please, tell me a number between 1 and 7: ");
		int nr = in.nextInt();  //read an int value
		
		String weekDay="";
		switch (nr) {
		 case 1:  weekDay = "Monday";
         break;
		 case 2:  weekDay = "Tuesday";
         break;
		 case 3:  weekDay = "Wednesday";
         break;
		 case 4:  weekDay = "Thursday";
         break;
		 case 5:  weekDay = "Friday";
         break;
		 case 6:  weekDay = "Saturday";
         break;
		 case 7:  weekDay = "Sunday";
		} 
		System.out.println(weekDay);
		in.close();
	}

}
