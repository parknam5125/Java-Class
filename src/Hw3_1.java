import java.util.Scanner;
public class Hw3_1 {
    public static double[][] findFigure(double[][] picture, double threshold){
        int rows = picture.length;
        int cols = picture[0].length;
        double sum = 0.0;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                sum = sum + picture[i][j];
            }
        }
        double avg = sum/(rows*cols);
        double[][] result = new double[rows][cols];
        double thresholdValue = threshold * avg;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(picture[i][j] > thresholdValue){
                    result[i][j] = 1.0;
                }
                else{
                    result[i][j] = 0.0;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        double threshold;
        double[][] picture = {
            {1.2, 1.3, 4.5, 6.2, 2.7},
            {1.7, 3.3, 4.4, 10.5, 17.0},
            {1.1, 4.5, 2.1, 25.3, 9.2},
            {1.0, 9.5, 8.3, 2.9, 2.1}
        };
        System.out.println("Enter Threshold");
        threshold = key.nextDouble();
        double[][] result = findFigure(picture, threshold);

        System.out.println("RESULT");
        System.out.println("--------------------");
        for(int i = 0; i < result.length; i++){
            for(int j = 0; j < result[0].length; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        key.close();
    }
}
