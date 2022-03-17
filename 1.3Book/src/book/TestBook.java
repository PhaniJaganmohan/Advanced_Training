package book;

import java.util.Scanner;

public class TestBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the book name ");
		String bookname = sc.nextLine();
		
		System.out.println("Enter the book price");
		int price = sc.nextInt();
		sc.nextLine();
		
		Book obj = new Book();
		obj.setBookName(bookname);
		obj.setBookprice(price);
		System.out.println("Book details");
		System.out.println("Book Name : "+obj.getBookName());
		System.out.println("Book price : "+obj.getBookprice());

	}

}
