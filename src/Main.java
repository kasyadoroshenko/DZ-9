import java.util.*;

import static java.lang.Integer.sum;

public class Main {
    public static void main(String[] args) {
        String[] theArrayOfWords = new String[]{"мама", "папа", "баба", "їж", "їжак", "желе"};
        getTheResult(theArrayOfWords);
    }

    public static void getTheResult(String[] wordsToCheck) {

        List<String> myList = new ArrayList<>();

        for (String word : wordsToCheck) {
            char[] charsArray = word.toCharArray();

            Map<Character, Integer> myMap = new HashMap<>();

            for (Character character : charsArray) {
                if (myMap.containsKey(character)) {
                    Integer value = myMap.get(character) + 1;
                    myMap.put(character, value);
                } else {
                    myMap.put(character, 1);
                }
            }
            boolean isAllLettersEvenInWord = myMap.values().stream().allMatch(value -> value % 2 == 0);
            if (isAllLettersEvenInWord) {
                if (myList.size() < 2) {
                    myList.add(word);
                }
            }
        }

        Set<Character> mySet = new HashSet<>();
        for (String words : myList) {
            for (Character character : words.toCharArray()) {
                mySet.add(character);
            }
        }
        System.out.println(mySet);
    }
}
