package Core;

public class PropertyReader {


    public static void main(String[] args) {

        PropertyReader reader = new PropertyReader();
        reader.countVowels("abeiou");
    }

    private static int countVowels(String vowels)
    {

       try{
    int counter =0;
           int count = vowels.length();

           for(int i=0;i<count;i++)
           {
               if(vowels.charAt(i)=='a' || vowels.charAt(i)=='e' || vowels.charAt(i)=='i' || vowels.charAt(i)=='o' || vowels.charAt(i)=='u')
               {
                   counter++;
               }
               System.out.println("-------------"+counter);
           }

       }
       catch(Exception e)
       {
           e.printStackTrace();
       }
        return vowels.length();
    }

}
