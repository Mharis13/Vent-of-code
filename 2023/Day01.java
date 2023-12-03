import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Day01
 */

public class Day01 {

    public static void main(String[] args) throws Exception {
        // Part01();
        Part02();
    }

    static void Part01() throws Exception {
        BufferedReader bf = new BufferedReader(new FileReader("input01.txt"));
        String line;
        ArrayList<Integer> numbers = new ArrayList<>();
        String number = "";

        while ((line = bf.readLine()) != null) {
            String[] letter = line.split(" ");

            for (String s : letter) {

                String[] array = s.split("");
                for (String t : array) {

                    if (t.matches("\\d+")) {
                        number = number.concat(t);
                    }

                }
                if (number.length() >= 3) {
                    String[] letternum = number.split("");

                    number = letternum[0] + letternum[letternum.length - 1];
                }
                if (number.length() == 1) {
                    number = number.concat(number);
                }

                numbers.add(Integer.valueOf(number));
                number = "";
            }

        }
        int total = 0;
        for (int i : numbers) {
            total += i;
        }
        System.out.println(total);
        bf.close();

    }

    static void Part02() throws Exception {
        BufferedReader bf = new BufferedReader(new FileReader("input01.txt"));
        String line;
        ArrayList<Integer> numbers = new ArrayList<>();
        String digit = "";
        String number = "";
        HashMap<String, String> linenumber = new HashMap<>();
        linenumber.put("one", "1");
        linenumber.put("two", "2");
        linenumber.put("three", "3");
        linenumber.put("four", "4");
        linenumber.put("five", "5");
        linenumber.put("six", "6");
        linenumber.put("seven", "7");
        linenumber.put("eight", "8");
        linenumber.put("nine", "9");

        while ((line = bf.readLine()) != null) {
            String[] letter = line.split(" ");

            for (String s : letter) {

                String[] array = s.split("");
                for (String t : array) {
                    if (t.matches("\\D+")) {
                        digit += t;
                        if (digit.contains("one")) {
                            number += linenumber.get("one");
                            digit = "";
                            continue;
                        }
                        if (digit.contains("two")) {
                            number += linenumber.get("two");
                            digit = "";
                            continue;
                        }
                        if (digit.contains("three")) {
                            number += linenumber.get("three");
                            digit = "";
                            continue;
                        }
                        if (digit.contains("four")) {
                            number += linenumber.get("four");
                            digit = "";
                            continue;
                        }
                        if (digit.contains("five")) {
                            number += linenumber.get("five");
                            digit = "";
                            continue;
                        }
                        if (digit.contains("seven")) {
                            number += linenumber.get("seven");
                            digit = "";
                            continue;
                        }
                        if (digit.contains("six")) {
                            number += linenumber.get("six");
                            digit = "";
                            continue;
                        }

                        if (digit.contains("eight")) {
                            number += linenumber.get("eight");
                            digit = "";
                            continue;
                        }
                        if (digit.contains("nine")) {
                            number += linenumber.get("nine");
                            digit = "";
                            continue;
                        }

                    }

                    if (t.matches("\\d+")) {
                        number = number.concat(t);
                    }

                }
                if (number.length() >= 3) {
                    String[] letternum = number.split("");

                    number = letternum[0] + letternum[letternum.length - 1];
                }
                if (number.length() == 1) {
                    number = number.concat(number);
                }

                numbers.add(Integer.valueOf(number));
                number = "";
            }

        }
        int total = 0;
        for (int i : numbers) {
            total += i;
        }
        System.out.println(total);
        bf.close();

    }
}