package train;
class Parents
{
   void property()
   {
	   System.out.println("Property");
   }
   void marry()
   {
	   System.out.println("famaily selected girl/boy");
   }
}
public class hi extends Parents{
	void marry()
	{
		System.out.println("campus selected girl/boy");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hi test = new hi();// object
		test.marry();
		test.property();
	}

}
