package week1.day2;

public class facttorial
{
	public static void main(String[] args)
	{
		int num=5;
		int fact=1;
		for (int j = num; j>0; j--) 
		{
		fact=fact*j;
			
		}
		System.out.println("factorial for the number is :"  +fact);
	}

}

