import java.util.Scanner;

public class Hw3_2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] time=new String[6];
        int cnt=0;

        System.out.println("Welcome to the Appointment scheduler");
        System.out.println("You can schedule an appointment at 1, 2, 3, 4, 5, or 6 PM.");

        while(cnt<6){
            System.out.print("What is your name?\n");
            String name=sc.nextLine();

            System.out.print("When would you like the appointment?\n");
            String input=sc.nextLine();

            int t=Integer.parseInt(input);

            if((t<1)||(t>6)){
                System.out.println("Sorry, that is not a legal time");
                continue;
            }

            if(time[t-1]!=null){
                System.out.println("Sorry, that time is already taken");
                continue;
            }

            time[t-1]=name;
            cnt++;
        }
        System.out.println("All appointments made");
        for (int i=0;i<6;i++){
            System.out.println("At "+(i+1)+"PM is "+time[i]);
        }
        sc.close();
    }
}
