package train;

public class methodoverload {

	int m1() {
		System.out.println("addffff ");
		return 0;
	}
	int m1(int d) {
		System.out.println("addfffff "+d);
		return d;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodoverload i=new methodoverload();
		i.m1();
		int j=i.m1(5);
		System.out.println("ddff"+j);
	}

}
