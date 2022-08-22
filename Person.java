public class Person {
  private String name;

  //Constructor for the person class.
	public Person(String name) {
		this.name = name;
	}

  //Get method for the Person's name.
	public String getName() {
		return name;
	}

  //Set method for the person's name
	public void setName(String name) {
		this.name = name;
	}

  //An overide method to return person object
	@Override
	public String toString() {
		return name;
	}
}

