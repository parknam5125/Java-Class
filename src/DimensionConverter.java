public class DimensionConverter {
    public static final int INCHES_PER_FOOT=12;
    public static double convertFeetToInches(double feet){
        return feet * INCHES_PER_FOOT;
    }
    public static double convertInchesToFeet(double inches){
        return inches / INCHES_PER_FOOT;
    }
}
