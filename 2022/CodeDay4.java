import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
public class CodeDay4 {
    public static void main(String[] args)throws Exception{
        BufferedReader inputreader = new BufferedReader(new FileReader("day4input.txt"));
        ArrayList<Integer> numList  = new ArrayList<>();
        ArrayList<Integer> numList2 = new ArrayList<>();
        
        String line;
        int counter = 0;

        while ((line = inputreader.readLine()) != null){
           String[]  sequence = line.split(",");

            String first_sequence = sequence[0];
            String second_sequence = sequence[1];

            String[]limit = first_sequence.split("-");
            
            int first_sequence2 = Integer.valueOf(limit[0]);
            int second_sequence2 = Integer.valueOf(limit[1]);

            String[] limit2 = second_sequence.split("-");

            int first_sequence3  = Integer.valueOf(limit2[0]);
            int second_sequence3 = Integer.valueOf(limit2[1]);
            
            for(int i = first_sequence2 ; i <= second_sequence2;i++){
                numList.add(i);
            }
            for(int i = first_sequence3;i <= second_sequence3;i++){
                numList2.add(i);
            }
                
            if(numList.containsAll(numList2) || numList2.containsAll(numList)){
                counter++;
            }
            numList.clear();
            numList2.clear();

        }System.out.println(numList);
        System.out.println(numList2);
        System.out.println(counter);
        inputreader.close();
    }
}
