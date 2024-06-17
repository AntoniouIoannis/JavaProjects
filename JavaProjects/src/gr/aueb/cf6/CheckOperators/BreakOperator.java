package gr.aueb.cf6.CheckOperators;

public class BreakOperator {
    public static void main(String[] args) {
        System.out.println("Χρήση της εντολής  break");
        System.out.println("Χρήση της εντολής  break στην for");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " ");
            if (i == 5) break;
        }
        System.out.println("\nfor loop stopped at 5!");

        System.out.println("***************************************");
        System.out.println("\nΑέναο for");
        int count = 0;

        for (;;) {
            System.out.println("forever!!!!!");
            count++;
            if (count % 20 == 0) System.out.println();
            if (count == 100) break;
        }

        System.out.println("***************************************");
    }
}
