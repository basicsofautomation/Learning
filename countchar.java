package Core;

public class countchar {

    public static void main(String[] args) {

        String test = "geekforgeeks";
        char test1 = 'e';
        int count=0;
        for(int i=0;i<test.length();i++)
        {
            if(test.charAt(i)==test1)
            {
                count++;
            }

        }
        System.out.println(test1+" count is "+count);
    }
}
