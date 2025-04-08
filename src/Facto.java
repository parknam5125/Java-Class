import java.util.Scanner;
public class Facto {
    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        int product=1;
        for(int i=1;i<=10;i++){
            System.out.println("Enter a new number ("+i+" of 10):");
            int input=key.nextInt();
            product*=input;
        }
        System.out.println("Total is:"+product);
        key.close();
    }
}
