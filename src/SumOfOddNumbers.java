public class SumOfOddNumbers {

    public static void main(String[] args) {
        int[] number = {1, 6, 5, 2, 3};
        int num = findOddNumbers(number);
        System.out.println(num);
    }

    public static int findOddNumbers(int[] num) {
        int n = 0;
        for (int i = 0; i<num.length; i++) {
            if(num[i]%2!=0) {
                n += num[i];
            }
        }
        return n;
    }
}
