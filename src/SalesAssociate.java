import java.util.Scanner;
public class SalesAssociate {
    private String name;
    private double sales;
    public SalesAssociate(){
        name = "No record";
        sales = 0;
    }
    public SalesAssociate(String initName, double initSales){
        set(initName,initSales);
    }
    public void set(String newName, double newSales){
        name = newName;
        sales = newSales;
    }
    public void readInput(){
        System.out.println("Enter name of sales associate: ");
        Scanner key = new Scanner(System.in);
        name = key.nextLine();
        System.out.println("Enter associate's sales: $");
        sales = key.nextDouble();
    }
    public void writeOutput(){
        System.out.println("Name: " + name);
        System.out.println("Sales: $" + sales);
    }
    public String getName(){
        return name;
    }
    public double getSales(){
        return sales;
    }
}
