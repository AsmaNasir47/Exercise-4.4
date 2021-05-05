package Fruit;

public class Fruit {
	
	protected String name;
	
	public Fruit() {
		name = " ";
	}
	
	public Fruit(String n) { //constructor for super class with parameter
		name = " ";
		
		setInfo(n);
	}

	public void setInfo(String n) {
		if(name.equals(null))
			name = " ";
		else
			name = n;
	}

	public String getName() {
		return name;
	}

	public String toString() { //overriding method
		return "Fruit constructor is invoked";
	}
}
