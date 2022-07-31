package githubdata;

public class reversestr3 {
public static void main(String[] args) {
	String str = "avdhut ram shyam vada burger juice pizza";
	
	String ar[] = str.split(" ");
	for(int i = ar.length-1;i>=0;i--) {
		String s1 = ar[i];  
		//needs to reverser the each word
		String rev = "";
		for(int j = s1.length()-1;j>=0;j--) {
			rev = rev + s1.charAt(j);
		
		}
		
		System.out.println(rev);
	}
	
	}
	
}




