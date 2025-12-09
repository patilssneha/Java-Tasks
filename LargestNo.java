import java.util.Scanner;

public class LargestNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = input.nextInt();
        int[] b = new int[a];

        System.out.print("enter " + a + " no:");
        for (int i = 0; i < a; i++) {
            b[i] = input.nextInt();
        }
        int L = b[0];
        for (int i = 1; i < b.length; i++) {
            if (b[i] > L) {
                L = b[i];
            }
        }
        System.out.print("Largest Number: " + L);
    }
}


