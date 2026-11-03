public class Program27 {
    static class StringReverse {
        static int totalReversals = 0;

        String reverse(String text) {
            String reversed = "";
            for (int i = text.length() - 1; i >= 0; i--) {
                reversed = reversed + text.charAt(i);
            }
            totalReversals++;
            return reversed;
        }
    }

    public static void main(String[] args) {
        StringReverse sr = new StringReverse();
        String[] words = {"Java", "Dehradun", "level", "Programming"};
        for (String w : words) {
            System.out.println(w + " -> " + sr.reverse(w));
        }
        System.out.println("Total reversals: " + StringReverse.totalReversals);
    }
}
