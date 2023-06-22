import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookOperation implements BookInterface{
	//Book b=new Book();
	ArrayList<Book> book=new ArrayList<>();
	@Override
	public void addBook()
	{	
		//b=new Book();
		Book b=new Book();
		Scanner s=new Scanner(System.in);
		System.out.print("Enter book id:");
		b.setBookID(s.nextInt());
		System.out.print("Enter author name:");
		b.setAuthor(s.next());
		System.out.print("Enter Title:");
		b.setTitle(s.next());
		System.out.print("Enter publish year of book:");
		b.setYear(s.nextInt());
		b.setStatus(true);
		book.add(b);
		//System.out.println(book.size());
	}
	@Override
	public void showAllBooks()
	{
		System.out.println("---------------------------------------------------------------");
		System.out.println("ID\tAuthor\t\tTitle\t\tPUBLISH-YEAR\tSTATUS");
		System.out.println("---------------------------------------------------------------");
		for(int i=0;i<book.size();i++)
		{
			System.out.println(book.get(i).getbookID()+"\t"+book.get(i).getAuthor()+"\t\t"+book.get(i).getTitle()+"\t\t"+book.get(i).getYear()+"\t\t"+book.get(i).getStatus());
		}
	}
	@Override
	public void showAvailableBooks()
	{
		System.out.println("---------------------------------------------------------------");
		System.out.println("ID\tAuthor\t\tTitle\t\tPUBLISH-YEAR\tSTATUS");
		System.out.println("---------------------------------------------------------------");
		for(int i=0;i<book.size();i++)
		{
			if(book.get(i).getStatus().equalsIgnoreCase("available"))
			System.out.println(book.get(i).getbookID()+"\t"+book.get(i).getAuthor()+"\t\t"+book.get(i).getTitle()+"\t\t"+book.get(i).getYear()+"\t\t"+book.get(i).getStatus());
		}
	}
	@Override
	public void borrowBook()
	{
		System.out.print("Enter Book ID:");
		Scanner s=new Scanner(System.in);
		int id=s.nextInt();
		for(int i=0;i<book.size();i++)
		{
			if(book.get(i).getbookID()==id )//&& book.get(i).getStatus()==true)
			{
				System.out.println("Book Borrowed succesfully");
				System.out.println("Borrowed book details: Book{"+book.get(i).getbookID()+" "+book.get(i).getAuthor()+" "+book.get(i).getTitle()+" "+book.get(i).getYear()+" "+book.get(i).getStatus()+"}");
				book.get(i).setStatus(false);
			}
		}
		//s.close();
	}
	@Override
	public void returnBook()
	{
		System.out.print("Enter Book ID:");
		Scanner s=new Scanner(System.in);
		int id=s.nextInt();
		for(int i=0;i<book.size();i++)
		{
			if(book.get(i).getbookID()==id)
			{
				book.get(i).setStatus(true);
			}
		}
		System.out.println("Book returned succesfully");
		
	}
}






