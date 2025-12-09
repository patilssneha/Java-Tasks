public class SumOfArray {
    public static void main(String[] args){
        int[] a = {6, 4, 7, 4};
        int sum = 0;

        for(int b : a){
            sum= sum + b;
        }
        System.out.println("sum = " +sum);
    }
}
