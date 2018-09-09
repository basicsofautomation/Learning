package Selenium;

public class Palindrome {

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        p.palindrome("111");
    }

    public void palindrome(String test) {
        int i = Integer.parseInt(test);
        int reversed = 0;
        int backup = i;

        while (i != 0) {
            int digit = i % 10;
            reversed = reversed * 10 + digit;
            i /= 10;
        }
        if ((reversed == backup)) {
            System.out.println("Number is Palindrome");
        } else {
            System.out.println("Not");
        }
    }
}
