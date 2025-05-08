import java.util.Scanner;
public class ArrayOfTemperatures {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("How many temperatures do you have?");
        int in = key.nextInt();
        double[] temp = new double[in];
        double sum = 0;
        System.out.println("Enter " + in + " temperatures:");
        for(int i = 0 ; i < temp.length ; i++){
            temp[i]=key.nextDouble();
            sum+=temp[i];
        }
        double avg = sum/in;
        System.out.println("The average temperatur is " + avg );
        System.out.println("The temperatures are");
        for(int i = 0 ; i < temp.length ; i++){
            if(temp[i] > avg){
                System.out.println(temp[i] + " above average");
            }
            else if(temp[i] < avg){
                System.out.println(temp[i] + " below average");
            }
            else{
                System.out.println(temp[i] + " is average");
            }
        }
        System.out.println("Have a nice week.");
        key.close();
    }
}
