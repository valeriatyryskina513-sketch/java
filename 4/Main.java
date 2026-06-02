public class Main {
    public static void main(String[] args) {

        CustomStack stack = new CustomStack();

        try {
            stack.push(10);
            stack.push(20);

            System.out.println("Удалено: " + stack.pop());
            System.out.println("Удалено: " + stack.pop());

            // Вызовет исключение
            System.out.println("Удалено: " + stack.pop());

        }  catch (CustomEmptyStackException e) {
            System.out.println("Ошибка: " + e.getMessage());
            CustomStack.logException(e.getClass().getSimpleName() + e.getMessage());
        
        } 
    }

}


