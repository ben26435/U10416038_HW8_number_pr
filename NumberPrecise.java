//U10416038 Ma Chia-Liang
//import API
import java.math.BigDecimal;
import static java.lang.System.out;

public class NumberPrecise{
	//Data Fields
	BigDecimal n1;
	BigDecimal n2;
	int c;
	//No-args Constructor (default 1/3 in 100 digits)
	NumberPrecise(){
		n1 = new BigDecimal(1);
		n2 = new BigDecimal(3);
		c = 100;
	}
	//Constructor with variable
	NumberPrecise(double a,double b,int c){
		n1 = new BigDecimal(a);
		n2 = new BigDecimal(b);
		this.c = c;
	}
	//Method to show Result
	void Result(){
		out.println(n1.divide(n2,c,0).toString());
	}
	
}