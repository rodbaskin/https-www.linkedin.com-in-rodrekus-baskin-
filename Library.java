import java.awt.print.Book;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Library {

	public static final Object[] Book = null;
	static int author;
	int book;
	int title;
	int status;
	int due_date;
	int search;
	private static String[] books;

	public static class JavaArrayListToString {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice = "y";

		System.out.println("Welcome to RJ's Library");
		System.out.println("Do you have any books to return? (y/n):");
		sc.nextLine();
		System.out.println("Search by author, title or keyword.");
		while(choice.equalsIgnoreCase("author")){
			System.out.print(" author name");
			sc.nextLine();
		}
		sc.nextLine();
		System.out.println("Submit another entry");
		sc.nextLine();

		String[] list = { "author", "title", "status", "due date" };

		String authorString = "author";
		if (list[0] == (authorString)) {
			System.out.println("Author");
		}

		String titleString = "title";
		if (list [2] == (titleString)) {
			System.out.println("title");
		}

		String statusString = "Status";
		if (list[3] == (statusString)) {
			System.out.println("Status");

		String due_dateString = "Due_Date";
		if (list[4] == (due_dateString)) {
				System.out.println("Due_Date");
			}

		switch (author) {

		case 1:
			authorString = "Philip K. Dick";
			titleString = "Do Androids Dream of electric sheep?";
			due_dateString = "July 26, 2016";
			System.out.println("Author: " + authorString + titleString + due_dateString);
			break;
		case 2:
			authorString = "Ray bradbury";
			titleString = "Something Wicked This Way Comes.";
			due_dateString = "July 26, 2016";
			System.out.println("Author: " + authorString + titleString + due_dateString);
			break;
		case 3:
			authorString = "Douglas Adams";
			titleString = "The Hitchhikers";
			due_dateString = "July 26, 2016";
			System.out.println("Author: " + authorString + titleString + due_dateString);
			break;
		case 4:
			authorString = "Seth Graham";
			titleString = "Pride and Prejudice";
			due_dateString = "July 26, 2016";
			System.out.println("Author: " + authorString + titleString + due_dateString);
			break;
		case 5:
			authorString = "Sloane Croley";
			titleString = "I was told There'd Be Cake.";
			due_dateString = "July 26, 2016";
			System.out.println("Author: " + authorString + titleString + due_dateString);
			break;
		case 6:
			authorString = "Mark Hudson";
			titleString = "The Curious Incident of the Dog in the Night.";
			due_dateString = "July 26, 2016";
			System.out.println("Author: " + authorString + titleString + due_dateString);
			break;
		case 7:
			authorString = "Robert Rankin";
			titleString = "The Hollow";
			due_dateString = "July 26, 2016";
			System.out.println("Author: " + authorString + titleString + due_dateString);
			break;
		case 8:
			authorString = "Lynn Trust";
			titleString = "Eats, Shoots & Leaves";
			due_dateString = "July 26, 2016";
			System.out.println("Author: " + authorString + titleString + due_dateString);
			break;
		case 9:
			authorString = "Harper Lee";
			titleString = "To Kill a Mocking Bird";
			due_dateString = "July 26, 2016";
			System.out.println("Author: " + authorString + titleString + due_dateString);
			break;
		case 10:
			authorString = "Milan Kundera";
			titleString = "The Unberable Lightness of Being";
			due_dateString = "July 26, 2016";
			System.out.println("Author: " + authorString + titleString + due_dateString);
			break;
		case 11:
			authorString = "Chelsea Handler";
			titleString = "Are You There, Vodka?";
			due_dateString = "July 26, 2016";
			System.out.println("Author: " + authorString + titleString + due_dateString);
			break;
		case 12:
			authorString = "Johnn Berendt";
			titleString = "Midnight in Garden of Good and Evil";
			due_dateString = "July 26, 2016";
			System.out.println("Author: " + authorString + titleString + due_dateString);
			break;

		default:
			authorString = "Status";
			System.out.println("checked out");
			System.out.println("on shelf");
			break;
		}
		
		
		String[] value = { "author", "title", "status", "due date" };
			System.out.println(value);
			sc.nextInt();

		
	String input = null;
	String[] authors = input.split("");
	for  (int i = 0; i < authors.length; i++) {
		}
	String[] title = input.split("");
	for (int t = 0; t < title.length; t++){
	}
	String[] keyword = input.split("");
	for (int k = 0;  k< keyword.length; k++) {
	}
	System.out.println("Search");
	}
	}
	private Scanner sc;
		//System.out.println("Search");
		String search = sc.nextLine();{
		books = new String[] { "author", "title", "status", "due date" };
		for (String book : books) { 
			System.out.println(books);

			

			// { "Douglas Adams", "The HitchHiker","Phillip K.
			// Dick Do Androids Dream of Electric Sleep", "Ray Bradbury
			// Something Wicked This Way Comes",
			// "Seth Graham Pride and Prejudice", "Sloane Crosley I Was Told",
			// "Mark Hudson The Curious Incident", "Robert Rankin The Hollow",
			// "Lynne Trust Eats Shoots and Leaves", "Harper Lee To Kill a
			// Mockingbird", "Milan Kundera The Unbearable Lightness of Being",
			// "Chelsea Handler Are You There Vodka",
			// "John Berendt Midnight in the Garden of God and Evil"
		}
		// public  Enum ; Books (12); {
	      //  books = new ArrayList<Book>();
          //  books.add(new Books.add(new Book(1,"Do Androids Dream About Electric Sleep", "Phillip K. Dick"));
          //  books.add(new Book(2,"Something Wicked This Way Comes", "Ray Bradbury"));
          //  books.add(new Book(3, "The HitchHiker", "Douglas Adams"));
          //  books.add(new Book(4, "Pride and Prejudice", "Seth Graham"));
          //  books.add(new Book(5, "I Was Told", "Sloane Crosley"));
          //  books.add(new Book(6, "The Curious Incident", "Mark Hudson"));
          //  books.add(new Book(7, "The Hollow", "Robert Rankin"));
          //  books.add(new Book(8, "Eats Shoots and Leaves", "Lynne Trust"));
          //  books.add(new Book(9, "To Kill a Mockingbird", "Harper Lee"));
          //  books.add(new Book(10, "The Unbearable Lightness to Being", "Milan Kundera"));
          //  books.add(new Book(11, "Are You There Vodka", "Chelsea Handler"));
          //  books.add(new Book(12, "Midnight in the Garden of Good and Evil", "John Berendt"));
		}

		}

		private static void Books() {
			// TODO Auto-generated method stub

		}
	
}
