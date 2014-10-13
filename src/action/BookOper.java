package action;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookOper {

	public List<Book> selectByAuthorID(String Name) {

		Connection conn = action.DBcon.getConnection();
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet res = null;
		List<Book> booklist = new ArrayList<Book>();
		try {
			pstmt = conn
					.prepareStatement("select * from book where AuthorID=?");
			pstmt.setString(1, getID(Name));
			res = pstmt.executeQuery();
			while (res.next()) {
				Book book = new Book();
				book.setISBN(res.getString("ISBN"));
				book.setTitle(res.getString("Title"));
				book.setAuthorID(res.getString("AuthorID"));
				book.setPublisher(res.getString("Publisher"));
				book.setPublishDate(res.getString("PublishDate"));
				book.setPrice(res.getString("Price"));
				booklist.add(book);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			if (res != null)
				try {
					res.close();
				} catch (SQLException e) {
					e.printStackTrace();
					System.out.println(e.getMessage());
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
					System.out.println(e.getMessage());
				}
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
					System.out.println(e.getMessage());
				}
		}
		return booklist;
	}

	public static String getID(String Name) {

		Connection conn = action.DBcon.getConnection();
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet res = null;
		Author au = new Author();
		try {
			pstmt = conn.prepareStatement("select * from author where Name=?");
			pstmt.setString(1, Name);
			res = pstmt.executeQuery();
			res.next();
			au.setAuthorID(res.getString("AuthorID"));
			au.setName(res.getString("Name"));
			au.setAge(res.getString("Age"));
			au.setCountry(res.getString("Country"));
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			if (res != null)
				try {
					res.close();
				} catch (SQLException e) {
					e.printStackTrace();
					System.out.println(e.getMessage());
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
					System.out.println(e.getMessage());
				}
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
					System.out.println(e.getMessage());
				}
		}
		return au.getAuthorID();
	}

	public void deleteBook(String Title) {

		Connection conn = action.DBcon.getConnection();
		java.sql.Statement pstmt = null;
		String sql = "delete from book where Title='" + Title + "'";
		try {
			pstmt = conn.createStatement();
			pstmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println(e.getMessage());
				}
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println(e.getMessage());
				}
		}
		return;
	}

	public void bodetail(String Title, Book book) {

		Connection conn = action.DBcon.getConnection();
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet res = null;
		try {
			pstmt = conn.prepareStatement("select * from book where Title=?");
			pstmt.setString(1, Title);
			res = pstmt.executeQuery();
			res.next();
			book.setTitle(res.getString("Title"));
			book.setISBN(res.getString("ISBN"));
			book.setAuthorID(res.getString("AuthorID"));
			book.setPublisher(res.getString("Publisher"));
			book.setPublishDate(res.getString("PublishDate"));
			book.setPrice(res.getString("Price"));
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			if (res != null)
				try {
					res.close();

				} catch (SQLException e) {
					e.printStackTrace();
					System.out.println(e.getMessage());
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
					System.out.println(e.getMessage());

				}
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
					System.out.println(e.getMessage());
				}
		}
		return;
	}

	public void audetail(String Title, Author au) {

		Connection conn = action.DBcon.getConnection();
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet res = null;
		try {
			pstmt = conn
					.prepareStatement("select * from author where AuthorID=?");
			pstmt.setString(1, getIDByTitle(Title));
			res = pstmt.executeQuery();
			res.next();

			au.setAuthorID(res.getString("AuthorID"));
			au.setName(res.getString("Name"));
			au.setAge(res.getString("Age"));
			au.setCountry(res.getString("Country"));

			System.out.println("AuthorID £º" + au.getAuthorID());
			System.out.println("Name £º" + au.getName());
			System.out.println("Age £º" + au.getAge());
			System.out.println("Country £º" + au.getCountry());
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			if (res != null)
				try {
					res.close();
				} catch (SQLException e) {
					e.printStackTrace();
					System.out.println(e.getMessage());
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
					System.out.println(e.getMessage());
				}
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
					System.out.println(e.getMessage());
				}
		}
		return;
	}

	public static String getIDByTitle(String Title) {

		Connection conn = action.DBcon.getConnection();
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet res = null;
		Book book = new Book();
		try {
			pstmt = conn.prepareStatement("select * from book where Title=?");
			pstmt.setString(1, Title);
			res = pstmt.executeQuery();
			res.next();
			book.setAuthorID(res.getString("AuthorID"));
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			if (res != null)
				try {
					res.close();
				} catch (SQLException e) {
					e.printStackTrace();
					System.out.println(e.getMessage());
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
					System.out.println(e.getMessage());
				}
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
					System.out.println(e.getMessage());
				}
		}
		return book.getAuthorID();
	}
}
