package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if (!((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z'))) {
            System.out.println("wrong alphabet!");
            return;
        }

        character = Character.toLowerCase(character);
        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}
