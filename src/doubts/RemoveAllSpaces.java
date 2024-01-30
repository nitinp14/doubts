package doubts;

public class RemoveAllSpaces {
	public static void main(String[] args) {
		String str="   hello world  .sojao  ";
		str=str.replaceAll("\\s", "");
		System.out.println(str);
	}
}
