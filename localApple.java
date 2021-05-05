package Fruit;

public class localApple {
	
    private String taste;
    
    public localApple() {
    	super();
    	taste = " ";
    }

	public localApple(String name, int q, int p, String t) {
		super(name, q, p);
		taste = t;
		setInfo(name, q, p, t);
	}
	
	public void setInfo(String name, int q, int p, String t) {
		if(name.equals(null))
			name = " ";
		else
			name = name;
	}
	
	public String getTaste() {
		return taste;
	}
	
	public String toString() { //overriding method
		return ("Name = " + name + "Taste = " + taste);
	}
}
