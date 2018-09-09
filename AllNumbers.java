package Selenium;

public class AllNumbers {

    public static void main(String[] args) {
        AllNumbers obj = new AllNumbers();
        Boolean test =obj.testNumbers("9650585225");
        System.out.println("++++++"+test);
    }

    public boolean testNumbers(String test)
    {
        try {
                 double i = Double.parseDouble(test);

        }
        catch (NumberFormatException e)
        {
            e.printStackTrace();
            return  false;
        }
        return true;
    }
}
