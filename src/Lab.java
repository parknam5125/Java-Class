import java.util.Scanner;

public class Lab {

	public static void main(String[] args) {
		Scanner key=new Scanner(System.in);
		System.out.println("Enter two whole numbers");
        
        System.out.println("separated by one or more spaces");
        int a;
        int b;
        a=key.nextInt();
        b=key.nextInt();
        System.out.println("You entered "+a+" and "+b);

        System.out.println("Next enter two numbers.");
        System.out.println("A decimal point is OK.");
        double c=key.nextDouble();
        double d=key.nextDouble();
        System.out.println("You entered "+c+" and "+d);

		key.close();
	}

}