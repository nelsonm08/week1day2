package week1.day2;
import java.util.Arrays;

public class MissingElement {
	public static void main(String[] args)
	{
		int[] arr= {1,2,3,4,7,6,8};
		Arrays.sort(arr);   
		System.out.println("Elements of array in ascending order: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);  
		}
		
		
		for (int i = arr[0]; i < arr.length; i++)   
		{       
			
			if (i!=arr[i-1])
			{
				System.out.println("Missing number in Array"+ i);
				break;
			}
		}
		
	}
}

