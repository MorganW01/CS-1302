import java.util.Comparator;

class WordCountComparator implements Comparator <String> {
    @Override
    public int compare(String string1, String string2) {
        return numWords(string1) - numWords(string2);
    }

    private int numWords(String string) {
        int wordCount = 0;
        for (int i = 0; i < string.length(); i++) {
            if (i == 0)
                wordCount = 1;
            if (string.charAt(i) == ' ')
                ++wordCount;
        }
        return wordCount;
    }

    public static void main (String []args){

        //hello has 1 word less than I see (-1)
        System.out.println(new WordCountComparator().compare("hello","I see"));

        // you can do it has 2 more words than I see (2)
        System.out.println(new WordCountComparator().compare("You can do it","I see"));

    }
}
