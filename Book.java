
public class Book {
	private int bookID;
	private String author;
	private String title;
	private int year;
	private String status;
	public void setBookID(int bookID)
	{
		this.bookID=bookID;
	}
	public void setAuthor(String author)
	{
		this.author=author;
	}
	public void setTitle(String title)
	{
		this.title=title;
	}
	public void setYear(int year)
	{
		this.year=year;
	}
	public void setStatus(boolean status)
	{
		if(status==true)
			this.status="Available";
		else
			this.status="Unavailable";	
	}
	public int getbookID()
	{
		return bookID;
	}
	public String getAuthor()
	{
		return author;
	}
	public String getTitle()
	{
		return title;
	}
	public int getYear()
	{
		return year;
	}
	public String getStatus()
	{
		return status;
	}
	
}
