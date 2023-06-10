package programs001;

import java.util.Arrays;
import java.util.Scanner;

public class FindIndexOfNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
	System.out.println("enter size of sn array");
	int size = sc.nextInt();
	int a[] = new int[size];
	int length = a.length;
	//int index=
	for(int i=0;i<size ;i++) 
	{
		System.out.println("Enter elements");
		a[i]=sc.nextInt();
				
	}
	for(int i=0;i<length;i++)
	{
	System.out.println(a[i]);
	
	}
	Arrays.sort(a);

	System.out.println("Sorted Arrays = "+Arrays.toString(a));
		
//		
//		int a[] = {1,1,5,6,9,7,8,9,6,4,6};
//		Arrays.sort(a);
//		System.out.println(Arrays.toString(a));
//		
		
	}

}
