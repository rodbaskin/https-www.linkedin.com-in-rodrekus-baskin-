
public class Books {

	private static String[] arrayBooks;
	
	public static void main(String[] args) {
			setArrayNames(new String[]{ "Phillip k. Dick", "Ray Bradbury", "Douglas Adams", "Seth Graham", "Sloane Crosley",
				"Mark Hudson", "Robert Rankin", "Lynne Trust", "Harper Lee", "Milan Kundera", "Chelsea Handler",
				"John Berendt" });
			setArrayTitles(new String[] { "Do Androids Dream of Electric Sleep", "Something Wicked This Way Comes",
					"The HitchHiker", "Pride and Prejudice", "I Was Told", "The Curious Incident", "The Hollow",
					"Eats Shoots and Leaves", "To Kill A Mockingbird", "The Unbearable Lightness of Being",
					"Are You There Vodka", "Midnight in the Garden of Good and Evil" });
  }
	
	private static void setArrayTitles(String[] strings) {
		// TODO Auto-generated method stub
		
	}
	private static void setArrayNames(String[] strings) {
		// TODO Auto-generated method stub
		
	}

	public static String[] getArrayBooks() {
		return arrayBooks;
	}

	public static void setArrayBooks(String[] arrayBooks) {
		Books.arrayBooks = arrayBooks;
	}

}
