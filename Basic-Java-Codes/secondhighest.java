import java.util.Arrays;

public class secondhighest {
	public static void main(String[] args) {
		int arr [] = {10,20,30,50,100,80};
		Arrays.sort(arr);
		System.out.println("Second highest number: " + arr[arr.length - 2]);
		System.out.println("Third highest number: " + arr[arr.length - 3]);
		

	}
}
