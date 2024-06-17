package gr.aueb.cf6.CheckOperators;

import java.util.Scanner;
public class CheckFor {
    public static void main(String[] args) {
//        for (int i = 1; i <= 10; i++){
//            System.out.print(i + " - ");
//        }

//  Εδώ το αποτέλεσμα θα είναι έτσι: 1 - 2 - 3 - 4 - 5 - 6 - 7 - 8 - 9 - 10 -
//  Αν ΔΕΝ επιθυμούμε να εμφανίζετε η παύλα δεξιά του 10, τότε θα γίνει έτσι:
        System.out.println("\n\nΕπανάληψη της for");
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " - ");

        if (i+1 == 10) {
            System.out.println(i+1 + ".");
        }
        }


        System.out.println("\n*******************************************");
        System.out.println("Επανάληψη μαθηματικής πράξης με τον ίδιο αριθμό");
        System.out.println("Πρόσθεση = 0,  Πολλαπλασιασμός = 1.");

        int sum = 0, mul = 1;
        for (int j = 1; j <= 10; j++) {
            sum += j;
            mul *= j;
        //}
            System.out.println("Για j=" + j +  " Η Πρόσθεση είναι: " + sum);
            System.out.println("Για j=" + j +  " Ο Πολλαπλασιασμός είναι: " + mul + "\n");
        }


        System.out.println("*******************************************");
        System.out.println("Δύναμη του a εις την b");

        Scanner in = new Scanner(System.in);
        int a = 0, b = 0, result = 1;

        System.out.print("\nΠαρακαλώ δώσε δυο ακέραιους αριθμούς χωρισμένα με κενό:   ");
        a = in.nextInt();
        b = in.nextInt();

        for (int k = 1; k <= b; k++){
            result = result * a;
        }

        System.out.printf("%d^%d = %d", a, b, result);

    }
}