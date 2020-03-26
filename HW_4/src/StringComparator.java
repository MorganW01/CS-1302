import java.util.Comparator;

public class StringComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String string1 = o1.substring(0, o1.indexOf(','));
        String string2 = o2.substring(0, o2.indexOf(','));

        return string1.compareTo(string2);
    }

}
