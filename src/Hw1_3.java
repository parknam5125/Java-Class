import java.util.Scanner;;

public class Hw1_3 {
    public static void main(String[] args){
        Scanner key=new Scanner(System.in);
        float weight,height;
        int age;
        float manBMR,womanBMR;
        float manchoco,womanchoco;

        System.out.print("Enter your weight(pound): ");
        weight=key.nextFloat();
        System.out.print("Enter your height(inch): ");
        height=key.nextFloat();
        System.out.print("Enter your age(year): ");
        age=key.nextInt();
        
        womanBMR=655f+(4.3f*weight)+(4.7f*height)-(4.7f*age);
        manBMR=66f+(6.3f*weight)+(12.9f*height)-(6.8f*age);
        
        manchoco=manBMR/230f;
        womanchoco=womanBMR/230f;

        System.out.printf("If you are a man, you can eat %.2f chocolate bars to maintain your weight.\n",manchoco);
        System.out.printf("If you are a woman, you can eat %.2f chocolate bars to maintain your weight.\n",womanchoco);
        key.close();
    }
}
