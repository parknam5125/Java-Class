public class Person {
    private String name;
    public Person(){
        name = "No name yet";
    }
    public Person(String name){
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void writeOutput(){
        System.out.println("Name: " + name);
    }
    public boolean hasSameName(Person other){
        return this.name.equalsIgnoreCase(other.name);
    }
}
