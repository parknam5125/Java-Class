import java.util.Scanner;

public class HW2_2 {
    public static void main(String[] args){
        Scanner key=new Scanner(System.in);
        String p1,p2;

        System.out.println("Player 1, choose Paper, Rock, or Scissors (p,r,s).");
        p1=key.nextLine();
        System.out.println("Player 2, choose Paper, Rock, or Scissors (p,r,s).");
        p2=key.nextLine();

        if(p1.equalsIgnoreCase("p")){
            p1="P";
        }
        else if(p1.equalsIgnoreCase("r")){
            p1="R";
        }
        else if(p1.equalsIgnoreCase("s")){
            p1="S";
        }
        if(p2.equalsIgnoreCase("p")){
            p2="P";
        }
        else if(p2.equalsIgnoreCase("r")){
            p2="R";
        }
        else if(p2.equalsIgnoreCase("s")){
            p2="S";
        }
        if(p1.equals(p2)){
            System.out.println("nobody wins");
        }
        else if(p1.equals("P")){
            if(p2.equals("R")){
                System.out.println("Player 1 wins!");
            }
            else if(p2.equals("S")){
                System.out.println("Player 2 wins!");
            }
        }
        else if(p1.equals("R")){
            if(p2.equals("S")){
                System.out.println("Player 1 wins!");
            }
            else if(p2.equals("P")){
                System.out.println("Player 2 wins!");
            }
        }
        else if(p1.equals("S")){
            if (p2.equals("P")){
                System.out.println("Player 1 wins!");
            }
            else if (p2.equals("R")){
                System.out.println("Player 2 wins!");
            }
        }
        key.close();
    }
}
