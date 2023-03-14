public class SumOfOddNumbers {

    public static void main(String[] args) {
        int[] number = {1, 6, 5, 2, 3};
        int num = findOddNumbers(number);
        System.out.println(num);
        int[] n = {1, -3, -5, 10, 2};
        int numbers = findOddNumbers(n);
        System.out.println(numbers);
        int[] arr = {2, 4, 6, 8, 10};
        int array = findOddNumbers(arr);
        System.out.println(array);
        int[] a = {1,1,1,2,5};
        int b = findOddNumbers(a);
        System.out.println(b);
        int [] c = {2, 3, 5, 9, 7};
        int d = findOddNumbers(c);
        System.out.println(d);
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
