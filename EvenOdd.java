

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
//        int x=7;
//        if (x % 2 == 0)
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int a = input.nextInt();
        if (a % 2 == 0) {


            System.out.println(a + " is the Even number");
        } else {
            System.out.println(a + " is the odd number");
        }
    }
}

