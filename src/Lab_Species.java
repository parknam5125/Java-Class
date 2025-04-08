
public class Lab_Species {
    public static void main(String[] args) {
        SpeciesFirstTry spe=new SpeciesFirstTry();

        System.out.println("Enter data on the Species of the month");
        spe.readInput();
        spe.writeOutput();
        int futurepop=spe.predictpop(10);
        System.out.println("In the years the population will be "+futurepop);

        spe.name="Klingon ox";
        spe.population=10;
        spe.growthRate=15;
        System.out.println("The new Species of the month");
        spe.writeOutput();
        System.out.println("In the years the population will be "+spe.predictpop(10));
        
        SpeciesFirstTry sp3=new SpeciesFirstTry();

        sp3.setSpecies("park",10,25);
        System.out.println("name: "+sp3.getName());
        System.out.println("Population: "+sp3.getPopulation());
        System.out.println("GrowtgRate: "+sp3.getGrowthRate());
        int futurepop=spe.predictpop(10);
        System.out.println("In the years the population will be "+futurepop);
    }
}
