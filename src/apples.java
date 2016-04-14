import java.util.Scanner;
import java.util.EnumSet;

import java.util.Random;
public class apples {
	public static void main(String args[]) {	
	double a;
	double b;
	double answer;
	Scanner olly = new Scanner(System.in);
	Random rand = new Random();
	potpie pie = new potpie(7, 31, 1997);
	potpie wii = new potpie(4, 8, 2015);
//	int randomint = 0 + randInt(30);
	Tuna tuna = new Tuna(10);
	for(int i=0; i <5; i++) {
		tuna.add();
		System.out.printf("%s", tuna);
	}
//	System.out.println(0 + rand.nextInt(1000));
//	System.out.println("What is your name: ");
//	String name = olly.nextLine();
//	System.out.println("Hello " + name);
//	System.out.println(avg(30, 40, 80));
//	System.out.println("Enter a number");
//	a = olly.nextInt();
//	System.out.println("Enter another number");
//	b = olly.nextInt();
//	answer = a + b;
//	System.out.println("The sum of these two numbers are: " + answer);
	
	
//	System.out.println(tunaObject.toString(20, 58, 32));
//	int oli[][] = {{8, 9, 10, 11},{12, 13, 14, 15}};
//	int olly2[][] = {{30, 31, 42}, {100, 200, 300}, {5, 6}};	
////		for(int i=0; i < oli.length; i++) {
////			for(int j=oli[i][0]; j < oli[i].length; j=oli[i][j] + 1) {
////				System.out.println(j);
////			}
////			
////		}
//	
//	display(olly2);
//	
//	System.out.println("\n Next Table \n" );
//	
//	for (int i=0; i < oli.length; i++) {
//		for (int j=0; j < oli[i].length; j++) {
//			System.out.println(oli[i][j]);
//		}
//	}
//		
//		}
//	public static void display(int x[][]) {
//		for(int i=0; i < x.length; i++) {
//			for(int j=0; j < x[i].length; j++) {
//				System.out.println(x[i][j]);
//			}
//		}
	}

	public static int average(int ...numbers) {
		int total=0;
		for (int x: numbers) {
			total+=x;
		}
		return total/numbers.length;
	}
	public static int avg(int...numbers) {
		int total = 0;
		for(int i: numbers) {
			total+=i;
		}
		int avg = total/numbers.length;
		return avg;
	}
	}
  
