import java.util.Scanner;

public class Ex2_1a {

	public static void main(String[] args) {
		
		System.out.println("Type a four-digit integer, such as 2017");	//induce correct integer
		Scanner key=new Scanner(System.in);		//like scanf
		int i=key.nextInt();
		int first = i / 1000;            // number of thousand
        int second = (i / 100) % 10;     // number of hundred
        int third = (i / 10) % 10;       // number of ten
        int fourth = i % 10;             // number of one
		
		System.out.println(first+"\n"+second+"\n"+third+"\n"+fourth+"\n"); //each print in new line
        key.close();
	}

}
