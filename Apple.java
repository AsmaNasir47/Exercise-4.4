package Fruit;

public class Apple extends Fruit {

	private int quantity;
	private double price;
	
	    public Apple() {
	    	super();
	    	quantity = 0;
	    	price = 0;
	    }
	
	    public Apple (String name, int q, int p) {
	    	
		super(name);
		this.quantity = q;
		this.price = p;
		
		setInfo(name, q, p);
	    }
		
		public void setInfo(String name, int q, double p) {
			if(name.equals(null))
				name = " ";
			else
				name = name;
			
			if(q >= 0)
				quantity = q;
			else
				quantity = 0;
			
			if(p >= 0)
				price = p;
			else
				price = 0;
		}
		
		public int getQuantity() {
			return quantity;
		}
		
		public double getPrice() {
			return price;
		}
		
		public double totPrice() {
			return quantity * price;
		}
		
		public String toString() { //overriding method
			return ("Name = " + name + "Quantity = " + quantity + "Price = " + price + "Total Price = " + totPrice());
		}
}

