import java.util.Scanner;
public class HW2_1{
    public static void main(String[] args){
        Scanner key=new Scanner(System.in);
        String input,lower;

        System.out.println("Please enter a line to be checked for profanity");
        input=key.nextLine();
        lower=input.toLowerCase();
        System.out.println("Your input line");

        if(lower.contains("cat")){
            System.out.println("\tcontains cat");
            System.out.println("\tdoes not contain dog");
            System.out.println("\tdoes not contain llama");
            System.out.println("The line would be considered profane.");
        }
        if(lower.contains("dog")){
            System.out.println("\tdoes not contain cat");
            System.out.println("\tcontains dog");
            System.out.println("\tdoes not contain llama");
            System.out.println("The line would be considered profane.");
        }
        if(lower.contains("llama")){
            System.out.println("\tdoes not contain cat");
            System.out.println("\tdoes not contain dog");
            System.out.println("\tcontains llama");
            System.out.println("The line would be considered profane.");
        }
        key.close();
    }
}
