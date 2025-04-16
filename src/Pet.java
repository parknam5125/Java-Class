public class Pet {
    private String name;
    private int age;
    private double weight;

void Pet(){
    name="not yet";
    age=0;
    weight=0.0;
}

public void writeOutput(){
    System.out.println("Name= "+name);
    System.out.println("Age= "+age);
    System.out.println("Weight= "+weight+"kg");
}

}
