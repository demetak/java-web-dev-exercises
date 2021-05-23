package org.launchcode.java.studios.countchars;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class CountChars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String myString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        System.out.print("Enter the string that you want to analyse (Default will be used for blank String)");
        String str = input.nextLine();
        if (str.length()>0){
            myString = str;
        }

        char[] charactersInString = myString.toLowerCase().toCharArray();
        Arrays.sort(charactersInString);
        HashMap<Character, Integer> countMap = new HashMap<>();
        for (char i:charactersInString) {
            if (Character.isLetter(i)) {
                if (countMap.containsKey(i)) {
                    countMap.put(i, countMap.get(i) + 1);
                } else {
                    countMap.put(i, 1);
                }
            }
        }
        countMap.forEach((k,v)-> System.out.println(k+": "+v));
    }
}
