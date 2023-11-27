
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.HashMap;
public class CodeDay2part2 {
     
    public static void main(String[] args) throws Exception {
        ReadandSum();
    }

    private static void ReadandSum() throws Exception{
        int scissors = 3, paper = 2, rock = 1;
        BufferedReader scoreBufferedReader = new BufferedReader(new FileReader("day2input.txt"));
        String line;
        HashMap <String , Integer> shapeHashMap = new HashMap<>();
        shapeHashMap.put("A", rock);
        shapeHashMap.put("B", paper);
        shapeHashMap.put("C", scissors);
        shapeHashMap.put("X", rock);
        shapeHashMap.put("Y", paper);
        shapeHashMap.put("Z", scissors);
        int score = 0;

        while((line = scoreBufferedReader.readLine()) != null){
             String match [] = line.trim().split(" ");
             if(match.length != 2)continue;
             if(match[1].equals("X")){
                score+=0;
                if(shapeHashMap.get(match[0])== rock)score+=scissors;
                if(shapeHashMap.get(match[0])== paper)score+=rock;
                if(shapeHashMap.get(match[0])== scissors)score+=paper;
             }
             if(match[1].equals("Y")){
                score+=3;
                score+=shapeHashMap.get(match[0]);
             }
             if(match[1].equals("Z")){
                score+=6;
                if(shapeHashMap.get(match[0])== rock)score+=paper;
                if(shapeHashMap.get(match[0])== paper)score+=scissors;
                if(shapeHashMap.get(match[0])== scissors)score+=rock;
             }
            }
            System.out.println(score);
            scoreBufferedReader.close();

        }
    }
    

