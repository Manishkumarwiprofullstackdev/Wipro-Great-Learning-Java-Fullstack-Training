
import java.util.Scanner;
public class Firstprogram {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID: ");
		
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Name: ");
		String name = sc.nextLine();
		System.out.println("My ID is: " + id);
		
		System.out.println("My Name is: " + name);
		
		sc.close();

	}

}
