import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        int sum=0;
        for(int i=1;i<=10;i++){
            System.out.println("Enter a new number ("+i+" of 10):");
            int input=key.nextInt();
            sum+=input;
        }
        System.out.println("Total is:"+sum);
        key.close();
    }
}
