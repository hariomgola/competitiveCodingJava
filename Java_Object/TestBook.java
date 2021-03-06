package Java_Object;
/**
Book Detail
Create a class Book with the following private member variables
String bookName
int bookPrice 
String authorName
Include appropriate getters and setters method.

Create a class TestBook which has the main method.  Get the details as shown in the sample input. 
Create an object for book class and assign the value for its attributes using the setters.  
Print the output as shown in the sample output using the getters method. 

Note: Use the same attribute names as given in the question and camel case notation for methods.  
Name of book and author can have space in between.

Sample Input 1:
Enter the Book name:
Java
Enter the price:
500
Enter the Author name:
Einstein

Sample Output 1:
Book Details
Book Name :Java
Book Price :500
Author Name :Einstein
 */
import java.util.Scanner;
public class TestBook 
{
	public static void main(String[] args) 
	{
		Scanner SC=new Scanner(System.in);
		Book book= new Book();
		
		String bookName,authorName;
		int price;
		
		System.out.println("Enter the Book name:");
		bookName=SC.nextLine();
		System.out.println("Enter the price:");
		price=SC.nextInt();
		System.out.println("Enter the Author name:");
		authorName=SC.next();
		
		//binding data to object
		book.setBookName(bookName);
		book.setBookPrice(price);
		book.setAuthorName(authorName);
		
		System.out.println("Book Details");
		System.out.println("Book Name:"+book.getBookName());
		System.out.println("Book Price:"+book.getBookPrice());
		System.out.println("Author Name:"+book.getAuthorName());
	}

}
