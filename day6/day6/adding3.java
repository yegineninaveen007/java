package day6;

public class adding3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] number= {10,20,30,40,50};
		int window=3;
	
		for(int i=0;i<=number.length-window;i++) {
			int sum=0;
			for (int j=window-1;j>=i+i;j--) {
				sum=sum+number[j];
			}
			System.out.println("Sum="+sum);
		}
	}

}
