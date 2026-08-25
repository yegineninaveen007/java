package day6;

public class student {
	public static void main(String[]args) {
		int[] student = {10,20,30,25};
		int[] prefixSum = new int[student.length];
		prefixSum[0] = student[0];
		for (int i=1; i<student.length; i++) {
			prefixSum[i] = prefixSum[i-1] + student[i]; 
		}
		int sum = prefixSum[3] - prefixSum[0];
		System.out.println("Total Spent:" + sum);
	}
}
