import java.util.Scanner;
public class ExamAverage {
    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        int sum,i,cnt;
        double avg;
        String answer;
        do{
            System.out.println("Want to average another exam?");
            System.out.println("Enter y or n.");
            answer=key.next();
            if(answer.equals("n")){
                break;
            }
            sum=0;
            i=0;
            cnt=0;
            System.out.println("Enter all the scores to ba averaged.");
            System.out.println("Entering -1 is finish.");
            System.out.println("you have entered all the scores.");
            while(i!=-1){
                i=key.nextInt();
                if(i==-1){
                    break;
                }
                sum=sum+i;
                cnt++;
            }
            avg=sum/cnt;
            System.out.println("The average is "+avg);
        }while(answer.equals("y"));
        key.close();
    }
}
