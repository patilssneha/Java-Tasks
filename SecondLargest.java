public class SecondLargest {
    public static void main(String[] args) {

        int[] arr = {5, 12, 7, 3, 9};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest) {
                secondLargest = num;
            }
        }
        System.out.println("Second Largest = " + secondLargest);
    }
}



