
import java.util.Scanner;

public class Ex2_1b {

	public static void main(String[] args) {
		
		System.out.println("Type a temperature in Fahrenheit"); //induce correct double type
		Scanner key=new Scanner(System.in);     //like scanf
		double fahrenheit=key.nextDouble();     //assign fahrenheit
        double celsius=5*(fahrenheit-32)/9;     //calculate celsius
		System.out.printf("%.6f\n",celsius);    //print celsius
        key.close();
	}

}