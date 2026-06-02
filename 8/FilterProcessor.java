import java.util.List;
import java.util.stream.Collectors;

public class FilterProcessor {

    @DataProcessor
    public List<String> filterShortWords(List<String> data) {
        return data.stream().filter(word -> word.length() > 4).collect(Collectors.toList());
    }
}
