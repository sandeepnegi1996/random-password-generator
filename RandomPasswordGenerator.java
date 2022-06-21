import java.util.Random;
import java.util.Scanner;
public class RandomPasswordGenerator {
    public static void main(String[] args) {
        System.out.println("*********************************************");
        System.out.println("*********************************************");

        System.out.println("Welcome to Random Password Generator ... ");

        System.out.println("Enter a number for password length...");

        Scanner scan=new Scanner(System.in);
        int input = scan.nextInt();


        Random r=new Random();
        String strongPassword="";

        for (int i = 0; i <  input; i++) {
            char x = (char)(r.nextInt(25) + 'a' );
            strongPassword = strongPassword + String.valueOf(x);
        }

        System.out.println("*********************************************");
        System.out.println("final Password is : "+ strongPassword);
        System.out.println("*********************************************");



    }
}