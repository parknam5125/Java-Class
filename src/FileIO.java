import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileIO {
    public static void main(String[] args) throws FileNotFoundException{
        String fileName = "out.txt";
        PrintWriter outputStream = new PrintWriter(fileName);
        Scanner kb = new Scanner(System.in);
        String line = kb.nextLine();
        outputStream.write(line);
        outputStream.close();
        System.out.println("Current working directory: " + System.getProperty("user.dir"));
    }
}
