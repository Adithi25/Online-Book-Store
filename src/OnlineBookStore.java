import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class OnlineBookStore {
	Dbstore db = new Dbstore();
	Book b = new Book();
	Scanner sc = new Scanner(System.in);
	
	

	public void addBook() {
	
		System.out.println("Enter the Bookname : ");
		String bname = sc.next();
		b.setBookname(bname);
		
		System.out.println("Enter the BookID : ");
		int bid = sc.nextInt();
		b.setBookid(bid);
		
		
		System.out.println("Enter the Author : ");
		String  bauthor = sc.next();
		b.setAuthor(bauthor);
		
		System.out.println("Enter the Book Cost : ");
		int bcost = sc.nextInt();
		b.setBookcost(bcost);
		
		System.out.println("Enter the Book Copies : ");
		int bcopies = sc.nextInt();
		b.setCopies(bcopies);
		
        db.addBook(b);
		
	}

public void displayBook() {
	List<Book> list = db.displayBook();
	if(list != null) {
		Iterator<Book> itr = list.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
	}
} else {
	System.out.println("noot availabe");
	
   }
 }

public void deleteBook(int id) {
	Book b = new Book("",id,"",0,0);
	db.deleteBook(b);
}


}





	

