public class ArrayData {
    private int[] arr = new int[3];
    ArrayData(){
        arr[0]=0;
        arr[1]=10;
        arr[2]=20;
    }
    public void z(int first, int second){
        try{
            System.out.println(arr[first]/arr[second]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException");
        }
        catch(Exception e){
            System.out.println("Exception");
        }
    }
}
