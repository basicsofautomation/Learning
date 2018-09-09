package Selenium;

public class ReverseString {

    public static void main(String[] args) {
ReverseString obj = new ReverseString();
obj.reverseString("Java is Awsome Java is Awsome");

obj.usingReverse("Java is Awsome Java is Awsome");
obj.reverseWord("Java is Awsome Java on Awsome");
    }

    public void reverseString(String reverse)
    {
        char[] reverseSt = reverse.toCharArray();
        int len = reverseSt.length;

        for(int i=len-1;i>=0;i--)
        {
            System.out.print(reverseSt[i]);
        }
    }

    public void usingReverse(String reverse)
    {
        StringBuffer bf = new StringBuffer(reverse);
        System.out.println("+++++++"+bf.reverse());
    }

    public void reverseWord(String word)
    {
            String[] words = word.split("");
            String reversed = "";
        
            for(String w : words)
            {
                StringBuffer bf = new StringBuffer(w);
                bf.reverse();
                reversed+=bf.toString();
            }
        System.out.println("++++++----"+reversed);

    }
}
