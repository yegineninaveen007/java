package day5;

import java.util.Scanner;
import java.util.Arrays;
public class anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str1 = "just";
	        String str2 = "stuj";
	        str1 = str1.replaceAll("\\s", "").toLowerCase();
	        str2 = str2.replaceAll("\\s", "").toLowerCase();
	        if (str1.length() != str2.length()) {
	            System.out.println("Not an anagram");
	            return;
	        }
	        char[] arr1 = str1.toCharArray();
	        char[] arr2 = str2.toCharArray();

	        Arrays.sort(arr1);
	        Arrays.sort(arr2);
	        if (Arrays.equals(arr1, arr2)) {
	            System.out.println("They are anagrams.");
	        } else {
	            System.out.println("Not an anagram.");
	        }
	}
}
