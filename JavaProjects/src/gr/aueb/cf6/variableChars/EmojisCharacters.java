package gr.aueb.cf6.variableChars;

public class EmojisCharacters {
    public static void main(String[] args) {
        int emojiStart = 0x1F600;
        int emojiEnd = 0x1F64F;
        int counter = 0;
        int emoji;

        System.out.println("\n\nΠΙΝΑΚΑΣ EMOJI ΧΑΡΑΚΤΗΡΩΝ.");
        emoji = emojiStart;
        while (emoji < emojiEnd) {
            System.out.print((counter + 1) + "o ");
            System.out.print(Character.toChars(emoji));
            System.out.print(" ");
            emoji++;
            counter++;
            if (counter % 10 == 0){
                System.out.println();
            }
        }
        System.out.println(" ");
    }
}
