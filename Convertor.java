import java.util.Scanner;

public class Convertor {
    public static void main(String[] args) {
        int number;
        // Declaring variable to store decimal number
        int decimal = 0;
        // Declaring variable to use in power
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any binary number");
        number = sc.nextInt();
        // Writing logic for the conversion
        while (number > 0) {
            int temp = number % 10;
            decimal += temp * Math.pow(2, n);
            number = number / 10;
            n++;
        }
        System.out.println("Deccimal number :" + decimal);
        // closing Scanner class.
        sc.close();
    }
}
