import java.util.Scanner;
public class SpeciesFirstTry {
    private String name;
    private int population;
    private double growthRate;

    public void setSpecies(String newName, int newPopulation, double newGrowthRate){
        name=newName;
        if(newPopulation>=0){
            population=newPopulation;
        }
        else{
            System.out.println("ERROR: using a negative population.");
            System.exit(0);
        }
        growthRate=newGrowthRate;
    }

    public String getName(){
        return name;
    }

    public int getPopulation(){
        return population;
    }

    public double getGrowthRate(){
        return growthRate;
    }

    void readInput(){
        Scanner key=new Scanner(System.in);
        System.out.println("What is the specied' name?");
        name=key.nextLine();
        System.out.println("What is the population of the species?");
        population=key.nextInt();
        System.out.println("Enter growth rate (% increase per year):");
        growthRate=key.nextDouble();
    }
    void writeOutput(){
        System.out.println("Name= "+name);
        System.out.println("Population= "+population);
        System.out.println("Growth rate= "+growthRate+"%");
    }
    int get10(){
        int result=0;
        double pop=population;
        int cnt=10;
        while((cnt>0)&&(pop>0)){
            pop=pop+(growthRate/100)*pop;
            cnt--;
        }
        if(pop>0){
            result=(int)pop;
        }
        return result;
    }
    int predictpop(int year){
        int result=0;
        double pop=population;
        int cnt=year;
        while((cnt>0)&&(pop>0)){
            pop=pop+(growthRate/100)*pop;
            cnt--;
        }
        if(pop>0){
            result=(int)pop;
        }
        return result;
    }
}
