import java.util.*;

public class task10 {
    public static void main(String[] args) {
        String[][] pairs = {
            {"john", "tom"},
            {"john", "mary"},
            {"john", "tom"},
            {"mary", "anna"},
            {"mary", "anna"}
        };

        HashSet<String> set = new HashSet<>();

        for (String[] p : pairs) {
            set.add(p[0] + "#" + p[1]);
            System.out.println(set.size());
        }
    }
}