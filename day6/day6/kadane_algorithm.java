package day6;

public class kadane_algorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]profit= {5,3,-2,4,-10,6,2};
		int currentProfit = 0;
		int bestProfit = 0;
		for ( int i=0; i<profit.length; i++) {
			currentProfit = currentProfit + profit[i];
			if (currentProfit<0) {
				currentProfit = 0;
			}
			if (currentProfit>bestProfit) {
				bestProfit = currentProfit;
			}
		}
		System.out.println("Maximum Profit:" + bestProfit);
	}

}//5 test highest mark score in the year
