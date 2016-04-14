
public class DoubleEndedLinkList {
		Neighbor firstLink;
		Neighbor lastLink;
	
	public boolean isEmpty() {
		return (firstLink == null);
	}
	public void insertInFirstPosition(String homeOwnerName, int houseNumber) {
		Neighbor theNewLink = new Neighbor(homeOwnerName, houseNumber);
		if (isEmpty()) {
			lastLink = theNewLink;
		}
		else {
			firstLink.previous = theNewLink;
		}
		theNewLink.next = firstLink;
		firstLink = theNewLink;
}

	public void insertInLastPosition(String homeOwnerName, int houseNumber) {
		Neighbor theNewLink = new Neighbor(homeOwnerName, houseNumber);
		if (isEmpty()) {
			firstLink = theNewLink;
		}
		else {
		lastLink.next = theNewLink;
		theNewLink.previous = lastLink;
		}
		
		lastLink = theNewLink;
	}
	
	public boolean insertAfterKey(String homeOwnerName, int houseNumber, int key) {
		Neighbor theNewLink = new Neighbor(homeOwnerName, houseNumber);
		Neighbor currentNeighbor = firstLink;
		
		while(currentNeighbor.houseNumber != key) {
			currentNeighbor = currentNeighbor.next;
			if(currentNeighbor == null) {
				return false;
			}
		}
			if(currentNeighbor == lastLink) {
				theNewLink.next = null;
				lastLink = theNewLink;
			} else {
				theNewLink.next = currentNeighbor.next;
				currentNeighbor.next.previous = theNewLink;
			}

		
		theNewLink.previous = currentNeighbor;
		currentNeighbor.next = theNewLink;
		return true;
	}
	public boolean insertBeforeKey(String homeOwnerName, int houseNumber, int key) {
		Neighbor newNeighbor = new Neighbor(homeOwnerName, houseNumber);
		Neighbor currentNeighbor = firstLink;
		while(key != currentNeighbor.houseNumber) {
			if(currentNeighbor == null) {
				
			}
		}
		return true;
	}
	public void display() {
		Neighbor theLink = firstLink;
		while(theLink != null) {
			theLink.display();
			System.out.println("Next Link: " + theLink.next);
			theLink = theLink.next;
			System.out.println();
		}
	}
	
	public void display2() {
		Neighbor theLink = lastLink;
		while(theLink != null) {
			theLink.display();
			System.out.println("Next Link: " + theLink.previous);
			theLink = theLink.previous;
			System.out.println();
			
			
		}
	}
		public static void main(String args[]) {
			DoubleEndedLinkList Neighbor = new DoubleEndedLinkList();
			Neighbor.insertInFirstPosition("Mark Evans", 7);
			Neighbor.insertInFirstPosition("Piers Polkiss", 9);
			Neighbor.insertInFirstPosition("Doreen Figg", 6);
			Neighbor.insertInFirstPosition("Petunia Dursley", 4);
			//Neighbor.display();
			//Neighbor.display2();
			//System.out.println(Neighbor.lastLink.next);
			Neighbor.insertAfterKey("Olivier Dorvelus", 8, 9);
			Neighbor.display();
			
		}

	}
	
	
class Neighbor {
	public String homeOwnerName;
	public int houseNumber;
	
	public Neighbor next;
	public Neighbor previous;
	
	public Neighbor(String homeOwnerName, int houseNumber) {
		this.homeOwnerName= homeOwnerName;
		this.houseNumber = houseNumber;
	}
	
	public void display() {
		System.out.println(homeOwnerName + ": " + houseNumber + " Privet Drive");
	}
	
	public String toString() {
		return homeOwnerName;
	}
}
