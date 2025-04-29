import java.util.Scanner;
public class HW2_5 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the sentence to decode");
        String input=scan.nextLine();

        System.out.println("Enter the key to decode");
        int key=scan.nextInt();

        String output="";

        for (int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            int ascii=(int)ch-key;

            if(ascii<32){
                ascii+=127-32;
            }

            output=output+(char)ascii;
        }

        System.out.println("Testing key "+key+" :"+output);
        scan.close();
    }
}

