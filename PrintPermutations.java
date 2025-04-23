package Backtracking;

import java.util.List;

public class PrintPermutations {
    public static void printp(String str, String t, List<String> l) {
        if (str.length() == 0) {
            System.out.println(t);
            l.add(t);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String left = str.substring(0, i);
            String right = str.substring(i + 1);
            String rest = left + right;
            printp(rest, t + ch, l);

        }
    }

    public static void main(String[] args) {
        String str = "abc";
        List<String> l = new java.util.ArrayList<>();
        printp(str, "", l);
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
    }
}
