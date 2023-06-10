package programs001;

import java.util.Scanner;

public class Inifinity {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number");
		int num = sc.nextInt();
		int rev=0;
		int rem;
		
		while(num!=0)
		{
			rem=num%10;
			rev=rev*rev*rev;
			num=num/10;
		}
		System.out.println(rev);
		
		
			
		
		
	}

}
