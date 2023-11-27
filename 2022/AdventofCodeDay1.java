import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

    public class AdventofCodeDay1{
    public static void main(String[] args)throws FileNotFoundException {
        ReadFile();
    }

    private static void ReadFile()throws FileNotFoundException {
         File inputFile =  new File("Input2.txt");
         int total = 0, maxCalorie = 0;

         String line = "";
         
         try{
        Scanner readScanner = new Scanner(inputFile);

        while((readScanner).hasNextLine()){
            line = readScanner.nextLine();
                
            
            if (line.isBlank()) {
                total = 0;
            }

            if (!line.isBlank()) total += Integer.valueOf(line);

            if(total > maxCalorie) {
            maxCalorie = total;
            }
            
        }

        readScanner.close();

        System.out.println(maxCalorie);

        }
        catch(FileNotFoundException exception){
        System.out.println("Something is wrong.");
    }
    }

}

