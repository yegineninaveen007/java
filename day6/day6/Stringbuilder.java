package day6;

public class Stringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("Java");

        sb.append(" Program");
        System.out.println("Append : " + sb);

        sb.insert(5, "Easy ");
        System.out.println("Insert : " + sb);

        sb.replace(0, 4, "Core");
        System.out.println("Replace: " + sb);

        sb.delete(5, 10);
        System.out.println("Delete : " + sb);
 
        System.out.println("length:"+sb.length());
        
        System.out.println("capacity:"+sb.capacity());
        
        System.out.println("substring:"+sb.substring(1, 4));
	}

}
