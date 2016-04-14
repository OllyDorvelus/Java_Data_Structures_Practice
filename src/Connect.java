
public class Connect {
TrackMember firstLink;

public boolean isEmpty() {
	return(firstLink == null);
}

public void addMemeber(String name, int number) {
	TrackMember member = new TrackMember(name, number);
	member.next = firstLink;
	firstLink = member;
}

public TrackMember findMember(int number) {
	TrackMember member = firstLink;
	
	while(member != null) {
		if(member.number != number) {
			member = member.next;
		}
		else System.out.println(member);
		break;
	}
	return member;
}

public void displayTrackTeam() {
	
	TrackMember member = firstLink;
	if(!isEmpty())
	while(member != null) {
	System.out.println(member);
	member = member.next;
	}
	else {
		System.out.println("No items in the list");
	}
}

public TrackMember deleteMember(int number) {
	TrackMember member = firstLink;
	TrackMember temp = firstLink;
	int counter = 0;
	boolean isThere = false;
	if(isEmpty()) {
		System.out.println("No members in the team");
		member = null;
	}
	 if(firstLink.number == number) {
		firstLink = firstLink.next;
	 	isThere = true;
	 }
	 else {
		 while(member != null) {
		 if(member.number != number) {
			 temp = member;
			 member = member.next;
			 counter++;
		 } else {
			member = temp;
			temp = member.next;
			member.next = temp.next;
			
			
			 isThere = true;
			 break;
		 }
	 }
		 
	}
	if(!isThere)
		System.out.println("Sorry could not find the member in position " + number);
	//System.out.println(counter);
	return member;
	
}

public static void main(String[] args) {
	Connect teammate = new Connect();
	teammate.addMemeber("Olivier", 3);
	teammate.addMemeber("Bryan", 5);
	teammate.addMemeber("Triston", 7);
	teammate.addMemeber("Densley", 8);
	teammate.displayTrackTeam();
	System.out.println();
	teammate.findMember(5);
	System.out.println();
	teammate.deleteMember(8);
	teammate.displayTrackTeam();
	
}
}

class TrackMember {
	public TrackMember next;
	public String name;
	public int number;
	
	public TrackMember(String name, int number) {
		this.name = name;
		this.number = number;
	}
	
	public String toString() {
		return name + " is in position number " + number;
	}
}