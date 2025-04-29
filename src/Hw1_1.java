import java.util.Scanner;
public class Hw1_1 {
    public static void main(String[] args){
        Scanner key=new Scanner(System.in);
        String name;
        int roll_number;
        String address;
        String course;

        System.out.print("Enter your name: ");
        name=key.next();
        System.out.print("Enter your roll number: ");
        roll_number=key.nextInt();
        System.out.print("Enter your address: ");
        address=key.nextLine();
        key.nextLine();
        System.out.print("Enter your course: ");
        course=key.nextLine();

        System.out.println(name+" has roll no "+roll_number+",");
        System.out.println("his address is "+address+" and the cousr he studies is "+course);

        key.close();
    }

}
