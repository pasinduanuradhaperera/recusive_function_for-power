import java.util.Scanner;

public class Rec{

		
	public static void main(String []args){
		Scanner scan = new Scanner(System.in);
		int pow = 0; //power
		int base = 0; //base
		System.out.println("Enter the value of base: ");
		base = scan.nextInt();
		System.out.println("Enter the value of power: ");
		pow = scan.nextInt();
		System.out.println("The "+ pow+ "th power of " + base + " is "+ power(base,--pow));
		
	}
	private static int power(int base,int pow){
		
		if(pow > 0){
			base *= power(base,--pow); 			
		}		
		return base;
	}
}

