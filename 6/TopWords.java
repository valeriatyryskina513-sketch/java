import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TopWords {
    public static void main(String[] args) {
        String filePath = "text.txt";
        File file = new File(filePath);
        Scanner scanner;
        Map<String, Integer> wordCount = new HashMap<>();


        try {
            scanner = new Scanner(file, "UTF-8");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            return;
        }


        while (scanner.hasNext()) {
            String word = scanner.next()
                    .toLowerCase()
                    .replaceAll("[^a-zа-я0-9]", "");

            if (word.isEmpty()) {
                continue;
            }

            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word)+1);
            } else{
                wordCount.put(word, 1);
            }
        }

        scanner.close();

    List<Map.Entry<String, Integer>> list = new ArrayList<>(wordCount.entrySet());

    Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
        @Override
        public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
            return b.getValue() - a.getValue();
        }
    });

        System.out.println("Топ-10 слов:");
        for (int i = 0; i < Math.min(10, list.size()); i++) {
            System.out.println(list.get(i).getKey() + " - " + list.get(i).getValue());
        }
    }
}
