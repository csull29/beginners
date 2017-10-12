/*
Numbers.java
@ author C Sullivan
7 Feb 2017
*/


//create an application that asks the user for two numbers
//and works out the total

//1. Class signature
public class Numbers{


	//Data Member i.e variables
	//introduce private
	private int num1;
	private int num2;
	private int sum;


	//constructor
	public Numbers(){
		num1=0;
		num2=0;
		sum=0;
	}


	//setters - represent our inputs
	//one setter for each input
	public void setNum1(int num1){//returning in num1
		this.num1=num1;//the variable in here called num1 is the same as variable out in your app class

	}


	public void setNum2(int num2){
		this.num2=num2;
	}

	// compute - calculations
	public void compute (){
		sum=num1+num2; //working out calculations
	}

	//getters - represent your outputs
	//one getter for every output
	public int getSum(){ //getting the sum from above
		return sum; //returning the sum to the app class
	}



}