/*
TestCircleWithPoint.java
Programmer: Cole Rodenberg Date: 2/4/2016
Description: This program tests the CircleWithPoint class, which
is derived from the class Point2.
*/
public class TestCircleWithPoint extends Object{
	public static void main(String[]args){
		CircleWithPoint c1 = new CircleWithPoint();
		CircleWithPoint c2 = new CircleWithPoint(3,4,4);
		CircleWithPoint c3 = new CircleWithPoint(c2);
		
		//Testing the toString method on c1
		System.out.println("Testing the default constructor, toString, circumference, and area" + c1);
		
		//Testing the equals method on two equal circles
		System.out.println("It is " + c2.equals(c3) + " that c2 = c3.\n");
		
		//Testing the equals method on two circles that are not equal
		System.out.println("It is " + c2.equals(c1) + " that c2 = c1.\n");

		//Testing the getRadius method
		System.out.println("Testing the getRadius method on c2. (Should be 4.0): " + c2.getRadius());
		
		//Testing the setRadius method
		c2.setRadius(5);
		System.out.println("Testing the setRadius method on c2. (Should make c2's radius 5.00)" + c2);
		
		//Testing the setCenter method
		c2.setCenter(4,5);
		System.out.println("Testing the setCenter method on c2. (Should make c2's center (4.00, 5.00)" + c2);
		//Testing the setCircle method
		c2.setCircle(10,13,6);
		System.out.println("Testing the setCircle method on c2. (Should make radius 6.00, center (10.00, 13.00))" + c2);
		
	}//End main
}//End TestCircleWithPoint
