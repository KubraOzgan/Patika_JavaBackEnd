package book;

public class Book implements Comparable<Book> {
	
	String name, author, date;
	int pages;

	public Book(String name, String author, String date, int pages) {
		super();
		this.name = name;
		this.author = author;
		this.date = date;
		this.pages = pages;
	}
	
	@Override
	public int compareTo(Book o) {
		
		return name.compareTo(o.name);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

}
