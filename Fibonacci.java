package Selenium;

public class Fibonacci {

    public static void main(String[] args) {
        int i1=0; int i2 =1;
        //System.out.println(i1+" "+i2);

        for(int i=0;i<10;++i)
        {
            System.out.print(i1+" ");
            int temp = i1+i2;
            i1=i2;
            i2=temp;
        }

    }
}
