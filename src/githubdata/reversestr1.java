package githubdata;



public class reversestr1 
{
public static void main(String[] arg)
{
 String name= "Mrunali kamble";
 String Rev="";
 
 for(int i=name.length()-1; i>=0; i--)
 {
	 
	 Rev=Rev+ name.charAt(i);
 }
	
 System.out.println(Rev);
 
 
 // palindrom
 
 if(name.equals(Rev))
 {
	 System.out.println("the given string is palindrom");
	 
	
}
 else
 {
	 System.out.println("the given string is not palindrom");
 }
}
}