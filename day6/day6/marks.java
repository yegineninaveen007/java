package day6;

public class marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks= {30,40,50,60,70,80};
		int target =80;
		int left=0;
		int right= marks.length-1;
		while(left<right) {
			int sum=marks[left]+marks[right];
			if(sum==target) {
				System.out.println("number is found:"+marks[left]+"add"+marks[right]);
				break;
			}else if(sum<target) {
				left++;
			}else {
				right--;
			}
		}
	}

}
