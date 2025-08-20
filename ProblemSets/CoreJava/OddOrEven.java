public class OddOrEven {
    public static void main(String[] args) {
        System.out.println("Printing Odd or Even Numbers");
        for(int i=0; i<10; i++){
           if(i % 2 == 0) { // Even number
               System.out.println("This is Even Number: " + i);
           }else {
               System.out.println("This is Odd Number: " + i);
           }
        }
    }
}
