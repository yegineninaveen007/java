package day6;

public class Inplacerearragement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {40,20,60,40,70,60};
		int left=0;
		int right=arr1.length-1;
		while (left < right) {

            for (int i = left; i < right; i++) {

                if (arr1[i] > arr1[i + 1]) {
                    int temp = arr1[i];
                    arr1[i] = arr1[i + 1];
                    arr1[i + 1] = temp;
                }
            }

            right--;
        }
		System.out.println("Rearragment array:");
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]+" ");
		}
	}

}
