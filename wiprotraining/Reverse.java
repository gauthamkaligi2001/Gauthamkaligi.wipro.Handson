package wiprotraining;
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		
		System.out.println("Enter the name : ");
		Scanner sc= new Scanner(System.in);
		String name= sc.nextLine();
		String rev = "";
		for(int i=name.length()-1;i>=0;i--) {
			rev = rev + name.charAt(i);
		}
		System.out.println(rev);
		
	}

}
