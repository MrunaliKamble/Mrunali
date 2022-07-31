package githubdata;

public class reversestr2 {
public static void main(String[] args) 
{
	String a = "Maheshdeepak";
	char[]ar=a.toCharArray();
	System.out.println(ar[2]);
		
	for(int i=a.length()-1; i>=0; i--)
	{
	 System.out.print(ar[i]);
	}
	
}
}
