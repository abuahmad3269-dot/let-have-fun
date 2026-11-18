import java.util.Scanner;

public class Sumten {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int total = 0;
        int counter = 0;

        for (int intcounter = 1; intcounter <= 10; intcounter++) {

            System.out.print("Enter score " + intcounter + ": ");
            int number = input.nextInt();

            total = total + number;
        }

        System.out.println("Sum = " + total);

    }
}
