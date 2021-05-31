package strings;

public class ShuffleStringProblem {

    public String restoreString(String s, int[] indices) {
        char[] restoredString = new char[indices.length];
        for (int i=0; i < indices.length; i++) {
            restoredString[indices[i]] = s.charAt(i);
        }
        return String.valueOf(restoredString);
    }
}
