import java.util.List;

public class AggregateProcessor {

    @DataProcessor
    public List<String> addPrefix(List<String> data) {
        return data.stream().map(word -> "Обработано: " + word).toList();
    }
}
