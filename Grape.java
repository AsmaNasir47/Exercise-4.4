package Fruit;

public class Grape extends Fruit {
	
	private int quantity;
	private double weight;
	
	 public Grape() {
	    	super();
	    	quantity = 0;
	    	weight = 0;
	    }
	
	    public Grape (String name, int q, double w) {
	    	
		super(name);
		this.quantity = q;
		this.weight = w;
		setInfo(name, q, w);
	    }
		
		public void setInfo(String name, int q, double w) {
			if(name.equals(null))
				name = " ";
			else
				name = name;
			
			if(q >= 0)
				quantity = q;
			else
				quantity = 0;
			
			if(w >= 0)
				weight = w;
			else
				weight = 0;
		}
		
		public int getQuantity() {
			return quantity;
		}
		
		public double getWeight() {
			return weight;
		}
		
		public double totWeight() {
			return quantity * weight;
		}
		
		public String toString() { //overriding method
			return ("Name = " + name + "Quantity = " + quantity + "Weight = " + weight + "Total Weight = " + totWeight());
		}
}
