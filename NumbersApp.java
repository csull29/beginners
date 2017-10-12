/*
NumersApp.java
@ author C Sullivan
7 Feb 2017
*/
import java.util.*;
public class NumbersApp{
	public static void main(String args[]){


		//variables
		int num1;
		int num2;
		int sum;


		//objects
		Scanner keyboard;
		keyboard = new Scanner(System.in);
		Numbers myNumbers; //bringing in my instan class - creating the linkage between the two files
		myNumbers=new Numbers();

		//input - ask the question, store the answer and send it back to the instan class
			System.out.println("Please enter your first number"); //ask the question
			num1=keyboard.nextInt(); //store the answer
			myNumbers.setNum1(num1); // sending the number to the instan class

			System.out.println("Please enter your second number");
			num2=keyboard.nextInt();
			myNumbers.setNum2(num2);


		//process
		myNumbers.compute();



		//output
		sum=myNumbers.getSum(); //go out to my instan class called myNumbers and get the sum and store it in in my sum variable here in my app class
		System.out.println("The total sum of your two numbers is "+sum);


	}








}