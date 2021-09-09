import java.util.Scanner;

public class flipcoin {
    public static void main(String[] args) {


        //taking input totalFlip for the number of times coin flip
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times coin flip");
        int totalFlip = sc.nextInt();


        //variables
        int count = 0;
        int head = 0;
        int tail = 0;

        //computation
        while (count != totalFlip) {
            double flip = Math.random();
            System.out.println(flip);

            if (flip < 0.5) {
                System.out.println("Print Head");
                head++;

            } else {
                System.out.println("Print Tail");
                tail++;
            }
            count++;
        }

        System.out.println("number of heads wins: " + head);
        System.out.println("number of tails wins:" + tail);

        int perHaid = (head * 100 / totalFlip);
        int perTail = (tail * 100 / totalFlip);
        System.out.println("the percentage of head win:" + perHaid);
        System.out.println("the percentage of tail win:" + perTail);


    }

}
