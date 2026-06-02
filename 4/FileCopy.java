import java.io.*;

public class FileCopy {
    public static void main(String[] args) {

        FileReader reader = null;
        FileWriter writer = null;

        try {
           
            reader = new FileReader("input.txt");
            writer = new FileWriter("output.txt");

            int symbol;

            
            while ((symbol = reader.read()) != -1) {
                writer.write(symbol);
            }

            System.out.println("Файл успешно скопирован!");

        } 
        
        catch (FileNotFoundException e) {
            System.out.println("Ошибка: файл не найден!");

        }
        
        catch (IOException e) {
            System.out.println("Ошибка ввода/вывода!");

        }
        
        finally {
            try {
                if (reader != null) reader.close();
                if (writer != null) writer.close();
            } 
            catch (IOException e) {
                System.out.println("Ошибка при закрытии файлов!");
            }
        }
    }
}
