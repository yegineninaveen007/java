package day5;

import java.util.Scanner;

public class palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String:");
		String g=s.nextLine();
		boolean o=false;
		for(int i=0;i<=g.length();i++) {
			if( g.charAt(i) != g.charAt(g.length()-i-1)) {
				o=false;
				break;
			}else { 
				o=true;
			}
		}
		if(o) {
			System.out.println(g+"is palindrom");
		}else {
			System.out.println(g+"is not palindrom");
		}
		s.close();
	}

}
