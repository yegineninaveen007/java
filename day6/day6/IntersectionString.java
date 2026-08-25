package day6;

public class IntersectionString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a= {"uday","ullas","vinod"};
		String[] b= {"yashas","naveen","ullas"};
		for (int i=0; i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i].equals(b[j])) {
					System.out.println(a[i]);
				}
			}
		}
	}

}
