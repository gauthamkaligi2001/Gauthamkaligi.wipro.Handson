package wiprotraining;
import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {

		System.out.println("Enter the number:");
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();	
	
		if(num<0) {
			System.out.println("Negative");
			  }
			else{
			      System.out.println("Positive");
			}
	}

}
