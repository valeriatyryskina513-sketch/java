import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CustomStack {

    // Хранилище элементов
    private final ArrayList<Integer> stack = new ArrayList<>();

    
    public void push(int value) {
        stack.add(value);
    }

    
    public int pop() throws CustomEmptyStackException {

        
        if (stack.isEmpty()) {
            throw new CustomEmptyStackException("Ошибка: стек пуст!");
        }

        return stack.remove(stack.size() - 1);
    }

    public static  void logException(String text) {
        try (FileWriter writer = new FileWriter("LogException.txt", true)) {  
            writer.write(text + System.lineSeparator());
            writer.flush();
            System.out.println("Исключение записано в LogException.txt");
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
        }
    }

     
}
