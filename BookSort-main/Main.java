package book;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		TreeSet<Book> books = new TreeSet<>();
		
		books.add(new Book("Veronika Decides to Die", "Paulo Coelho", "2016", 203));
		books.add(new Book("Harry Potter and the Deathly Hallows", "J.K. Rowling", "2007", 696));
		books.add(new Book("Lord of the Rings Two Towers", "J.R.R Tolkien", "1954", 416));
		books.add(new Book("Journey to the End of the Night", "Louis-Ferdinand Céline", "1932", 625));
		books.add(new Book("The Handmaid's Tale", "Margaret Atwood", "1985", 311));

		Iterator<Book> itr = books.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next().getName());
		}
		
		System.out.println();
		
		TreeSet<Book> books2 = new TreeSet<>(new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {
			
				return o1.getPages() - o2.getPages();
			}
		});
		
		books2.addAll(books);
		
		Iterator<Book> itr2 = books2.iterator();
		
		while(itr2.hasNext())
		{
			System.out.println(itr2.next().getName());
		}
	}

}
