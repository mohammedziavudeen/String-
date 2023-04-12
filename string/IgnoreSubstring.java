package string;

import java.util.Scanner;

public class IgnoreSubstring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String name=sc.nextLine();
		System.out.println("Enter the SubString to check");
		String check=sc.next();
		boolean first=false;
		for (int i=0;i<name.length();i++) {	
		if(name.charAt(i)==check.charAt(0)) {
			int count=1;
			for(int j=1;j<check.length()&&i<name.length();j++) {
				i++;
				if(name.charAt(i)==check.charAt(j)) {
				count++;
			}
				else {
					break;
				}
				
		}
			if(count==check.length()) {
				System.out.println("yes");
				first=true;
				break;
			}
	}
	}
		if(first==false) {
			System.out.println("Not a substring");
		}
}
}