package strrev;
import java.util.Scanner;
public class appleascii {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string:");
		String s=sc.nextLine();
		char ch[]=s.toCharArray();
		int n=s.length();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=ch[i];
			System.out.println(a[i]);

		}
		for(int i=0;i<n;i++) {
		int	count=0;
		for(int j=2;j<a[i];j++) {
				if(a[i]%j==0) {
					count++;
				}
			}
			if(count==0) {
				System.out.println(((char)a[i]));
				
			}
		}
		
	}
	
}


		
