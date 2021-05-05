package Fruit;

public class importApple extends Apple{

	private String colour;
	
	public importApple() {
	    	super();
	    	colour = " ";
	    }
	
	public importApple(String name, int q, int p, String c) {
		super(name, q, p);
		colour = c;
		setInfo(name, q, p, c);
	}
	
	public void setInfo(String name, int q, int p, String c) {
		if(name.equals(null))
			name = " ";
		else
			name = name;
	}
	
	public String getColour() {
		return colour;
	}
	
	public String toString() { //overriding method
		return ("Name = " + name + "Colour = " + colour);
	}
}
