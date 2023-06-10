package programs001;

import java.util.Arrays;

public class Practice {
	
	
	public static void main(String[] args) {
		
		
		int a[] = {1,5,5,2,3,2,3,4,4};
		
		int length = a.length;
		for(int i=0;i<length;i++)
		{
		//	int x =a[i];
			int count=0;
			for(int j=0;j<length;j++)
			{
				if(a[i]==a[j])
				{
					++count;
				}
			}
		
		if(count==1) {
		System.out.println(a[i]);
		}
		}
	//	System.out.println(res);
		
			}

}
