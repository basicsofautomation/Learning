package Core;

public class reverse extends AbstractClass {

    public static void main(String[] args) {


        reverse obj = new reverse();
        obj.abstractMethod();
//        int numbertobereversed = 1214;
//
//        int count = 0;
//        int reversed=0;
//        while (numbertobereversed != 0) {
//
//             count=numbertobereversed%10;
//            reversed = reversed*10+count;
//            numbertobereversed=numbertobereversed/10;
//        }
//
//        System.out.println("--------"+reversed);
    }

    @Override
    void abstractMethod() {
        //  super.abstractMethod();
        //foreach

        String[] days = {"Monday", "Tuesday", "Wednesday"};

        for (String day : days) {
            System.out.println("This is " + day);

        }
    }

}
