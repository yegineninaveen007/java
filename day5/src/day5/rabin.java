package day5;

import java.util.Scanner;
public class rabin {

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
		sc.close();
	}
	//Rabin-karp
	static int search(String text,String pattern) {
		int n=text.length();
		int m=pattern.length();
		int patternHash=getHash(pattern);
		for(int i=0;i<=n;i++) {
			String part=text.substring(i,i+m);
			int partHash=getHash(part);
			if(patternHash==partHash) {
				if(part.equals(pattern)) {
				return i;
				}
			}
		}
		return -1;
	}
	static int getHash(String str) {
		int hash=0;
		for(int i=0;i<str.length();i++) {
			hash=hash+str.charAt(i);
		}
		return hash;
	}
}
