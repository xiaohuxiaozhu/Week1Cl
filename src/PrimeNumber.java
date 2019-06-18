import java.util.Scanner;
import java.util.Random;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        while (true) {
            Random randomNumber = new Random();

            System.out.println("Would you like to choose a number?  Or use a random one? (Random/Choose)");
            String reader = s.nextLine();

            if (reader.equalsIgnoreCase("random")) {
                System.out.println("Generating  a Random number:\t");
                int testNumber = randomNumber.nextInt(250) + 1;
                System.out.println("Your random number is:\t" + testNumber);
                if (testNumber == 2) {
                    System.out.println("2  is a prime number.");
                }
                for (int i = 2, t = 0; i < testNumber; i++) {
                    //Finding each divisor
                    int remainder = (testNumber % i);
                    if (remainder == 0) {
                        System.out.println("It is divisible by:\t" + i);
                        t++;
                    }
                    //Printing Determination after all tests
                    if (i == (testNumber - 1) && t == 0) {
                        System.out.println(testNumber + "  Is a Prime number\n");
                        break;
                    } else if ((i == (testNumber - 1))) {
                        System.out.println(testNumber + "  Is not a prime number.\n");

                        break;
                    }
                }

            } else {
                System.out.print("Enter a number : ");
                int n = s.nextInt();
                int i, m = 0, flag = 0;
                m = n / 2;
                if (n == 0 || n == 1) {
                    System.out.println(n + " is not prime number");
                } else {
                    for (i = 2; i <= m; i++) {
                        if (n % i == 0) {
                            System.out.println(n + " is not prime number");
                            flag = 1;
                            break;
                        }
                    }
                    if (flag == 0) {
                        System.out.println(n + " is prime number");
                    }
                }


            }
    }
    }
}
