package questionBank;

import java.util.Scanner;

public class TwoStringsReverseOrNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first string");
		String f=sc.next();
		System.out.println("Enter second string");
		String s=sc.next();
		if(s.length()!=f.length()) {
			System.out.println("Not reverse of each other");
		}
		char arr[]=f.toCharArray();
		
		StringBuilder bf=new StringBuilder();
		for(int i=f.length()-1;i>=0;i--) {
			System.out.println(arr[i]);
			bf.append(arr[i]);
		}
		String x=bf.toString();
		if(x.equals(s)) {
			System.out.println("Reverse");
		}
		else {
			System.out.println("Not a reerse");
		}
		
	}

}
