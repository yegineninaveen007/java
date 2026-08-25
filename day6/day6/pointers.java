package day6;

public class pointers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number= {10,20,30,40,50};
		int target =70;
		int left=0;
		int right= number.length-1;
		while(left<right) {
			int sum=number[left]+number[right];
			if(sum==target) {
				System.out.println("number is found:"+number[left]+"add"+number[right]);
				break;
			}else if(sum<target) {
				left++;
			}else {
				right--;
			}
		}
	}

}
