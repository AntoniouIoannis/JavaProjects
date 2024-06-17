package gr.aueb.cf6.insertCharsFromUsers;

import java.io.IOException;


public class InsertChars {
    public static void main(String[] args) throws IOException {
        int inputChar = ' ';    // Το κενό επιστρέφει την ordinal τιμή του char

        System.out.println("\n1. Παρακαλώ εισάγετε έναν ASCII χαρακτήρα:  ");
        inputChar = System.in.read();
        System.out.print("char: " + (char) inputChar);


    }
}
