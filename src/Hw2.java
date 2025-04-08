import java.util.Scanner;

public class Hw2 {
    public static void main(String[] args){
        Scanner key=new Scanner(System.in);
        String octal;
        char a,b,c;
        System.out.print("input(octal): ");
        octal=key.next();
        a=octal.charAt(0);
        b=octal.charAt(1);
        c=octal.charAt(2);

        int x=a-'0';
        int y=b-'0';
        int z=c-'0';

        System.out.print("output(decimal): "+(64*x+8*y+z));
        key.close();
    }
}
