import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BinaryFileTest {
    public static void main(String[] args) {
        ObjectOutputStream out = null;
        String fileName = "Pet.records";
        try{
            out = new ObjectOutputStream(new FileOutputStream(fileName));
            Pet p1 = new Pet();
            out.writeObject(p1);
            out.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        System.out.println("Record send to file " + fileName);
        ObjectInputStream in = null;
        try{
            in = new ObjectInputStream(new FileInputStream(fileName));
            Pet p2 = (Pet)in.readObject();
            p2.writeOutput();

        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
