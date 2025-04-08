import java.util.Scanner;
public class While {
    public static void main(String[] args){
        Scanner key=new Scanner(System.in);
        int i;
        int cnt=0;

        System.out.println("Enter a number:");
        i=key.nextInt();

        while(cnt<i){
            if(i==0){
                System.out.println();
                break;
            }
            System.out.print((cnt+1)+", ");
            cnt++;
        }
        System.out.println();
        System.out.println("Buckle my shoe");

        key.close();
    }
}
