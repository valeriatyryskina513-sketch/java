import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordsStartingWithLetter {
    public static void main(String[] args) {
        try {
            String text = "Java is just joyful. Jack likes juice and apples.";
            char letter = 'j';

            
            String regex = "(?i)\\b" + letter + "[a-zA-Zа-яА-Я]*\\b";

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);

            System.out.println("Слова, начинающиеся с буквы '" + letter + "':");
            boolean found = false;

            while (matcher.find()) {
                System.out.println(matcher.group());
                found = true;
            }

            if (!found) {
                System.out.println("Подходящих слов не найдено.");
            }
        } catch (Exception e) {
            System.out.println("Ошибка при поиске слов: " + e.getMessage());
        }
    }
}
