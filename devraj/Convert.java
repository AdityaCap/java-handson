package na.devraj;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Convert {
    public static void main(String[] args) {
        List<Integer> l=List.of(3,30,2,323,23,123,6,34);
        Map<Integer,Integer> m= l.stream()
                .collect(Collectors.toMap(x->x,x->x));
        System.out.println(m);

    }
}
