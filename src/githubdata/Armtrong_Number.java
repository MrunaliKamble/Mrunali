package githubdata;

public class Armtrong_Number {
	public static void main(String[] args) 
	{
		int num=153 ;
		int sum=0;
		
		for(int i=num ;i>=0; i=i/10)
		{
			int rem=i%10;
			sum=sum+(rem*rem*rem);
		}
		if (num == sum)
		{
			System.out.println("given number " + num + " is an armstrong number");
		} 
		else 
		{
			System.out.println("given number " + num + " is not an armstrong number");
		}
		// Mahesh Manchakrao Magar
	}
	

}
