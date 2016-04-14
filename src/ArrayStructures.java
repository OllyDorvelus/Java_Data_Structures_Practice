
public class ArrayStructures {
	private int[] theArray = new int[50];
	
	private int arraySize= 40;
	
	public void generateRandomArray(){
		for(int i=0; i < arraySize; i++)
			theArray[i] = (int)(Math.random()*100)+100;
			
	} 
	
	public void printArray() {
		System.out.println("----------");
		for (int i=0; i <arraySize; i++) {
			System.out.print("| " + i + " | ");
			System.out.println(theArray[i] + " | ");
			System.out.println("----------");
		}
	}
	
	public void printHorzArray(int i, int j){
			         
			        for(int n = 0; n < 51; n++)System.out.print("-");
		            System.out.println();
		            for(int n = 0; n < arraySize; n++){
		            	System.out.print("| " + n + "  ");
			           }
}
	
	public int getValueAtIndex(int index) {
		if(index < arraySize) return theArray[index];
		
		return 0; 
	}
	
	public boolean doesArrayContainThisValue(int searchValue) {
		boolean valueInArray = false;
			for(int i =0; i < arraySize; i++) {
				if(theArray[i] == searchValue) {
					valueInArray = true;
					//System.out.println("The value " + theArray[i] + " is in the array");
					// break;
				}
			}
			return valueInArray;
	}
	
	public void deleteIndex(int index) {
		if(index < arraySize) {
			for(int i= index; i < (arraySize - 1); i++) {
				 theArray[i] = theArray[i+1];
			}
			arraySize--;
		}
		
	}
	
	public void insertValue(int value) {
		if(arraySize < 50) {
			theArray[arraySize] = value;
			arraySize++;
		}
	}
	
	public String linearSearchForValue(int value) {
		boolean valueInArray = false;
		String indexsWithValue = "";
		System.out.print("The value was Found in the following: ");
		for(int i=0; i < arraySize; i++) {
			if(theArray[i] == value) {
				valueInArray = true;
				System.out.print(i + " ");
				indexsWithValue+= i + " ";  
			}
		}
		if(!valueInArray) {
			indexsWithValue = "None";
			System.out.print(indexsWithValue);
			
		}
		System.out.println();
		return indexsWithValue;
	}
	
	public void binarySearchForValue(int value) {
		int lowIndex=0;
		int highIndex= arraySize - 1;
		
		while(lowIndex <= highIndex) {
			int middleIndex= ((highIndex + lowIndex)/ 2);
			if(theArray[middleIndex] < value) lowIndex= middleIndex + 1;
			else if(theArray[middleIndex] > value) highIndex = middleIndex - 1;
			else {
				System.out.println("\nFound a Match for " + value + " at Index " + middleIndex);
				lowIndex = highIndex + 1; 
			}
		}
		
	}
	
	public void deleteValue(int value) {
		boolean isValueThere = false;
		for(int i =0; i < arraySize; i++) {
			if(theArray[i] == value) {
				theArray[i] = theArray[i + 1];
				isValueThere = true;
				arraySize--;
			}
		}
		
	}
	
	public void swapValues(int indexOne, int indexTwo) {
		int temp = theArray[indexOne];
		theArray[indexOne] = theArray[indexTwo];
		theArray[indexTwo] = temp;
	}
	
	public void bubbleSort() {
		for(int i= arraySize - 1; i > 1; i--) {
			for(int j=0; j < i; j++) {
				if(theArray[j] > theArray[j+1]) {
					swapValues(j, j+1);
					
				}
			}
		}
		printArray();
	}
	
	public void selectionSort() {
		for(int x = 0; x < arraySize; x++) {
			int minimum = x;
			
			for(int y = x; y < arraySize; y++) {
				if(theArray[minimum] > theArray[y]) {
					minimum = y;
				}
			}
			swapValues(minimum, x);
		}
		printArray();
	}
	
	public void olivierSort() {
		for(int i=1; i < arraySize; i++) {
			int k = theArray[i];
				for(int j=0; j < arraySize; j++ ) {
					if(theArray[j] < theArray[k]) {
						swapValues(j, k);
						k= theArray[j];
					}
				}
		}
		printArray();
	}
	
	public void lastItem() {
		for(int i=0; i < arraySize; i++) {
			if(i == arraySize - 1) {
				System.out.println(theArray[i]);
			}
		}
	}
	

	public void top5() {
		int counter = 0;
		int[] top5 = new int[50];
			while(counter < 10) {
				for(int i=0; i < arraySize; i++) {
					int max = i;
					counter++;
					
				for(int j=i; j <arraySize; j++) {
					if(theArray[max] < theArray[j]) {
						max = j;
						
					}
					}
				
				top5[i] = theArray[max];
				swapValues(i, max);
				}
				
				}
			for(int x=0; x < 10; x++) {
				System.out.println(top5[x]);
			}
	}
	
	public void valueAtIndex(int value) {
		boolean isValueThere = false;
			for(int i=0; i < arraySize; i++) {
				if(theArray[i] == value) {
					isValueThere = true;
					System.out.println("The value " + value + " is at index " + i);
				}
			}
			if(!isValueThere) {
				System.out.println("Sorry did not find " + value + " in the array");
			}
	}
	
	public int pushUps(int times, int value) {
		int store;
		int total=0;
		for(int i=0; i < times; i++) {
			store = (2 * value);
			value+=10;
			total+=store;
		}
		return total;
	}
	
	public static void main(String args[]) {	
		ArrayStructures newArray = new ArrayStructures();
		newArray.generateRandomArray();
//		newArray.printArray();
//		System.out.println(newArray.getValueAtIndex(3));
//		System.out.println(newArray.doesArrayContainThisValue(15));
//		newArray.deleteIndex(4);
//		newArray.printArray();
//		newArray.insertValue(55);
//		newArray.printArray();
//		newArray.linearSearchForValue(16);
//		newArray.deleteValue(55);
//		newArray.printArray();
//		newArray.insertValue(550);
//		newArray.insertValue(512);
//		newArray.printArray();
//		newArray.deleteValue(550);
//		newArray.deleteValue(512);
//		newArray.printArray();
		 //newArray.bubbleSort();
		//newArray.binarySearchForValue(16);
		
		 //newArray.selectionSort();
		newArray.lastItem();
		//newArray.insertValue(50);
		// newArray.olivierSort();
		newArray.printArray();
		newArray.valueAtIndex(150);
		System.out.println(newArray.pushUps(4, 50));
		newArray.top5();
		
	
	}
}
