package algorithms;

public class ReverseWords {
    //557 Reverse Words in a String II LeetCode Challenge
    public String reverseWords(String s) {
        String[] array = s.split(" ");
        String [] output = new String[array.length];
        for(int i = 0; i < array.length; i++){
            StringBuffer sb = new StringBuffer(array[i]);
            output[i] = sb.reverse().toString();
        }
        return String.join(" ", output);
    }

}
