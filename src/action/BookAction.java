package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class BookAction extends ActionSupport {

	private String Name; // 作者的Name
	private String Title;
	private BookOper oper = new BookOper(); // 查询类
	
	Book book = new Book();
	Author au = new Author();

	public String getTitle() {
		return Title;
	}

	public void setTitle(String Title) {
		this.Title = Title;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Author getAu() {
		return au;
	}

	public void setAu(Author au) {
		this.au = au;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public String listbook() throws Exception {
		ActionContext.getContext().put("booklist", oper.selectByAuthorID(Name));
		return "success";
	}

	public String deletebook() throws Exception {
		oper.deleteBook(Title);
		// ActionContext.getContext().put("booklist",oper.selectByAuthorID(Name));
		return "success";
	}

	public String details() throws Exception {

		// ActionContext.getContext().put("details",oper.bodetail(Title, book));
		oper.bodetail(Title, book);
		oper.audetail(Title, au);
		// oper.bodetail(Title);
		return "success";
	}
}