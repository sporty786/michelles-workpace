
import java.util.Scanner;
import java.io.FileNotFoundException;

public class TFSApplication {
    
    public static void main(String[] args){
        TextFileService tfs = new TextFileService();
        Scanner fileNameScanner = new Scanner(System.in);
        System.out.println("Input the name of the file you would like to read the contents of:");
        String filename = fileNameScanner.nextLine();
        try{
            String contents = tfs.readStringFromFile(filename);
            System.out.println(contents);
        }
        catch(FileNotFoundException e){
            System.out.println("Sorry, we couldn't find that file!");
        }
        System.out.println("Thanks for using the file reading app! Bye.");
        fileNameScanner.close();
    }
}
