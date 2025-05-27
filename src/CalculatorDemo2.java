public class CalculatorDemo2{
    public static void main(String[] args) {
        try{
            Calculator c1 = new Calculator();
            c1.setOprands(10,0);
            c1.divide();
            Calculator c2 = new Calculator();
            c2.setOprands(10, 5);
            c2.divide();
        }
        catch(DividedByZeroException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
