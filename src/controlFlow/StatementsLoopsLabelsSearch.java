package controlFlow;

public class StatementsLoopsLabelsSearch {
    public static void main(String[] args) {
        String phrase = "tres tristes tigres tragan trigo en un trigal";
        String word = "trigo";

        int maxPhrase = phrase.length();
        int maxWord = word.length();

        int amount = 0;
        char letter = 'g';

        search:
        for(int i=0; i<maxPhrase; i++) {
            int k = i;
            for (int j = 0; j < maxWord; j++) {
                if (phrase.charAt(k++) != word.charAt(j)) {
                    continue search;
                }
            }
            amount++;
        }
        System.out.println("Found the character 't' "+amount+" times in the phrase");
    }
}
