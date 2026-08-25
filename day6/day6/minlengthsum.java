package day6;

public class minlengthsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 3, 1, 2, 4, 3};
        int target = 7;
        int left = 0, sum = 0;
        int minLength = arr.length + 1;
        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];
            if(sum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                sum -= arr[left];
                left++;
                break;
            }
        }
        System.out.println("Minimum window length = " + minLength);
	}

}
