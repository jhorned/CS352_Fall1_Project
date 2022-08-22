import java.util.LinkedList;

public class Contestant extends Person {
	
	//intitate and arrayList to keep track of each contestants position
  LinkedList list = new LinkedList<>();

	//initiates a contestant object
	public Contestant(String name, int pos) {
		super(name);
    this.list.insert(pos);
	}

	//an overide method to return the contestant object
	@Override
	public String toString() {
		return "Contestant [Name: " + getName() + ", Position: " + getPositionList() + "]";
	}
}

