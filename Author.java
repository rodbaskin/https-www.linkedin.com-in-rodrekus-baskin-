
public class Author {

	 private static String[] arrayAuthor;
	 private static String[] arrayNames;
	 
	 public static void main (String[] args){
		setArrayNames(new String[]{ "Phillip k. Dick", "Ray Bradbury", "Douglas Adams", "Seth Graham", "Sloane Crosley",
			"Mark Hudson", "Robert Rankin", "Lynne Trust", "Harper Lee", "Milan Kundera", "Chelsea Handler",
			"John Berendt" });
	 }

	public static String[] getArrayAuthor() {
		return arrayAuthor;
	}

	public static void setArrayAuthor(String[] arrayAuthor) {
		Author.arrayAuthor = arrayAuthor;
	}

	public static String[] getArrayNames() {
		return arrayNames;
	}

	public static void setArrayNames(String[] arrayNames) {
		Author.arrayNames = arrayNames;
	}
}
