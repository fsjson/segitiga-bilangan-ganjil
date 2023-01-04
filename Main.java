import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // variable1.0
        int i, j;
        int oddNumbers = 0;

        // Input user
        Scanner input = new Scanner(System.in);
        System.out.print("==Input odd number, Please: ");
        int prime = input.nextInt();

        // loop
        // star program
        do {
            while (prime % 2 == 0) {

                // if input user = odd numbers, then print if
                if (prime % 2 == 1) {
                    System.out.print(" \n \n ");
                    prime = input.nextInt();
                }

                // if input user = non-odd numbers, then print else-if
                else if (prime % 2 == 0) {
                    System.out.print("==Input odd number, Please: ");
                    input = new Scanner(System.in);

                    prime = input.nextInt();
                }

            }

            // star pattern: pyramid
            // Program
            System.out.println("\n [OUTPUT]------> Pyramid: \n");

            for (i = 1; i <= prime; i++) {
                for (j = i; j <= prime; j++) {
                    System.out.print("  ");
                }

                for (j = 1; j < i; j++) {
                    if ( i==prime || j==1 )
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }

                for (j = 1; j <= i; j++) {
                    if ( i==prime || j==i )
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
                System.out.println();
            }
        }  while (prime == oddNumbers) ;
    }
}
