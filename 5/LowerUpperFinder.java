import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LowerUpperFinder {
    public static void main(String[] args) {
        try {
            String text = "abC helloWorLd teSt JavaCode xY z";

           
            Pattern pattern = Pattern.compile("([a-z][A-Z])");
            Matcher matcher = pattern.matcher(text);

            StringBuffer result = new StringBuffer();

            while (matcher.find()) {
                matcher.appendReplacement(result, "!" + matcher.group() + "!");
            }
            matcher.appendTail(result);

            System.out.println("Результат:");
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Ошибка при обработке текста: " + e.getMessage());
        }
    }
}
