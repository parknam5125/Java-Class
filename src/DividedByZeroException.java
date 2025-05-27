public class DividedByZeroException extends Exception{
    public DividedByZeroException(){
        super("Dividing by Zero!");
    }
    public DividedByZeroException(String message){
        super(message);
    }
}
