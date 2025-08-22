import java.util.Scanner;
public class Fibonacci {
    //A program to compute the n-th Fibonacci number
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the no of terms: ");
            int n = sc.nextInt();
            int i = 0;
            int j = 1;
            int count = 2;
            while(count <= n){
                int temp = j;
                j = j + i;
                i = temp;
                count++;
            }
            System.out.println("Output: " +j);
            sc.close();
        }
}

