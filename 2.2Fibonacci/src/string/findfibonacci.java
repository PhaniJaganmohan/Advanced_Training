package string;

import java.util.Scanner;

public class findfibonacci {

	 public static void main(String[] args) {
		  
		  Scanner scanner=new Scanner(System.in);
		   System.out.println("Enter the Number of n");
		   int n=scanner.nextInt();
		   
		   Scanner Scanner=new Scanner(System.in);
		   System.out.println("Enter the Number of i");
		   int i=scanner.nextInt();

	    int  firstTerm = 0, secondTerm = 1;
	    System.out.println("Fibonacci Series till " + n + " terms:");

	    while (i <= n) {
	      System.out.print(firstTerm + ", ");

	      int nextTerm = firstTerm + secondTerm;
	      firstTerm = secondTerm;
	      secondTerm = nextTerm;

	      i++;
	    }
	  }
	}
