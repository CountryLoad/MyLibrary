package action;

//图书的数据类  
public class Book {
	
	private String ISBN;
	private String title;
	private String AuthorID;
	private String Publisher;
	private String PublishDate;
	private String Price;

	public String getISBN() {
		return ISBN;
	}
	
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String Title) {
		this.title = Title;
	}

	public String getAuthorID() {
		return AuthorID;
	}
	
	public void setAuthorID(String AuthorID) {
		this.AuthorID = AuthorID;
	}
	
	public String getPublisher() {
		return Publisher;
	}

	public void setPublisher(String Publisher) {
		this.Publisher = Publisher;
	}

	public String getPublishDate() {
		return PublishDate;
	}
	
	public void setPublishDate(String PublishDate) {
		this.PublishDate = PublishDate;
	}

	public String getPrice() {
		return Price;
	}

	public void setPrice(String Price) {
		this.Price = Price;
	}
}