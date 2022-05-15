package Operations;
import java.util.*;
public class InterfaceTester {
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a process Subtraction(S), Addition(A), Multiplication(M)");
		System.out.print("Answer: "); char ans= in.next().charAt(0);
		while(ans != 'p'){
		if (ans == 'S') {
			Subtraction obj = new Subtraction();
			double ans1 = obj.subtraction();
			System.out.print("answer= "+ans1);
		}else if(ans == 'A') 
		{
			Addition obj  = new Addition();
			double ans2 = obj.addition();
			System.out.print("answer= "+ans2);
		}else if(ans == 'M') 
		{
			Multiplication obj  = new Multiplication();
			double ans3 = obj.multiplication();
			System.out.print("answer= "+ans3);
		}
		
		in.close();
	}
	

}
}