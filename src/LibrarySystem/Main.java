package LibrarySystem;

public class Main {
public static void main(String[] args) {
	Book b = new Book("1", "Java Prep" , "James");
	Book b1 = new Book("2");
	System.out.println(Book.totalNoofBooks);
	System.out.println(Book.getTotalNoOfBooks());
	b.borrowBook();
	b.returnBook();
	b1.borrowBook();
	b1.returnBook();
	b.borrowBook();
	b.returnBook();
	b.returnBook();
}
}
