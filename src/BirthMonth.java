import java.util.Scanner;

public class BirthMonth {
    public static void main(String[] args) {
        int month = 0;
        String trash = "";
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your birth month (1-12): ");
        if (in.hasNextInt()) {
            month = in.nextInt();
            in.nextLine(); // clear buffer

            if (month >= 1 && month <= 12) {
                System.out.println("Your birth month is: " + month);
            } else {
                System.out.println("You entered an incorrect month value: " + month);
            }
        } else {
            trash = in.nextLine();
            System.out.println("Invalid input: " + trash);
        }
    }
}

