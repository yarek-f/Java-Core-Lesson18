package lgs.task2.max;

public class Application {
	public static void main(String[] args) {

		MyMap<Integer, String> myMap = new MyMap<>();

		myMap.addObject(15, "Bill");
		myMap.addObject(42, "John");
		myMap.addObject(23, "Carl");
		myMap.addObject(44, "Michael");
		myMap.addObject(35, "Pol");

		System.out.println(myMap.getEntryMap());

		myMap.deleteKey(15);

		System.out.println(myMap.getEntryMap());

		myMap.deleteValue("Carl");

		System.out.println(myMap.getEntryMap());

		myMap.setOfKeys();

		myMap.listOfValues();

		myMap.showMap();

	}
}
