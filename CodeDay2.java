import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashMap;

public class CodeDay2{

    private static int GetChoicePoints(String playerChoice) {
        if (playerChoice.equals("X")) return 1;

        if (playerChoice.equals("Y")) return 2;

        if (playerChoice.equals("Z")) return 3;

        return 0;
    }
    private static void ReadRoundandSumScore()throws FileNotFoundException{
        final int scissors = 3, paper = 2, rock = 1;
        Scanner readfileScanner = new Scanner(new File("day2input.txt"));
        int finalscore = 0;
        HashMap <String,Integer> choicesHashMap = new HashMap <>();

        choicesHashMap.put("A",rock); 
        choicesHashMap.put("B",paper);
        choicesHashMap.put("C",scissors);
        choicesHashMap.put("X", rock);
        choicesHashMap.put("Y", paper);
        choicesHashMap.put("Z", scissors);

        while(readfileScanner.hasNext()){
            String  line = readfileScanner.nextLine();
            String choices[] = line.split(" ");

            String playerChoice = choices[1];

            int playerPoints = GetChoicePoints(playerChoice);
            if (choicesHashMap.get(choices[0]) == choicesHashMap.get(choices[1])) finalscore += 3;

            else if (choicesHashMap.get(choices[0])== 1 &&  choicesHashMap.get(choices[1])==2) finalscore += 6;
             else if (choicesHashMap.get(choices[0])== 2 &&  choicesHashMap.get(choices[1])==3) finalscore += 6;
              else if (choicesHashMap.get(choices[0])== 3 &&  choicesHashMap.get(choices[1])==1) finalscore += 6;
            else finalscore+=0;

            finalscore += playerPoints;
        }
        System.out.println(finalscore);
        }
        public static void main(String[] args)throws FileNotFoundException {
            ReadRoundandSumScore();
        }
    }
