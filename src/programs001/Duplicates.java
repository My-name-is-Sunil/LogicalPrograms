package programs001;

import java.util.Arrays;

public class Duplicates {
	
	public static void main(String[] args) {
		int a[] = {1,2,3,4,6,5,7,4,8,8,9};
		Arrays.sort(a);
		int length = a.length;
		int temp[] = new int [a.length];
		int j = 0;
		
		
		for(int i=0;i<length-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				temp[j]=a[i];
				j++;
			}
			temp[j]=a[a.length-1];
		}
		
		for(int i=0;i<j+1;i++)
		{
			System.out.print(" "+temp[i]);
		}
	}

}
