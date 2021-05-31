package strings;

public class JewelsAndStonesApp {

    public static void main(String[] args) {
        JewelsAndStonesProblem j = new JewelsAndStonesProblem();
        System.out.println(j.numJewelsInStones("aA", "aAAbbbb"));
        System.out.println(j.numJewelsInStones("z", "ZZ"));
    }
}
