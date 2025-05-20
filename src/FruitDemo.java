import java.util.Arrays;
public class FruitDemo {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[4];
        fruits[0]=new Fruit("O");
        fruits[1]=new Fruit("A");
        fruits[2]=new Fruit("K");
        fruits[3]=new Fruit("D");

        Arrays.sort(fruits);

        for(Fruit f:fruits){
            System.out.println(f.getName());
        }
    }
}
