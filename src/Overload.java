public class Overload {
    public static void main(String[] args) {
        double avg1 = Overload.getavg(40.0, 50.0);
        double avg2 = Overload.getavg(1.0, 2.0, 3.0);
        char avg3 = Overload.getavg('a', 'c');
        System.out.println("avg1 = " + avg1);
        System.out.println("avg2 = " + avg2);
        System.out.println("avg3 = " + avg3);
    }
    public static double getavg(double n1, double n2){
        return (n1 + n2)/2;
    }
    public static double getavg(double n1, double n2, double n3){
        return (n1 + n2 + n3)/3;
    }
    public static char getavg(char c1, char c2){
        return (char)(((int)c1 + (int)c2)/2);
    }
}
