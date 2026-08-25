package day6;

public class fixednum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] expenses = {100,200,150,300,250};
		int fixed=3;
		int sum=0;
		int h=0;
		for(int i=0;i<expenses.length-fixed;i++) {
			for(int j=i+1;j<expenses.length+i-fixed;j++) {
				sum+=expenses[j-1];
				sum=Math.max(sum,sum+expenses[j]);
				if(h<sum) {
					h=sum;
				}else {
					h=0;
				}
			}
		}
		System.out.println(h);
	}

}
