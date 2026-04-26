public class Palindromcheck {
    public static void main(String[] args) {
		
		String str = "Madam";

        if (str.equals(new StringBuilder(str).reverse().toString()))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
	}
}
