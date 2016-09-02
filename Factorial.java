package MS3.LogicalExercise1;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i,fact=1;
		int num=5;
		for(int i1=1;i1<=num;i1++)
		{
			fact=fact*i1;
			System.out.println("Factorial of num is:"+fact);
	}

}
}