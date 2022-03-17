package split;

import java.util.Scanner;

//import java.util.Scanner;

public class SplitTheMathematicalExpression {

	public static void main(String[] args) {
		while(true) {
		System.out.println("enter the mathematical expressions");
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String[] b= a.split("\\\s");
		for(String c:b) {
			System.out.println(c);
		}
	}

}}
