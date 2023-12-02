import java.io.BufferedReader;
import java.io.FileReader;

public class Day02 {
    public static void main(String[] args) throws Exception {
        System.out.print("Part 1: ");
        Part01();
        System.out.print("Part 2: ");
        Part02();
    }

    public static void Part01() throws Exception {
        BufferedReader bf = new BufferedReader(new FileReader("input02.txt"));
        String line;
        int totalId = 0, id = 0;
        int notFollowRules = 0;

        while ((line = bf.readLine()) != null) {
            notFollowRules = 0;
            id++;

            String[] linePart = line.split(";");

            for (String part : linePart) {
                String[] pa = part.split(",");
                for (String p : pa) {
                    if (p.contains("red")) {
                        String[] letters = p.split(" ");

                        for (String letter : letters) {

                            if (letter.equals("Game") || letter.equals(id + ":") || letter.equals("")) {
                                continue;
                            }

                            if (Integer.valueOf(letter) <= 12) {
                                break;
                            } else {
                                notFollowRules++;
                                break;
                            }
                        }
                    }

                    if (p.contains("green")) {
                        String[] letters = p.split(" ");

                        for (String letter : letters) {

                            if (letter.equals("Game") || letter.equals(id + ":") || letter.equals("")) {
                                continue;
                            }

                            if (Integer.valueOf(letter) <= 13) {
                                break;
                            } else {
                                notFollowRules++;
                                break;
                            }
                        }
                    }

                    if (p.contains("blue")) {
                        String[] letters = p.split(" ");

                        for (String letter : letters) {

                            if (letter.equals("Game") || letter.equals(id + ":") || letter.equals("")) {
                                continue;
                            }

                            if (Integer.valueOf(letter) <= 14) {
                                break;
                            } else {
                                notFollowRules++;
                                break;
                            }
                        }
                    }
                }

            }
            if (notFollowRules != 0) {

                continue;
            } else
                totalId += id;

        }

        System.out.println(totalId);
        bf.close();

    }

    public static void Part02() throws Exception {
        BufferedReader bf = new BufferedReader(new FileReader("input02.txt"));
        String line;
        int totalId = 0, id = 0;
        int notFollowRules = 0;
        int maxred = 1, maxblue = 1, maxgreen = 1;
        int totalpower = 0;

        while ((line = bf.readLine()) != null) {
            notFollowRules = 0;
            totalpower = 0;
            id++;
            maxred = 0;
            maxblue = 0;
            maxgreen = 0;
            String[] linePart = line.split(";");

            for (String part : linePart) {
                String[] pa = part.split(",");
                for (String p : pa) {
                    if (p.contains("red")) {
                        String[] letters = p.split(" ");

                        for (String letter : letters) {

                            if (letter.equals("Game") || letter.equals(id + ":") || letter.equals("")) {
                                continue;
                            }

                            else {
                                maxred = Math.max(maxred, Integer.valueOf(letter));
                                notFollowRules++;
                                break;
                            }
                        }
                    }

                    if (p.contains("green")) {
                        String[] letters = p.split(" ");

                        for (String letter : letters) {

                            if (letter.equals("Game") || letter.equals(id + ":") || letter.equals("")) {
                                continue;
                            } else {
                                maxgreen = Math.max(maxgreen, Integer.valueOf(letter));
                                notFollowRules++;
                                break;
                            }
                        }
                    }

                    if (p.contains("blue")) {
                        String[] letters = p.split(" ");

                        for (String letter : letters) {

                            if (letter.equals("Game") || letter.equals(id + ":") || letter.equals("")) {
                                continue;
                            } else {
                                maxblue = Math.max(maxblue, Integer.valueOf(letter));
                                notFollowRules++;
                                break;
                            }
                        }
                    }
                }

            }
            totalpower = maxred * maxgreen * maxblue;
            totalId += totalpower;

        }

        System.out.println(totalId);
        bf.close();

    }
}
