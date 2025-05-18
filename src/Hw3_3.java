import java.util.Scanner;

public class Hw3_3{

    public static boolean isStrictlyDecreasing(int[] order){
        for(int i=0;i<order.length-1;i++){
            if(order[i]<=order[i+1])
                return false;
        }
        return true;
    }

    public static Character[] removeDuplicateFlowers(Character[] flowers) {
        Character[] temp=new Character[flowers.length];
        int cnt=0;
        for(int i=0;i<flowers.length;i++){
            boolean found=false;
            for(int j=0;j<cnt;j++){
                if(temp[j]==flowers[i]){
                    found=true;
                    break;
                }
            }
            if(!found){
                temp[cnt]=flowers[i];
                cnt++;
            }
        }
        Character[] result=new Character[cnt];
        for(int i=0;i<cnt;i++){
            result[i]=temp[i];
        }
        return result;
    }

    public static void replaceFlower(char target, char replacement, Character[] flowers){
        int cnt= 0;
        for(int i=0;i<flowers.length;i++){
            if(flowers[i]==target){
                flowers[i]=replacement;
                cnt++;
            }
        }
        System.out.println("Replaced "+cnt+" instances of '"+target+"' with '"+replacement+"'.");
    }

    public static int[] combineOrders(int[] order1, int[] order2){
        int[] combined=new int[order1.length];
        for(int i=0;i<order1.length;i++){
            combined[i]=order1[i]+order2[i];
        }
        return combined;
    }

    public static void bubbleSortFlowers(Character[] flowers){
        int n=flowers.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(flowers[j]>flowers[j+1]){
                    char temp=flowers[j];
                    flowers[j]=flowers[j+1];
                    flowers[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner key=new Scanner(System.in);

        System.out.println("Enter 6 flower order counts (integers):");
        int[] counts=new int[6];
        for(int i=0;i<6;i++){
            counts[i] = key.nextInt();
        }
        if(isStrictlyDecreasing(counts)){
            System.out.println("The order IS strictly decreasing.");
        }
        else{
            System.out.println("The order is NOT strictly decreasing.");
        }

        System.out.println("Enter number of flower types:");
        int n=key.nextInt();
        Character[] flowers=new Character[n];
        System.out.println("Enter flower types (single letters, e.g., r t a):");
        for(int i=0;i<n;i++) {
            flowers[i]=key.next().charAt(0);
        }

        Character[] unique=removeDuplicateFlowers(flowers);
        System.out.print("Unique flowers: ");
        for(int i=0;i<unique.length;i++){
            System.out.print(unique[i] + " ");
        }
        System.out.println();
        System.out.print("Enter flower to replace: ");
        char target=key.next().charAt(0);
        System.out.print("Enter replacement flower: ");
        char replacement=key.next().charAt(0);
        replaceFlower(target,replacement,flowers);

        System.out.print("Updated flower list: ");
        for(int i=0;i<flowers.length;i++){
            System.out.print(flowers[i] + " ");
        }
        System.out.println();

        System.out.println("Enter 6 values for customer A order:");
        int[] orderA=new int[6];
        for(int i=0;i<6;i++){
            orderA[i]=key.nextInt();
        }
        System.out.println("Enter 6 values for customer B order:");
        int[] orderB=new int[6];
        for(int i=0;i<6;i++){
            orderB[i]=key.nextInt();
        }

        int[] combined=combineOrders(orderA, orderB);
        System.out.print("Combined order: ");
        for(int i=0;i<combined.length;i++){
            System.out.print(combined[i]+" ");
        }
        System.out.println();

        bubbleSortFlowers(flowers);
        System.out.print("Sorting flower list alphabetically: ");
        for(int i=0;i<flowers.length;i++){
            System.out.print(flowers[i] + " ");
        }
        System.out.println();

        key.close();
    }
}
