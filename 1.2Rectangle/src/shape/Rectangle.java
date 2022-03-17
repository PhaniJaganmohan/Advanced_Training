package shape;

import java.util.Scanner;

public class Rectangle {
	int length;
	int breadth;
	int area;
	int perimeter;
	
	void input() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the length of rectangle");
		length = sc.nextInt();
		System.out.println("Enter the breadth of rectangle");
		breadth = sc.nextInt();
		}
	
	void calculate() {
		area = length*breadth;
		perimeter = 2*(length+breadth);
	}
	
	void display() {
		System.out.println("Area of rectangle : "+area);
		System.out.println("perimeter of rectangle : "+perimeter);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle();
		r.input();
		r.calculate();
		r.display();
	}

}
