<<<<<<< HEAD
package Homework;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
				
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


=======
package Homework;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		//DEFINE VOWELS ARRAY
		char[] vowels = {'a', 'e', 'i', 'o', 'u'};
		
		//INPUT CHARACTER
		
		boolean check=true;
		while(check) {
			System.out.print("Please, enter the character: ");
			String s = in.next();  
			
			char c = s.charAt(0);
			
			int ascii = (int) c; 
			
			//CHECK LENGTH
			int marime = s.length();
			if (marime > 1) {
				System.out.println("Eroare!Introduceti un singur caracter");
				}
			//CHECK GOOD INTERVAL
			else if ((ascii < 65) || (ascii > 122) || ((ascii > 90) && (ascii < 97))) {
				System.out.println("Eroare!Introduceti un caracter in intervalul a-z, A-Z");
			}
			//CHECK FOR VOWEL
			else if ((c==vowels[0]) || (c==vowels[1]) || (c==vowels[2]) || (c==vowels[3]) || (c==vowels[4])) {
						System.out.println("Ati introdus o VOCALA");
						}
			else {
				System.out.println("Ati introdus o CONSOANA");
			}	
		}
		
		in.close();
		
	}							
		
}


>>>>>>> 7707b0a515e8be1138ced435ceecbeeaebd80093
