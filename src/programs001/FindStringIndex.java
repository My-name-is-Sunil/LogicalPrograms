package programs001;

public class FindStringIndex {
	
	public static void main(String[] args) {
		
		String [] colors = {"Red" , "Green", "Yellow","Blue","Orange"};
		int index=0;
		
		for(int i=0;i<colors.length;i++)
		{
			if(colors[i]=="Orange")
			{
				index=i;
			}
		}
		
		System.out.println("Index is "+index);
	}

}
