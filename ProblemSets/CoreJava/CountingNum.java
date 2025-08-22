public class CountingNum{
    //Counting Occurrences of Numbers by taking Remainders as a result
    public static void main(String[] args) {
        int n = 546788999;
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == 9) {
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}
