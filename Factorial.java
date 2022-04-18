public class Factorial
{
	public static int fact(int num)
	{
		int temp=num;
		for(int i=1;i<=num;i++)
		{
			temp=temp*i;
		}
		return temp;
	}
}
