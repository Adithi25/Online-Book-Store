
public class Book {

	String bookname;
	int bookid;
	String author;
	int bookcost;
	int copies;

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getBookcost() {
		return bookcost;
	}

	public void setBookcost(int bookcost) {
		this.bookcost = bookcost;
	}

	public int getCopies() {
		return copies;
	}

	public void setCopies(int copies) {
		this.copies = copies;
	}

	public Book(String bookname, int bookid, String author, int bookcost, int copies) {

		super();
		this.bookname = bookname;
		this.bookid = bookid;
		this.author = author;
		this.bookcost = bookcost;
		this.copies = copies;
	}

	public Book() {
		super();
		this.bookid = bookid;
	}
	

	public Book(int id) {
		
		this.bookid = bookid;
	}

	@Override
	public String toString() {
		return "Book [bookname=" + bookname + ", bookid=" + bookid + ", author=" + author + ", bookcost=" + bookcost
				+ ", copies=" + copies + "]";
	}

	
	

	
}
