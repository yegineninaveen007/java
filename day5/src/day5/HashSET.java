package day5;
import java.util.ArrayList;
import java.util.HashSet;
public class HashSET {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set=new HashSet();
		System.out.println("Size of hash beforn adding element:"+set.size());
		System.out.println("HashSet is empty beforn value:"+set.isEmpty());
		System.out.println("containing of Hashset:"+set);
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
		set.add("F");
		set.add(null);
		System.out.println("Size of hash after adding element:"+set.size());
		System.out.println("HashSet is empty after value:"+set.isEmpty());
		System.out.println("containing of hashset:"+set);
		boolean b1=set.contains("E");
		System.out.println("value E is present"+b1);
		boolean b2=set.contains("R");
		System.out.println("value E is present"+b2);
		set.remove("B");
		System.out.println("Size of hashset after the delection"+set.size());
		System.out.println("containing of hashset:"+set);
		set.clear();
		System.out.println("Size of hashset after the clearing"+set.size());
		System.out.println("containing of hashset after the clearing:"+set);
	}

}
