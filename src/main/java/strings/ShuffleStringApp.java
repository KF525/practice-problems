package strings;

public class ShuffleStringApp {
    public static void main(String[] args) {
        ShuffleStringProblem s = new ShuffleStringProblem();
        String string = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        System.out.println(s.restoreString(string, indices));
    }
}
