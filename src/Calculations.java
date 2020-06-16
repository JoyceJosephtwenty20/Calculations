import java.util.Scanner;

public class Calculations {
    public static void main(String[] argu) {
        Scanner sc = new Scanner(System.in);
        // Input/Output - Task 1
        System.out.println("Enter a number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter another number: ");
        int num2 = sc.nextInt();
        int sumNum= num1 + num2;
        int productNum = num1 * num2;

        System.out.println("Sum : " + sumNum );
        System.out.println("Product : " + productNum);

        /// Square of a number - Task 2

        System.out.println("Enter a number to find the square root: ");
        int squareNum = sc.nextInt();
        int square = squareNum * squareNum;
        System.out.println("Square is : " + square);
        sc.nextLine();

        // Add 2 Strings

        System.out.println("Please input something: ");
        String inPut1 = sc.nextLine();
        System.out.println("Print input something again: ");
        String inPut2 = sc.nextLine();
        System.out.print(inPut1 + " " + inPut2);


    }
}