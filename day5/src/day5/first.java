package day5;
import java.util.Scanner;
public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String:");
		String text =sc.nextLine();
		System.out.println("enter the String:");
		String pattern=sc.nextLine();
		int position=search(text,pattern);
		if(position!=-1) {
			System.out.println("pattern is found");
		}else {
			System.out.println("pattern is not found");
		}
	}
	//Rabin-karp// //poik//
	static int search(String text,String pattern) {
		int n=text.length();
		int m=pattern.length();
		for(int i=0;i<=n;i++) {
			int j;
			for(j=0;j<m;j++) {
				if(text.charAt(i+j)!=pattern.charAt(j)) {
					break;
				}
			}
			if(j==m) {
				return i;
			}
		}
		return -1;
	}
}
