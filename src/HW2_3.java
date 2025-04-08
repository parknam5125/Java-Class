import java.util.Scanner;
public class HW2_3{
    public static void main(String[] args){
        Scanner key=new Scanner(System.in);
        System.out.println("Type text line(include uppercase and digit)");
        String input=key.nextLine();

        int vowels=0,consonants=0;
        int upperCase=0,lowerCase=0;
        int alphabets=0,digits=0;

        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);

            if(ch==' '){
                continue;
            }
            if(Character.isLetter(ch)){
                alphabets++;
                if(Character.isUpperCase(ch)){
                    upperCase++;
                }
                else if(Character.isLowerCase(ch)){
                    lowerCase++;
                }

                char lowerCh=Character.toLowerCase(ch);
                if(lowerCh=='a'||lowerCh=='e'||lowerCh=='i'||lowerCh=='o'||lowerCh=='u'){
                    vowels++;
                }
                else{
                    consonants++;
                }

            }
            else if (Character.isDigit(ch)){
                digits++;
            }
        }

        System.out.println("vowels: " + vowels);
        System.out.println("consnants: " + consonants);
        System.out.println("uppercase: " + upperCase);
        System.out.println("lowercase: " + lowerCase);
        System.out.println("alphabets: " + alphabets);
        System.out.println("digits: " + digits);

        key.close();
    }
}
