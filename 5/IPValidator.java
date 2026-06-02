import java.util.regex.Pattern;

public class IPValidator {
    public static void main(String[] args) {
        try {
            String ip = "196.168.1.1";

            String regex =
                    "^((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)\\.){3}" +
                    "(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)$";

            if (Pattern.matches(regex, ip)) {
                System.out.println("IP-адрес корректный.");
            } else {
                System.out.println("IP-адрес некорректный.");
            }
        } catch (Exception e) {
            System.out.println("Ошибка при проверке IP-адреса: " + e.getMessage());
        }
    }
}
