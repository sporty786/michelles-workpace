import java.util.Scanner;

public class PrimitiveTypes {
    public static void main(String[] args){

        // char marks,grade;
        // marks = '8';
        // grade = 'B';
        // System.out.println("Marks: "+marks);
        // System.out.println("Grade: "+grade);

        // byte myByte1,myByte2;
        // myByte1 = 127;
        // myByte2 = -48;
        // System.out.println("Byte 1: " +myByte1);
        // System.out.println("Byte 2: " +myByte2);
        // myByte1++; // Looping back within the range
        // System.out.println("Incremented Value of myByte1: " +myByte1);

        // short myShort = 6000;
        // System.out.println("myShort: " + myShort);

        // int myNum1, myNum2, result;
        // myNum1 = -7000;
        // myNum2 = 90000;
        // result = myNum1 + myNum2;
        // System.out.println("Number 1: " + myNum1);
        // System.out.println("Number 2: " + myNum2);
        // System.out.println("Number 1 + Number 2: " + result);

        // long myLong1, myLong2, result;
        // myLong1 = 100000000L;
        // myLong2 = 200L;
        // result = myLong1 * myLong2;
        // System.out.println("Number 1: " + myLong1);
        // System.out.println("Number 2: " + myLong2);
        // System.out.println("Number 1 * Number 2: " + result);

        // float myFloat1, myFloat2, result;
        // myFloat1 = 100.666f;
        // myFloat2 = 110.77f;
        // result = myFloat1 - myFloat2;
        // System.out.println("Number 1: " + myFloat1);
        // System.out.println("Number 2: " + myFloat2);
        // System.out.println("Number 1 - Number 2: " + result);

        // double myDouble1, myDouble2, result;
        // myDouble1 = 48976.8987;
        // myDouble2 = 29513.7812d;
        // result = myDouble1 + myDouble2;
        // System.out.println("Number 1: " + myDouble1);
        // System.out.println("Number 2: " + myDouble2);
        // System.out.println("Number 1 + Number 2: " + result);

        // byte myByte1, myByte2;
        // myByte1 = 127;
        // myByte2 = -48;
        // System.out.println("Byte 1: " + myByte1);
        // System.out.println("Byte 2: " + myByte2);
        // myByte1++; // Looping back within the range
        // System.out.println("Incremented Value of myByte1: " + myByte1);

        System.out.print("How many eggs do you have?: ");
        Scanner input = new Scanner(System.in);
        int eggs = input.nextInt();
        System.out.println("You have " + eggs/12 + " dozen eggs with " + eggs%12 + " eggs leftover.");
        input.close();
        System.out.println();
        int gross = eggs/144;
        int dozen = (eggs%144)/12;
        int leftover = (eggs%144)%12;
        System.out.println("Your number of eggs is " + gross + " gross, " + dozen + " dozen, and " + leftover);
        System.out.println("since " + eggs + " is equal to " + gross + "*144 + " + dozen + "*12 + " + leftover);
    }
}
