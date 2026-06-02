import java.util.regex.Pattern;

public class PasswordValidator {
    public static void main(String[] args) {
        try {
            String password = "Abcdef12";

           
            String regex = "^(?=.*[A-Z])(?=.*\\d)[A-Za-z\\d]{8,16}$";

            if (Pattern.matches(regex, password)) {
                System.out.println("Пароль корректный.");
            } else {
                System.out.println("Пароль некорректный.");
            }
        } catch (Exception e) {
            System.out.println("Ошибка при проверке пароля: " + e.getMessage());
        }
    }
}
