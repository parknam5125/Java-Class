import java.util.Scanner;
public class Park {
    enum Grade {good,bad,normal}
    enum Gender {F,M}
    public static void main(String[] args) {
        int score;
        char grade;
        String name,gen1;
        Grade gr;
        Gender gen2;
        Scanner key=new Scanner(System.in);
        System.out.println("type gender");
        gen1=key.nextLine();
        if(gen1.equalsIgnoreCase("F")){
            gen2= Gender.F;
        }
        else{
            gen2=Gender.M;
        }
        System.out.println("type name");
        name=key.nextLine();
        System.out.println("type score");
        score=key.nextInt();

        switch(score/10){
            case 10:
            case 9:
            grade='A';
            gr=Grade.good;
            break;
            case 8:
            grade='B';
            gr=Grade.good;
            break;
            case 7:
            grade='C';
            gr=Grade.normal;
            break;
            case 6:
            grade='D';
            gr=Grade.normal;
            break;
            default:
            grade='F';
            gr=Grade.bad;
            
        }
        
        System.out.println("Grade=" + grade);
        System.out.println("Value=" + gr);
        System.out.println("Gender=" + gen2);
        System.out.println("name=" + name);
        key.close();

    }
}