package sortingObjects;

import java.util.HashMap;
import java.util.Map;

public class Main2 {

	public static void main(String[] args) {
		Map<Book, Integer> books = new HashMap<Book, Integer>();
		books.put(new Book(1, "The Lord of the Rings", "J. R. R. Tolkien"), 1);
		books.put(new Book(2, "Le Petit Prince", "Antoine de Saint-Exupery"), 2);
		books.put(new Book(3, "Harry Potter and the Philosopher's Stone", "J. K. Rowling"), 3);
		books.put(new Book(4, "And Then There Were None", "Agatha Christie"), 4);
		books.put(new Book(5, "Dream of the Red Chamber", "Cao Xueqin"), 5);
		books.put(new Book(6, "The Hobbit", "J. R. R. Tolkien"), 6);
		books.put(new Book(7, "She: A History of Adventure", "H. Rider Haggard"), 7);
		books.put(new Book(8, "The Lion, the Witch and the Wardrobe", "C. S. Lewis"), 8);
		books.put(new Book(9, "The Da Vinci Code", "Dan Brown"), 9);
		books.put(new Book(10, "The Catcher in the Rye", "J. D. Salinger"), 10);
		books.put(new Book(6, "The Hobbit", "J. A. A. Tolkien"), 11);

		for (Book nextBook : books.keySet()) {
			System.out.println(nextBook);
		}
	}
}
