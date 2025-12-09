import java.util.Scanner;

public class CheckCharacter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char b = input.next().charAt(1);

        b = Character.toLowerCase(b);

        if (b == 'a' || b == 'e' || b == 'i' || b == 'o' || b == 'u') {
            System.out.println(b + " is a vowel.");
        } else {
            System.out.println(b + " is a consonant.");
        }
    }
}
