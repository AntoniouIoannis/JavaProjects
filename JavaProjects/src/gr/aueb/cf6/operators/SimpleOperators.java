package gr.aueb.cf6.operators;

public class SimpleOperators {
    public static void main(String[] args) {
        System.out.println("\n\nHello World from Giannis Antoniou.");
        System.out.println("Βρίσκεσαι στο χώρο της Java του GitHub λογαριασμού μου!!\n");

        int a = 5, s = 5;
        int sum = a + s + 12;
        int mul = sum * 7;
        int div = sum / 4;
        int div2 = mul / 4;
        int mod = sum % 4;

        System.out.println("Οι αριθμοί είναι: a = 5,  s = 5.");
        System.out.println("Το αποτέλεσμα sum = a + s + 12 είναι: " + sum);
        System.out.println("Το αποτέλεσμα mul = sum * 7 είναι: " + mul);
        System.out.println("Το αποτέλεσμα div = sum / 4 είναι: " + div);
        System.out.println("Το αποτέλεσμα div2 = mul / 4 είναι: " + div2);
        System.out.println("Το αποτέλεσμα mod = sum % 4 είναι: " + mod);


    }
}
