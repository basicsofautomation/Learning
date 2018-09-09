package Selenium;

import java.util.HashMap;
import java.util.Map;

public class CharCount {

    public static void main(String[] args) {
        String string = "GeekforGaeeks";
        int len = string.length();

        Map<Character, Integer> numChar = new HashMap<Character, Integer>();

        for (int i = 0; i < len; i++) {
            char charAt = string.charAt(i);

            if (!numChar.containsKey(charAt)) {
                numChar.put(charAt, 1);
            } else {
                numChar.put(charAt, numChar.get(charAt) + 1);
            }
        }
        System.out.println("Values" + numChar);
    }

}