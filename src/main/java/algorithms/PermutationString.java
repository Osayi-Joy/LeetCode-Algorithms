package algorithms;

public class PermutationString {
        //567. Permutation in String
        public boolean checkInclusion(String s1, String s2) {
            if (s1.length() > s2.length()) {
                return false;
            }
            int[] s1count = new int[26];
            int[] s2count = new int[26];
            for (int i = 0; i < s1.length(); i++) {
                s1count[s1.charAt(i) - 'a']++;
                s2count[s2.charAt(i) - 'a']++;
            }
            for (int i = 0; i < s2.length() - s1.length(); i++) {
                if (matches(s1count, s2count)) {
                    return true;
                }
                s2count[s2.charAt(i) - 'a']--;
                s2count[s2.charAt(i + s1.length()) - 'a']++;
            }
            return matches(s1count, s2count);
        }
        public boolean matches(int[] s1count, int[] s2count) {
            for (int i = 0; i < 26; i++) {
                if (s1count[i] != s2count[i]) {
                    return false;
                }
            }
            return true;
        }
}
