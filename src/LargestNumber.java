import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int firstNumber = sc.nextInt();
        System.out.println("Enter the second number:");
        int secondNumber = sc.nextInt();
        System.out.println("Enter the third number:");
        int thirdNumber = sc.nextInt();

        if ((firstNumber > secondNumber) && (firstNumber > thirdNumber))
            System.out.println(firstNumber + ":: First Number is the largest");
        else if ((secondNumber > firstNumber) && (secondNumber > thirdNumber))
            System.out.println(secondNumber + ":: Second Number is the largest");
        else
            System.out.println(thirdNumber + ":: Third Number is the largest");
    }

}

