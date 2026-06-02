import java.util.List;
import java.util.stream.Collectors;

public class TransformProcessor {

    @DataProcessor
    public List<String> transformToUpper(List<String> data) {
        return data.stream().map(word -> word.toUpperCase()).collect(Collectors.toList());
    }
}
