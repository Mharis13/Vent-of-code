import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Day6part2 {
    public static void main(String[] args) throws Exception {
        String line;
        int cont = 0 ,  equals = 0;
        boolean isEqual = false;
        ArrayList<String> diferent = new ArrayList<>(); // to save the diferent agrupation
        ArrayList<String> agrupationList = new ArrayList<>();
        
        BufferedReader bf = new BufferedReader(new FileReader("day6Input.txt"));
        
        
        while ((line = bf.readLine()) != null){
                for (int i = 0; i <= line.length(); i++) { // to group four by four
                    if ((i+14)!=line.length()) { 
                         String agrupation = line.substring(i, i+14);
                         agrupationList.add(agrupation);
                        }else break;
                        
                }
                for (String s : agrupationList) {
                   char[] sLetter = s.toCharArray();
    
                   int notequal = 0;
                   for (char t : sLetter) {
                       for (int i = 1; i < sLetter.length; i++) {
                           
                           if (t != sLetter[i] ) {
                               notequal++;
                            }
                            if (notequal ==169) {
                                cont++;
                                diferent.add(s);
    
                                break;
                            }
                        }
                        if (cont ==1) {
                            break;
                        }
                       
                    }
                    
                }
             
                for ( String o : diferent) {
                    
                    char[] bfletter = line.toCharArray();
                    for (char b: bfletter) {
                       for (int i = 0; i < bfletter.length; i++) {
                           
                           if ((i+14) != bfletter.length) {
                                String group = line.substring(i, i+14);
    
                                if (o.equals(group)) {
                                    isEqual = true;
                                    break;
    
                                }
                                equals++;
                                
    
                            }
                       }
                       if (isEqual) break;
                    }
                }
            }
            
            System.out.println(equals+14);
            bf.close();   
        }
}
