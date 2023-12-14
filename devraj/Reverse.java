package na.devraj;
import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        List<String>l=List.of("ACS","EPAM","ERR","TCS");
        l.stream()
                .map(str-> new StringBuilder(str).reverse())
                .forEach(System.out::println);
    }
}
