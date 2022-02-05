// Create a basic addition program using method implementation:

// 1) Create a method performAddtion of return type int and accepts two integer arguments.

// 2) read two numbers from the user and call performAddtion method inside main method

// 3) Display the result.

// method to perfom addition of 2 integers

/*
This program took quite a sometime  as there was big 2 weeks breaks and that tought be how sacry the break is.

I was not in full mind, so was not even doing class definition and were defining a funcitn outside of main, while i must be defininig a class.
Made mistake of th print decorations
git commands forgetting


*/

import java.util.Scanner; //importing scanner package for reading

class Addnos{  //calss definition for addig numbers
	int sum;
		public int sumofnos(int no1, int no2){ //receiving 2 integers from the main fucntion call
		sum = no1 + no2;
		return sum;  // retuning the calulcated sum

		}


}

public class ObjectCalc{
	public static void main(String[] args) {
		
		int no1, no2, sum;  //vairalbe declarations
		Scanner inp1 = new Scanner(System.in); //scanner intialisaion
		Scanner inp2 = new Scanner(System.in);

		Addnos obj1 = new Addnos(); //firs object of calss Addnos




		System.out.println("Enter the two numbers \n no 1");
		no1 = inp1.nextInt();
		System.out.println("Enter no 2");
		no2 = inp2.nextInt();

		sum = obj1.sumofnos(no1, no2);

		System.out.println(" Sum of the number is" + sum );



	}
	
}