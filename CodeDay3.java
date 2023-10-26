import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class CodeDay3{
    public static void main(String[] args)throws Exception{
        BufferedReader inputReader = new BufferedReader(new FileReader("inputday3.txt"));
        String line;
        int score = 0;

        while ((line=inputReader.readLine()) != null ){
            int linehalf = line.length()/2;
            String linehalf2 = line.substring(linehalf);
            
            for(int i = 0; i < linehalf; i++){
                char letter = line.charAt(i);

                if(linehalf2.contains(String.valueOf(letter))){
                    System.out.println(letter);
                    if(letter <= 'Z') score += (letter - 'A') + 27;
                    else score += (letter - 'a') +1;
                    break;
                }
            }
            
        }
        System.out.println(score);
            inputReader.close();

        }
        
    }
