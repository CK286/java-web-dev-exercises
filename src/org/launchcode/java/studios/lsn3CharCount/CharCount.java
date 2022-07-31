package org.launchcode.java.studios.lsn3CharCount;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class CharCount {
    public static void CharacterCt(String input){
        //method takes string argument







        //turn string into array
        //make it case-insensitive.
        char[] characters = input.toLowerCase().toCharArray();

        //create a collection to hold the characters and their score
        HashMap<Character, Integer> scores = new HashMap<>();

        //loop through the array of string using for each loop
        for(char letter : characters) {
            //checks if character is a letter
            if (Character.isLetter(letter)) {
                //as  it encounters a character it checks if it already is in the array of hashmaps
                if (!scores.containsKey(letter)) {
                    //if it is not it creates an entry in the hashmap with a score of 1
                    scores.put(letter, 1);
                } else {
                    //if it is it adds 1 to the count
                    scores.put(letter, (scores.get(letter) + 1));
                }
            }
        }
//loop through hashmap and printout in the specified format
        for (Map.Entry<Character, Integer> score : scores.entrySet()){
            System.out.println(String.format("%s: %s", score.getKey(), score.getValue()));
        }
    }
}
