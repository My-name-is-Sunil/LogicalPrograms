package programs001;

import java.util.Arrays;

public class uniqArray {
	
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,5,6,5,6,6,6,7,1,5,3};
		Arrays.sort(a);
		
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				System.out.println(a[i]);
			}
		}
	//	System.out.println(a[a.length-1]);
	}

}
