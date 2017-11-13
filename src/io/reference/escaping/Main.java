package io.reference.escaping;

public class Main {

	public static void main(String[] args) {

		BookCollection bc = new BookCollection();
		
		
		bc.printAllBooks();
		
//		Don Quixote: 3.99
//		Pilgrim's Progress: 4.45
//		Robinson Crusoe: 3.99
//		Gulliver's Travels: 7.6
//		Tom Jones: 9.99
//		Clarissa: 4.45
//		Dangerous Liaisons: 11.5
//		Emma: 3.99
//		Frankenstein: 7.6
//		The Count of Monte Christo: 3.99
		
		//get price of book called Tom Jones in EUR
		System.out.println(bc.findBookByName("Tom Jones").getPrice().convert("EUR"));
	
		bc.printAllBooks();
//		
//		Don Quixote: 3.99
//		Pilgrim's Progress: 4.45
//		Robinson Crusoe: 3.99
//		Gulliver's Travels: 7.6
//		Tom Jones: 12.4875           // mutated
//		Clarissa: 4.45
//		Dangerous Liaisons: 11.5
//		Emma: 3.99
//		Frankenstein: 7.6
//		The Count of Monte Christo: 3.99
		
	}
}
