import java.util.*;
class Uber
{
	public static void main(String args[])
	{
		int[] arr ={1,2,3,4,5};
		int r = 1;
		int result[] = new int[arr.length];
		for(int i = 0;i < arr.length;i++)
		{
			r = 1;
			for(int j = 0;j < arr.length;j++)
			{
				if(i != j)
				{
					r = r * arr[j];
					
				}
			}
			result[i] = r;
		}
		
		
		display(result);
	}
	
	public static void display(int[] result)
	{
		for(int i = 0;i < result.length;i++)
			System.out.println(result[i]);
	}
}

