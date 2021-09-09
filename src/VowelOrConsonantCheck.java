import java.util.Scanner;

public class VowelOrConsonantCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character to be check:");
        char chToCheck=sc.next().charAt(0);
        if(chToCheck =='a' || chToCheck =='e' || chToCheck =='i' || chToCheck =='o' || chToCheck =='u'|| chToCheck =='A' || chToCheck =='E' || chToCheck =='I' || chToCheck =='O' || chToCheck =='U')
            System.out.println("The entered character is a vowel");
        else
            System.out.println("The entered character is  a Consonant");
    }
}

