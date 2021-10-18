package book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		List<Book> books = new ArrayList<>();
		
		books.add(new Book("Veronika Decides to Die", "Paulo Coelho", "2016", 203));
		books.add(new Book("Harry Potter and the Deathly Hallows", "J.K. Rowling", "2007", 696));
		books.add(new Book("Lord of the Rings Two Towers", "J.R.R Tolkien", "1954", 416));
		books.add(new Book("Journey to the End of the Night", "Louis-Ferdinand Céline", "1932", 625));
		books.add(new Book("The Handmaid's Tale", "Margaret Atwood", "1985", 311));
		books.add(new Book("Dune", "Frank Herbert", "1965", 712));
		books.add(new Book("My Sweet Orange Tree", "Jose Mauro De Vasconcelos", "1983", 182));
		books.add(new Book("Brave New World", "Aldous Huxley ", "1932", 272));
		books.add(new Book("1984", "George Owel", "1949", 352));
		books.add(new Book("Crime and Punishment", "Fyodor Dostoevsky", "1866", 687));
		
        Map<String, String> map = new HashMap<>();
        
		books.forEach(i -> {map.put(i.getBookName(), i.getAuthorName()); });
		System.out.println(map);
		
		List<Book> newBook =  books.stream().filter(i -> i.getPage() > 400).collect(Collectors.toList());
		newBook.stream().forEach(i -> System.out.println(i.getBookName()));
		
	}

}
