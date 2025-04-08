import java.util.Scanner;
public class HW2_4 {
    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        int input,cnt=0;
        int A=0,B=0,C=0,D=0,F=0;

        while(true){
            System.out.println("Type a Score(exit is negative integer)");
            input=key.nextInt();
            if(input>=90){
                A++;
            }
            else if(input>=80){
                B++;
            }
            else if(input>=70){
                C++;
            }
            else if(input>=60){
                D++;
            }
            else if(input>=0){
                F++;
            }
            else if(input<0){
                break;
            }
            cnt++;
        }
        System.out.println("Total number of grades= "+cnt);
        System.out.println("Number of A's= "+A);
        System.out.println("Number of B's= "+B);
        System.out.println("Number of C's= "+C);
        System.out.println("Number of D's= "+D);
        System.out.println("Number of F's= "+F);
        key.close();
    }
}
