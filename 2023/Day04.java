import java.io.BufferedReader;
import java.io.FileReader;

public class Day04 {
    public static void main(String[] args) throws Exception {
        System.out.print("Part 1: ");
        Part01();
        System.out.print("Part 2: ");
        // Part02();
    }

    public static void Part01() throws Exception {
        BufferedReader bf = new BufferedReader(new FileReader("input04.txt"));
        String line;
        int points = 0;
        int totalPoints = 0;
        while ((line = bf.readLine()) != null) {
            String[] allGames = line.split(":");
            String[] allNumbers = allGames[1].split("\\|");
            String winning = allNumbers[0].trim();
            String playerNumbers = allNumbers[1].trim();
            String[] winningNumbers = winning.split(" ");
            String[] playersNumbers = playerNumbers.split(" ");
            for (int i = 0; i < playersNumbers.length; i++) {

                for (int j = 0; j < winningNumbers.length; j++) {
                    if (playersNumbers[i].isEmpty() || winningNumbers[j].isEmpty()) {
                        continue;
                    }

                    int ownCard = Integer.parseInt(playersNumbers[i]);
                    int winningCard = Integer.parseInt(winningNumbers[j]);

                    if (ownCard == winningCard) {
                        if (points == 0) {
                            points = 1;
                        } else {
                            points += points;
                        }
                    }
                }
            }
            if (points != 0) {

                totalPoints += points;
                points = 0;
            }
            points = 0;
            // 59855
        }
        System.out.println(totalPoints);
    }
}
