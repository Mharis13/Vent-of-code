import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;

public class AdventoofCodeDay1part2 {
    // Mhetod
    private static void ReadInput(){
        File input = new File("Input.txt");
        String line = "";
        int total = 0,  j = 0;
        ArrayList <Integer> elfList=  new ArrayList<Integer>();
        
        try{
            Scanner readScanner = new Scanner(input);
           
                while((readScanner).hasNextLine()){
                line = readScanner.nextLine();

                    if(!line.isBlank()){
                       total+= Integer.valueOf(line);
                    }

                    if(line.isBlank() || !readScanner.hasNext()){
                        j = Math.max(j,total);
                        elfList.add(total);
                        total = 0;
                    }
                 }
                readScanner.close();
                Collections.sort(elfList);
                j = elfList.get(elfList.size()-1) + elfList.get(elfList.size()-2) + elfList.get(elfList.size()-3);
                System.out.println(elfList.get(elfList.size()-1));

               
            }catch(FileNotFoundException exception){
            System.out.println("ERROR");
        }
    }//End Method
    public static void main(String[] args) {
        ReadInput();
    }
}
