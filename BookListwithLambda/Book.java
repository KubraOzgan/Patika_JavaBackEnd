package book;

import java.util.Date;

public class Book {
	
	private String bookName, authorName, publish;
	private int page;
	
	public Book(String bookName, String authorName, String publish, int page) {
		
		this.bookName = bookName;
		this.authorName = authorName;
		this.publish = publish;
		this.page = page;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String getPublish() {
		return publish;
	}

	public void setPublish(String publish) {
		this.publish = publish;
	}
	

}
