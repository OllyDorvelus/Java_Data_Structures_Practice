
public class Linked {
	
	public Fish firstLink;
	//Fish previous;
	
	public boolean isEmpty() {
		return(firstLink == null );
	}
	public void InsertLinkInFirstPosition(String fishName, int fishNumber) {
		Fish newFish = new Fish( fishName, fishNumber);
		newFish.next = firstLink;
		firstLink = newFish;
	}
	
	public void display() {
		if(isEmpty()) {
			System.out.println("The linkedList is Empty");
		}
		else {
			Fish theFish = firstLink;
			while(theFish != null) {
				theFish.display();
				theFish = theFish.next;
			}
		}
	}
	
	public void InsertLinkInLastPosition(String fishName, int fishNumber) {
		Fish newFish = new Fish(fishName, fishNumber);
		if(isEmpty()) {			
			newFish.next = firstLink;
			firstLink = newFish;
		}
		else {
			Fish theFish = firstLink;
			while(theFish != null) {
				//theFish.display();
				theFish = theFish.next;
			}
			if(theFish == null) {
				
			}
		}
	}
	
	public void removeFirstLink() {
		if(isEmpty()) {
			System.out.println("List is already empty ");
		}
		else {
			firstLink = firstLink.next;
		}
	}
	
	public void findFish(String fishName) {
		Fish theFish = firstLink;
		boolean isThere = false;
		if(isEmpty()) {
			System.out.println("List is already empty ");
		}
		
		else {
			while(theFish != null) {
			if(fishName == theFish.fishName) {
				isThere = true;
				theFish.display();
				theFish = theFish.next;
			}
			else {
				theFish = theFish.next;
			}
			
			}
		}
		if(!isThere) {
			System.out.println("Could not find " + fishName);
		}
	}
	
	public void removeDesiredFish(String fishName) {
		Fish theFish = firstLink;
		Fish reFish = firstLink.next;
		while(theFish != null) {
			
			if(fishName == theFish.fishName) {
				theFish = theFish.next;
				reFish = theFish;
				
				
			} else {
			
			theFish = theFish.next;
			reFish = theFish;
			}
			
		}
	}
	
	public void removeAll() {
		if(isEmpty()) {
			System.out.println("List is already empty ");
		}
		else {
			while(firstLink != null) {
				firstLink = firstLink.next;
			}
			System.out.println("Emptied List!");
		}
	}
	
	
	public static void main(String args[]) {
		Linked nemo = new Linked();
		nemo.InsertLinkInFirstPosition("Nemo", 20);
		nemo.InsertLinkInFirstPosition("StarFish", 30);
		nemo.InsertLinkInFirstPosition("Shark", 30);
		nemo.InsertLinkInFirstPosition("Hammerhead", 30);
		nemo.InsertLinkInFirstPosition("Tuna", 40);
		//nemo.removeAll();
		//nemo.findFish("Shark");
		//nemo.display();
		//System.out.println(nemo.firstLink.next);
		nemo.removeDesiredFish("Shark");
		nemo.display();
	}
}


class Fish {
	public Fish next;
	
	
	public String fishName;
	public int fishNumber;
	
	public Fish(String fishName, int fishNumber) {
		this.fishName = fishName;
		this.fishNumber = fishNumber;
	}
	
	public void display() {
		System.out.println(fishName + " is number: " + fishNumber );
	}
	
	public String toString() {
		return fishName;
	}
}