import java.util.Scanner;
public class ReturnArrayDemo {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter your score on exam 1:");
        int firstScore = key.nextInt();
        int[] nextScore = new int[3];
        for(int i = 0; i < nextScore.length; i++){
            nextScore[i] = firstScore + 5 * i;
        }
        double[] averageScore = getArrayOfAverages(firstScore, nextScore);
        for(int i = 0; i < nextScore.length; i++){
            System.out.println("If your score on exam" + (i+2) + " is " + nextScore[i]);
            System.out.println("your average will be " + averageScore[i]);
        }
    }
    public static double[] getArrayOfAverages(int firstScore, int[] nextScore){
        double[] temp = new double[nextScore.length];
        for(int i = 0; i < temp.length; i++){
            temp[i] = getAverage(firstScore, nextScore[i]);
        }
        return temp;
    }
    public static double getAverage(int n1, int n2){
        return (n1 + n2)/2.0;
    }
}
