public class Swap {
    public static void main(String[] args) {
        IntHolder n1 = new IntHolder();
        IntHolder n2 = new IntHolder();
        n1.value = 10;
        n2.value = 20;
        System.out.println(n1.value + " " + n2.value);
        swap(n1,n2);
        System.out.println(n1.value + " " + n2.value);
    }
    
    static void swap(IntHolder a, IntHolder b){
        int temp = a.value;
        a.value = b.value;
        b.value = temp;
    }
}
class IntHolder { public int value = 0; }
