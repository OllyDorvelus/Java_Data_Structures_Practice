public class Link {
	
	public String bookName;
	public int millionsSold;
	
	public Link next;
	
	public Link(String bookName, int millionsSold) {
		this.bookName = bookName;
		this.millionsSold = millionsSold;
	}
		
	public void display() {
		System.out.println(bookName + ": " + millionsSold + ",000,000");
	}
	
	public String toString() {
		return bookName;
	}
	
	public static void main(String args[]) {
		LinkList theLinkedList = new LinkList();
		theLinkedList.insertFirstLink("Don Quixote", 500);
		theLinkedList.insertFirstLink("A tale of two cities", 200);
		theLinkedList.insertFirstLink("Ender Game", 300);	
		theLinkedList.display();
		theLinkedList.find("Ender Game");
		System.out.println(theLinkedList.firstLink.next);
		int a = 3;
		int b = 4;
		a = b;
		
	}
}

class LinkList {
	public Link firstLink;

//	LinkList() {
//		firstLink = null;
//	}
	
	public boolean isEmpty() {
		return(firstLink == null);
	}
	
	public void insertFirstLink(String bookName, int millionsSold) {
		Link newLink = new Link(bookName, millionsSold);
		newLink.next = firstLink;
		firstLink = newLink;
	}
	
	public Link removeFirst() {
		Link linkReference = firstLink;
			if(!isEmpty()) {
				firstLink = firstLink.next;
				}
			else {
				System.out.println("Empty LinkedList");
			}
			return linkReference;
	}
	
	public void display() {
		Link theLink = firstLink;
		while(theLink != null) {
			theLink.display();
			System.out.println("Next Link: " + theLink.next);
			theLink = theLink.next;
			System.out.println();
		}
	}
	
	public Link find(String bookName) {
		Link theLink = firstLink;
		boolean isThere = false;
		if(!isEmpty()) {
		while(theLink != null) {
			if(bookName == theLink.bookName) {
				theLink.display();
				theLink = theLink.next;
				isThere = true;
			}
			else {
				theLink = theLink.next;
				
			}
		}

	}
		else {
			System.out.println("Empy LinkedList");
		}
		
		if(!isThere) {
			System.out.println("Item cannot be found");
		}
		return theLink;
	}
	
	public Link removeLink(String bookName) {
		Link currentLink = firstLink;
		Link previousLink = firstLink;
		
		while(currentLink.bookName != bookName) {
			if(currentLink.next == null) {
				return null;
			}
		 else {
			previousLink = currentLink;
			currentLink = currentLink.next;
		if(currentLink == firstLink) {
			firstLink = firstLink.next;
			} else {
				previousLink.next = currentLink.next;
			}
		} 
		
	}
		return currentLink; 
}
}
