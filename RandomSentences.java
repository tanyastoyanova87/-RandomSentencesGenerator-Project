import java.util.Random;

public class RandomSentences {
    public static void main(String[] args) {

        String[] names = {"Maria", "Ivan", "Georgi", "Alexander", "Silvia", "Teodor", "Mihaela", "Peter", "Radoslav", "Katrin"};
        String[] places = {"Sandanski", "Varna", "Burgas", "Sofia", "Bansko", "Plovdiv", "Blagoevgrad", "Vraca", "Botevgrad", "Pernik"};
        String[] verbs = {"walks", "plays with", "eats", "meets", "is running", "reads", "helps", "hears", "receives", "protects", "carries"};
        String[] nouns = {"sandwich", "the dog", "his sister", "friends", "a book", "noise", "gifts", "her family", "groceries", "a magazine"};
        String[] adverbs = {"quietly", "peacefully", "carefully", "slowly", "easily", "quickly", "usually", "rarely", "gently", "happily"};
        String[] details = {"at home", "in the park", "in the forest", "at the mall", "near the river", "in the city"};

        while (true) {
            String randomName = getRandomWord(names);
            String randomPlace = getRandomWord(places);
            String randomVerb = getRandomWord(verbs);
            String randomNoun = getRandomWord(nouns);
            String randomAdverb = getRandomWord(adverbs);
            String randomDetail = getRandomWord(details);

            System.out.printf("%s from %s %s %s %s %s.%n", randomName, randomPlace, randomVerb, randomNoun, randomAdverb, randomDetail);
            System.out.println("Click [Enter] to generate a new one.");
        }
    }

    public static String getRandomWord (String[] words) {
        Random random = new Random();
        int randomIndex = random.nextInt(words.length);
        String word = words[randomIndex];

        return word;
    }
}
