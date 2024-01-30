package doubts;

public class convertingToUpperCase {
	public static void main(String[] args) {
		
		String st="HELLO Bro";
		char [] ch=st.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>='A' && ch[i]<='Z')
				ch[i]=(char)(ch[i]+32);
		}
		st=new String(ch);
//		System.out.println(ch);
		System.out.println(st);
	}
}
