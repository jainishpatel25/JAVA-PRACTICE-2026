package LibrarySystem;

public class Book {

	String title;	
	String author;
	String isbn;
	static int totalNoofBooks;
	
	static{
	 totalNoofBooks= 0;
	}
	{
		totalNoofBooks++;
	}
	
	boolean isBorrowed;
	
	
	Book( String isbn , String title, String author){
		this.author =author;
		this.title = title;
		this.isbn = isbn ;
	}
	
	Book(String isbn){
		this(isbn,"unknown","unknown");
	}
	
	static int getTotalNoOfBooks() {
		return totalNoofBooks;
	}
	
	void  borrowBook() {
		if(isBorrowed) {
			System.out.println("Book Already Borrowed");
		}
		else {
			this.isBorrowed = true ;
			System.out.println("Enjoy the Book " +this.title);
		}
	}
	
	void returnBook() {
		if(isBorrowed) {
			this.isBorrowed = false;
			System.out.println("Hope You Enjoyed the book , Please Leave a review to " +this.author);
		}else {
			System.out.println("This Book is already in the library");
		}
	}
	
	
}
