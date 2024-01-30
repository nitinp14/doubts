package doubts;

public class ReverseString {
	public static void main(String[] args) {
		String s="hello world";
//		char[] ch = s.toCharArray();
		String s1="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
			
		}
		System.out.println(s1);
		
		StringBuffer s2=new StringBuffer(s).reverse(); 
		System.out.println(s2);
		
		String s3=new StringBuffer(s).reverse().toString();
		System.out.println(s3);
	}
}
