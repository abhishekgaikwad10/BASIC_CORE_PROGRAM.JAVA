import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int firstNumber = sc.nextInt();
        System.out.println("Enter the second number:");
        int secondNumber= sc.nextInt();
        System.out.println("Numbers before swap are:"+firstNumber+ " and " +secondNumber);

        int tempNumber;
        tempNumber=firstNumber;
        firstNumber=secondNumber;
        secondNumber=tempNumber;

        System.out.println("Numbers after swap are:"+firstNumber+ " and " +secondNumber);


    }
}

