import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Main {
    public static void main(String [] args){
        //writing to a text file and using try and catch for exception handling


        try(FileWriter fileWriter = new FileWriter("test.txt")){

            fileWriter.write("Learning java");
            System.out.println("File has been written");
        }
        catch (IOException e){
            System.out.println("Could not write to file");
        }
    }
}
