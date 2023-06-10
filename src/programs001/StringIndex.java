package programs001;

public class StringIndex {
	
	public static void main(String[] args) {
		
	String [] colors = {"Red","Blue","Green","Orrange","Grey"};
	
	int num[] = {1,2,3,5,6};
	int index=0;
	int index2=0;
	
	for(int i=0;i<colors.length;i++)
	{
		if(colors[i]==("Green"))
		{
			index=i;
		}
	}
	
	
	for(int i=0;i<num.length;i++)
	{
		if(num[i]==5   )
		{
			index2=i;
		}
	}
	
	System.out.println("Color index is  "+index+"  "+"Number index is "+index2);
	}
}
