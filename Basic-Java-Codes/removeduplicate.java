public class removeduplicate {
    public static void main(String[] args) {
		String str = "Mkskksks";
		String result = "";
		for (char c: str.toCharArray())
			if(result.indexOf(c) == -1 )
				result += c;
		System.out.println(result);

	}
}
