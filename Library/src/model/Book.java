package model;

public class Book {
	private int bid;
	private int bookTypeid = 1;
	private String title;
	private String author;
	private String publisher;
	public Book(int bid, String title, String author, String publisher) {
		super();
		this.bid = bid;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bookTypeid=" + bookTypeid + ", title=" + title + ", author=" + author
				+ ", publisher=" + publisher + "]";
	}
	public int getBookTypeid() {
		return bookTypeid;
	}
	public void setBookTypeid(int bookTypeid) {
		this.bookTypeid = bookTypeid;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
}
