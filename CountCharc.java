package Core;

import java.util.HashMap;
import java.util.Map;

public class CountCharc {

    public static void main(String[] args) {
        String str = "Hello World";
        int len = str.length();
        Map<Character, Integer> numChars = new HashMap<Character, Integer>();

        for (int i = 0; i < len; ++i)
        {
            char charAt = str.charAt(i);

            if (!numChars.containsKey(charAt))
            {
                numChars.put(charAt, 1);
            }
            else
            {
                numChars.put(charAt, numChars.get(charAt) + 1);
            }
        }

        System.out.println(numChars);
    }
}
