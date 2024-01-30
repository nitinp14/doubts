package doubts;

import java.util.Scanner;

public class Julius {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the code");
		String code=sc.nextLine();
		
		System.out.println("enter the encrypted value");
		int n=sc.nextInt();
		
		String decipher="";
		char ch;
		
		for(int i=0;i<code.length();i++)
		{
		ch=code.charAt(i);
		
		if(ch+n>122)
		{
			ch=(char)(code.charAt(i)+n-26);
			decipher=decipher+ch;
		}
		else {
			ch=(char) (code.charAt(i)+n);
			decipher=decipher+ch;
		}
			
		}
		
		System.out.println("desired encrypted code is :" +decipher);
	}
}
