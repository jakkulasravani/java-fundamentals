package excercise18;

import java.util.Scanner;

public class palindrome {
	public static void main(String args[])
	{
		int n,a,b,r=0;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		a=n;
		while(n>0)
		{
			b=n%10;
			r=r*10+b;
			n=n/10;
			
		}
		if(r==a){
			System.out.println("palindrome");
			
		}
		else
			System.out.println("not palindrome");
	}

}
