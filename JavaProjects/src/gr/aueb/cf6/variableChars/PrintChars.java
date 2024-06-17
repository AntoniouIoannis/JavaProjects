package gr.aueb.cf6.variableChars;

public class PrintChars {
    public static void main(String[] args) {
        char h = 'H';
        char e = 'e';
        char l = 'l';
        char o = 'o';
        char exclMark = '!';

        System.out.println("\nΘα εκτυπώσουμε χαρακτήρα - χαρακτήρα την λέξη 'Hello'.");
        System.out.print(h);
        System.out.print(e);
        System.out.print(l);
        System.out.print(l);
        System.out.print(o);
        System.out.print(exclMark + "\n");


        System.out.println("*************************************************");
        System.out.println("\n\nΕδώ θα δούμε ποιός χαρακτήρας στον ASCII έχει μεγαλύτερο νούμερο.");
        char a = 'α';   // Ελληνικό α
        char b = 'b';   // Αγγλικό b
        boolean isGreekGreater = true;
        boolean letterGreaterNumber = true;

        // εδω εμφανίζουμε τις τιμές των μεταβλητών a & b δηλώνοντας όμως σαν int οχι char!!
        // δλδ μετατρέπουμε τους χαρακτήρες 'α' και 'b' σε int!!!
        System.out.println("Το α έχει νούμερο: " + (int) a);
        System.out.println("Το b έχει νούμερο: " + (int) b + "\nΆρα:");

        if (a > b) isGreekGreater = true;
        System.out.println("Greek letter is greater: " + isGreekGreater + ".");


        System.out.println("...........................................................");
        System.out.println("\n\nΆλλο παράδειγμα σύγκρισης χαρακτήρων μετατρέποντάς τους σε ακέραιους!");
        char ch1 = 's';
        char ch2 = '8';

        System.out.println("First char: " + ch1 + ", ordinal: " + (int) ch1);
        System.out.println("Second char: " + ch2 + ", ordinal: " + (int) ch2);

        System.out.printf("First char: %c , ordinal: %d\n", ch1, (int) ch1);
        System.out.printf("Second char: %c , ordinal: %d\n", ch2, (int) ch2);

        System.out.println("Ποιός χαρακτήρας είναι μεγαλύτερος; Ο 's' ή ο '8';");
        if (ch1 > ch2) letterGreaterNumber = true;
        System.out.println("Το γράμμα έχει μεγαλύτερο αριθμό στον πίνακα ASCII από τον αριθμό!  "
                + letterGreaterNumber  + ".");

        System.out.println("\n\n*************************************************");
        System.out.println("Surrogate pairs   --->  UTF-8 into UTF-16\n");
        System.out.println("Εκτύπωση Unicode χαρακτήρων!");

        int codePoint = 0x1F600;    // Αυτό ειναι το emoji smiley!!!!
        System.out.println("Ο χαρακτήρας smiley είναι αυτός:  \uD83D\uDE00");

        System.out.print("Smiley:  ");
        System.out.println(Character.toChars(codePoint));

        System.out.println("\nΣτο αρχείο Emojis.java του ίδιου Project, " +
                "εμφανίζω όλους τους Emoji χαρακτήρες μέσω των ");
        System.out.println("Unicode numbers κάνοντας typecast. ");

    }
}
