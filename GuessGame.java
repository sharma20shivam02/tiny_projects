import java.util.Scanner;
import java.util.Random;

// import java.io.*;
public class GuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int n = r.nextInt(10) + 1;
        System.out.println("WELCOME to the Game!\n");
        char str = 'y';
        int itr = 0;
        do {
            System.out.println("Enter your guess b/w 1-10\n");
            int a = sc.nextInt();

            if (a > n) {

                System.out.println("You have a greater number!!" + a);
            } else if (a == n) {

                System.out.println("You have a the correct number number!!" + a);
                break;
            } else {

                System.out.println("You have a smaller number!!" + a);
            }

            System.out.println("You are left with two more chance!!");
            itr++;
            System.out.println("Hit y to resume or n to exit!!");
            str = sc.next().charAt(0);
        } while (str == 'y' || itr >= 3);
        if (sc != null)
            sc.close();
    }
}
