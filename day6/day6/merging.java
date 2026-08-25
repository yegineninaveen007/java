package day6;

public class merging {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] j= {"uday","ullas","vinod"};
		String[] k= {"yashas","naveen"};
		
		String[] merged = new String[j.length + k.length];
		for (int i=0; i<j.length;i++) {
			merged[i] = j[i];
		}
		for (int i=0; i<k.length;i++) {
			merged[j.length + i] = k[i];
		}
		System.out.println("Merged Array:");
		for (int i=0; i<merged.length; i++) {
			System.out.println(merged[i] + " ");
		}
	}

}
