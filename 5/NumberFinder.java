import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberFinder {
    public static void main(String[] args) {
        try {
            String text = "The price is 19.99, discount 5, code 12345 and value 42.7";

            
            Pattern pattern = Pattern.compile("\\d+([.]\\d+)?");
            Matcher matcher = pattern.matcher(text);

            System.out.println("Найденные числа:");
            boolean found = false;

            while (matcher.find()) {
                System.out.println(matcher.group());
                found = true;
            }

            if (!found) {
                System.out.println("Числа в тексте не найдены.");
            }
        } catch (Exception e) {
            System.out.println("Ошибка при поиске чисел: " + e.getMessage());
        }
    }
}
