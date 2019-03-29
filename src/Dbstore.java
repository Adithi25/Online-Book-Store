import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Dbstore {
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	Connection getConnection() {
		String url = "jdbc:mysql://localhost:3306/obookstore";
		try {
			conn = DriverManager.getConnection(url,"root","mysql123");
			
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return conn;
	}
	
	public boolean addBook(Book b) {
		Connection con = null;
		PreparedStatement pst = null;
		try {
			con = getConnection();
			String sql = "insert into book (bookname,bookid,Author,bookcost,copies) values(?,?,?,?,?)";
			pst = con.prepareStatement(sql);
			pst.setString(1, b.getBookname());
			pst.setInt(2, b.getBookid());
			pst.setString(3, b.getAuthor());
			pst.setInt(4, b.getBookcost());
			pst.setInt(5, b.getCopies());
			
			int isExecuted = pst.executeUpdate();
			if(isExecuted != 0) {
				return true;
			}
			
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return false;
	
	}
	
	public List<Book> displayBook(){
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		Book b = null;
		List<Book> list = new ArrayList<Book>();
		try {
			con = getConnection();
			stmt = con.createStatement();
			
			String sql = "Select * from Book";
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				b= new Book();
				b.setBookname(rs.getString(1));
				b.setBookid(rs.getInt(2));
				b.setAuthor(rs.getString(3));
				b.setBookcost(rs.getInt(4));
				b.setCopies(rs.getInt(5));
				
				list.add(b);
			}
			
			
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return list;
	}
	
	
	
	public void deleteBook(Book b) {
		
		
		Connection con = null;
		PreparedStatement pst = null;
		con = getConnection();
		String del = "delete from Book where bookid = ?";
		try {
			pst = con.prepareStatement(del);
			pst.setInt(1,b.getBookid());
			int a = pst.executeUpdate();
			if (a != 0) {
				System.out.println("Book deleted successfully!!!!");
			}
			else {
				System.out.println("No such book found!!!");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			
		}

	}

	
}
	
	

