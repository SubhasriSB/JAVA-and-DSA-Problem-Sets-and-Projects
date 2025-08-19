import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        System.out.println("Temperature Conversion Program!");
        System.out.println("CelsiusCelsius to Fahrenheit conversion");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Temp in Celsius (C): ");
        float tempC = sc.nextFloat();
        //use either 9/5 or 1.8
        float tempF = (tempC * 9/5) + 32;

        //Output in Fahrenheit
        System.out.println(tempF);
    }
}