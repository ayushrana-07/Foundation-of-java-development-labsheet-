public class Program28 {
    static class WordCounter {
        static String language = "English";

        int countWords(String sentence) {
            String trimmed = sentence.trim();
            if (trimmed.isEmpty()) {
                return 0;
            }
            String[] parts = trimmed.split("\\s+");
            int count = parts.length;
            return count;
        }
    }

    public static void main(String[] args) {
        WordCounter wc = new WordCounter();
        String s1 = "Java is a powerful programming language";
        String s2 = "  Learning   Java   is   fun  ";
        System.out.println("Language: " + WordCounter.language);
        System.out.println("\"" + s1 + "\" has " + wc.countWords(s1) + " words");
        System.out.println("\"" + s2.trim() + "\" has " + wc.countWords(s2) + " words");
    }
}
