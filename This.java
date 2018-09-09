package Selenium;

public class This extends Super{

String i1;
int i2;
    public This(String i1, int i2) {
       super.i1=i1;
        super.i2=i2;
    }

    public void Test()
    {
        System.out.println("++++"+i1+"="+i2);
    }

    public static void main(String[] args) {
        This obj1 = new This("Ashish",101);
    obj1.Test();
    Super obj2 = new This("Neha",109);
    obj2.TestSuper();

    }

}
