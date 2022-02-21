import java.util.Objects;

public class Twofer {
    public String twofer(String name) {
        String variable = Objects.requireNonNullElse(name, "you");
        return String.format("One for %s, one for me.", variable);
    }
}
