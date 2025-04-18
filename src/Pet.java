public class Pet {
    private String name;
    private int age;
    private double weight;

public Pet(){
    name="not yet";
    age=0;
    weight=0.0;
}

public void writeOutput(){
    System.out.println("Name= "+name);
    System.out.println("Age= "+age);
    System.out.println("Weight= "+weight+"kg");
}

Pet(String newName, int newAge, double newWeight){
    name=newName;
    age=newAge;
    weight=newWeight;
}
Pet(String newName){
    name=newName;
    age=0;
    weight=0;
}
Pet(double newWeight){
    name="not yet";
    age=0;
    weight=newWeight;
}


}
