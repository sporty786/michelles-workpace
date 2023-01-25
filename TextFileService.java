
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class TextFileService {
    
    /** 
     * @param filename a string representing the name (relative file path) of a txt file
     * @return the contents of the file represented by filename
     * @throws FileNotFound exception
     */
    // public String readStringFromFile(String filename) throws FileNotFoundException{
    //     File textfile = new File(filename);
    //     Scanner textScanner = new Scanner(textfile);
    //     String text = textScanner.nextLine();
    //     textScanner.close();
    //     return text;
    // }
    // public String readStringFromFile(String filename){
    //     File textfile = new File(filename);
    //     String text = "";
    //     try{
    //         Scanner textScanner = new Scanner(textfile);
    //         text = textScanner.nextLine();
    //         textScanner.close();
    //     }
    //     catch(Exception e){
    //         System.out.println("Sorry, we couldn't find that file!");
    //     }
    //     return text;
    // }
    public String readStringFromFile(String filename) throws FileNotFoundException{
        File textfile = new File(filename);
        Scanner textScanner = new Scanner(textfile);
        String text = textScanner.nextLine();
        textScanner.close();
        return text;
    }

}
