public class Fruit implements java.lang.Comparable{
    private String fruitName;

    public Fruit(){
        fruitName="";
    }
    public Fruit(String name){
        fruitName=name;
    }
    public void setName(String name){
        fruitName=name;
    }
    public String getName(){
        return fruitName;
    }
    public int compareTo(Object obj){
        if(!(obj !=null||obj instanceof Fruit))
            return 0;
        Fruit fruit = (Fruit)obj;
        return this.fruitName.compareTo(fruit.fruitName);
    }
}
