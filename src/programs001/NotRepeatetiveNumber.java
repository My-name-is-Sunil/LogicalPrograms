package programs001;

public class NotRepeatetiveNumber {
	
	
	public static void main(String[] args) {
		int a[] = {1,2,3,4,4,5,5,6,7};
		int length = a.length;
		
		for(int i=0;i<length;i++)
		{
			int  count = 0;
			for(int j=0;j<length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count>1)
				System.out.print("  "+a[i]);
		}
		
	}

}
