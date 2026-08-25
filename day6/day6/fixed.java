package day6;

public class fixed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] number= {10,20,30,40,50};
		int window=3;
		int sum=0;
		for(int i=0;i<window;i++) {
			sum=sum+number[i];
		}
		System.out.println("sum="+sum);
		int start=0;
		for(int end=window;end<number.length;end++) {
			sum=sum-number[start];
			sum=sum+number[end];
			start++;
			System.out.println("Sum="+sum);
		}
	}

}
