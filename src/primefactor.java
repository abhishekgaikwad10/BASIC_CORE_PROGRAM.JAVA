import java.util.Scanner;

public class primefactor {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ::");
        int numberToFactorize= sc.nextInt();

        System.out.println("Prime factors of " + numberToFactorize + " are ::");

        for (int i = 2; i < numberToFactorize; i++) {

            while (numberToFactorize % i == 0) {
                System.out.println(i + " ");
                numberToFactorize = numberToFactorize / i;

            }
        }
        if (numberToFactorize > 2) {
            System.out.println(numberToFactorize);
        }
    }

}

