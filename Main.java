package Fruit;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple aApple = new Apple("Apple", 2, 5);
		Dragonfruit dDragonfruit = new Dragonfruit("Dragonfruit", 2, 10.6);
		Grape gGrape = new Grape("Grape", 4, 13.6);
		importApple i = new importApple ("Apple", 2, 16.2, "Green");
		localApple l = new localApple ("Apple", 3, 8, "Sweet");
		
		System.out.println("The total price is : " + "RM" + aApple.totPrice());
		System.out.println("The total weight of dragonfruit is : " + dDragonfruit.totWeight() + "kg");
		System.out.println("The total weight of grape is : " + gGrape.totWeight() + "kg");
		System.out.println("The colour of import apple is : " + i.colourImportApple());
		System.out.println("The taste of local apple is : ") + l.tasteLocalApple());
	}
}
