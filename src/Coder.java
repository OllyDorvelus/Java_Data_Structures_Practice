import java.util.Scanner;
public class Coder {
	public Coder Cock;
	public void test() {
		if(Cock == null) {
			System.out.println("This is null");
		}
	}
	public void loopList(int list1[]) {
		for(int i =0; i < list1.length; i++) {
			System.out.println(list1[i]);
		}
	}
	
	public void testSomething() {
		int counter = 0;
		while(counter < 4) {
			System.out.println(counter);
			counter++;
		}
		if(1 + 1 == 2) {
			System.out.println("Okay");
		}
	}
	
	public void sameNumber(int list1[], int list2[]) {
		for(int i=0; i < list1.length; i++) {
			for(int j=0; j < list2.length; j++) {
				if(list1[i] == list2[j]) { 
					System.out.println(list1[i] + " is numbers in both list");
					break;
				}
			}
		}
	}
	
	public void swap(int list[], int firstIndex, int secondIndex) {
		int temp = list[firstIndex];
		list[firstIndex] = list[secondIndex];
		list[secondIndex] = temp;
	}
	
	public void bubbleSort(int list[]) {
		for(int i=list.length - 1; i > 1; i--) {
			for(int j = 0; j < i; j++) {
				if (list[j] > list[j + 1]) {
					swap(list, j, j+1);
				}
			}
		}
	}
	
	public int[] selectionSort(int list[]) {
		for(int i=0; i < list.length; i++) {
			int min = i;
			for(int j=i; j < list.length; j++) {
				if(list[min] > list[j] ) {
					min = j;
				}
			}
			swap(list, min, i);
		}
		return list;
	}
	public void binarySearch(int list[], int value) {
		int highIndex=list.length - 1;
		int lowIndex = 0;
		boolean isThere = false;
		while(highIndex >= lowIndex) {
			int middleIndex = ((highIndex + lowIndex) / 2);
			if(list[middleIndex] < value) lowIndex = middleIndex + 1; 
			else if(list[middleIndex] > value) highIndex = middleIndex - 1;
			else {
				System.out.println("Found " + value + " at index " + middleIndex);
				lowIndex = highIndex + 1;
				isThere = true;
			}
		}
		if(!isThere) {
			System.out.println("Sorry could not find the value");
		}
	}
	
	public void displayList(int list[]) {
		for(int i=0; i <list.length; i++) {
			System.out.println(list[i]);
		}
	}
	public static void main(String args[]) {	
		int thisNumber = 2;
		int olly[] = {3, 6, 7, 2, 1};
		Coder ok = new Coder();
		ok.loopList(olly);
		int olivier[] = {8, 3, 7, 6, 10, 20};
		ok.sameNumber(olly, olivier);
		
		switch(thisNumber) {
		case(3):
			System.out.println("Hello World");
		break;
		
		case(2 + 2):
			System.out.println("This is my number");
		break;
		
		default:
			System.out.println("None of the numbers");
			break;
		}
		
		String name = "Olivier";
		String friend = "Triston";
		for (int i = 0, n = name.length(); i < n; i++) {
		    char c = name.charAt(i);
		    System.out.println(c);
		}
		
		char h='i';
	
		for (int i = 0; i < name.length(); i++) {
			for(int j=0; j < friend.length(); j++) {
				char c = name.charAt(i);
				char d = friend.charAt(j);
				if(c == d) {
					System.out.println(c);
					break;
				}
			}
		}
		
		

		//Person cock = new Person();
		//System.out.println(cock.name);
		//cock.changeName();
		//System.out.println(cock.name);
		//Coder listTest = new Coder();
		//listTest.selectionSort(olly);
		//listTest.bubbleSort(olivier);
		//listTest.displayList(listTest.selectionSort(olly));
		//listTest.displayList(olivier);
		//listTest.binarySearch(olly, 3);
		//listTest.binarySearch(olivier, 10);
		//listTest.testSomething();

	}
	

}

 class Person {
	String name = "Olivier";
	int age;
	
	public void changeName() {
		name = "Triston";
	}

	
}
