package day5;

import java.util.Scanner;


public class substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String:");
		String g=s.nextLine();
		for(int i=0;i<=g.length();i++) {
			for(int j=i+1;j<=g.length();j++) {
				System.out.println("subString:"+g.substring(i,j));
			}
		}
		s.close();
	}

}
