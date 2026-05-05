import java.util.HashSet;
import java.util.Set;

public class FirstProgram {
    public static void main(String[] args) {
        Set<Integer> sets = new HashSet<>();
        sets.add(1);
        sets.add(2);
        sets.add(2);
        sets.add(3);
        sets.add(4);
        sets.add(4);
        sets.add(5);
        sets.add(6);
        sets.add(7);
        System.out.println(sets.size());
        sets.remove(5);
        sets.remove(6);
        System.out.println(sets.size());
        System.out.println(sets.contains(4) + " " + sets.contains(5));
        // basic iteraltion on the sets
        System.out.println(sets);
    }
}
