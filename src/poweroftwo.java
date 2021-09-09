import java.util.Scanner;

public class poweroftwo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N:");
        int powerOfTwo = sc.nextInt();

        if (powerOfTwo <= 0 || powerOfTwo < 31) {
            System.out.println("Power of 2's: ");

            for (int i = 0; i <= powerOfTwo; i++) {
                int powerOfValue = ((int) Math.pow(2, i));      //2^i
                System.out.println("The value of 2^" + i + " is: " + powerOfValue);
            }
        } else
            System.out.println("Value overflows int value");


    }

}