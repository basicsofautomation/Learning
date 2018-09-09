package Selenium;


import java.util.HashMap;
import java.util.Map;

public class All {
    public static void main(String[] args) {

String str = "Ashish Sati";
int len = str.length();

        Map<Character,Integer> numbChar = new HashMap<Character,Integer>();


for(int i=0;i<len;i++)
{

    char charAt = str.charAt(i);
    if(!numbChar.containsKey(charAt))
    {
        numbChar.put(charAt,1);
    }
    else
    {
        numbChar.put(charAt,numbChar.get(charAt)+1);
    }

}  System.out.println("+++++"+numbChar);


    }
}
