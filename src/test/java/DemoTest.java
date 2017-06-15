import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Silence 000996
 * @data 17/6/15
 */
public class DemoTest {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>();
        strings.add("B");
        strings.add("A");
        Collections.sort(strings);
        System.out.println(strings);
    }
}
