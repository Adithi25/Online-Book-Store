import java.util.Scanner;


public class MainMethod {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		MainMethod m = new MainMethod();
		m.start();
		
	}
	void start() {
		System.out.println("_________________________________________________________________");
		System.out.println("   WELCOME TO ONLINE BOOK STORE");
		System.out.println("1.ADD BOOK");
		System.out.println("2.DISPLAY BOOK");
		System.out.println("3.DELETE BOOK");
		System.out.println("4.VIEW ALL BOOKS");
		System.out.println("5.LOGOUT");
		
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			OnlineBookStore o = new OnlineBookStore();
			o.addBook();
			break;
		case 2:
			OnlineBookStore o1 = new OnlineBookStore();
			o1.displayBook();
			break;
			
		case 3:
			System.out.println("Deleting data!!!!");
			System.out.println("Enter the student id to delete :");
		int id = sc.nextInt();
			OnlineBookStore o2= new OnlineBookStore();
			o2.deleteBook(id);
			System.out.println("----------------------------------");
			break;
			
			
			
		default:
			System.out.println("Sorry no option ......................!");
			break;

		
		}
			
		
	}

}
