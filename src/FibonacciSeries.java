public class FibonacciSeries {

    public static void main(String[] args) {
        int[] number = findNFibonacci(6);
        System.out.println(number);
    }

    public static int[] findNFibonacci(int n) {
        int[] num = new int[n];
        num[0] = 0;
        num[1] = 1;
        num[2] = 1;
        for (int i = 3; i< num.length; i++) {
            num[i] = num[i-1] + num[i-2];
        }
        return num;
    }
}
