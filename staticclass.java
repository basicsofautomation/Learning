package Core;

public class staticclass {

    static int count = 0;

staticclass()
{
    count++;
    System.out.println("Count is"+count);
}

    public static void main(String[] args) {
        staticclass classobj = new staticclass();
        staticclass classobj1 = new staticclass();
        staticclass classobj2 = new staticclass();
    }


}
