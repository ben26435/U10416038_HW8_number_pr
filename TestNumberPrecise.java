//U10416038 Ma Chia-Liang

//import API
import java.util.Scanner;
import static java.lang.System.out;

public class TestNumberPrecise{
	//Main method
	public static void main(String[] args){
		//Create a Scanner
		Scanner scanner = new Scanner(System.in);
		//Enter the variable
		out.println("Enter a number to be dividend");
		double a = scanner.nextDouble();
		out.println("Enter a number to be divisor");
		double b = scanner.nextDouble();
		out.println("Enter an Int for precise.");
		int c = scanner.nextInt();
		//Create object
		NumberPrecise np = new NumberPrecise(a,b,c);
		//Show Result
		np.Result();
	}
}