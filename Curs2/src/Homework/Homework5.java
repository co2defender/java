package Homework;

import java.util.Scanner;

public class Homework5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		/* Homework 5
		for (int i=0; i<=9; i++)
		{
			System.out.println(i);
		} 
	*/	
		/*Homework 6
		
		System.out.println("Primul numar:");
		int a=in.nextInt();
		System.out.println("Al doilea numar:");
		int b=in.nextInt();
		System.out.println("Al treilea numar:");
		int c=in.nextInt();
		System.out.println("Al patrulea numar:");
		int d=in.nextInt();
		System.out.println("Al cincilea numar:");
		int e=in.nextInt();   
		
		
		System.out.println("Sum is:"+(a+b+c+d+e));
		System.out.println("Average is:"+(a+b+c+d+e)/5);
	*/
		
		/*Homework 7
		System.out.println("Introdu numarul:");
		int nr = in.nextInt();
		int i = 1;
		int j = 0;
		int sum = 0;
		while (j < nr)
		{
			System.out.println(i);
			sum = sum + i;
			i = i + 2;
			j ++;
		}
		System.out.println(sum);
	*/	
		
		/*Homework 8
		String a="";
		for (int k=1; k<=10; k++) {
			a=a+k;
			System.out.println(a);
		}
	*/		
		
		
		int count=0;
		String[] multimeNume = new String[100]; 
		int[] multimeVarste = new int[100];

		String name = "";
		
		while(true)
		{			
			System.out.println("Tell me your name: ");
			name = in.next();
			
			if (name.equals("EXIT")) {break;}
			else {
				System.out.println("Hello " + name + ", please enter your age:");
				int varsta = in.nextInt();
				System.out.println(varsta);
			
				multimeNume[count] = name;
				multimeVarste[count] = varsta;
			
				System.out.println("Thank you " + name + " for registration!");
				count ++;
				}
			
		} 
			
		System.out.println("Below you can find a list with " + count + " registred persons");
		System.out.println("Name			" + "Age");
		for (int i=0; i <= count; i++) {
		System.out.println( multimeNume[i] + "				" + multimeVarste[i]);
		}							
		in.close();
}
	
}


