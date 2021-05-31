package strings;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStonesProblem {
    /**
     * Approach: Turn Jewels into a Set. Iterate through the string and see if the current stone
     * is present in jewel set. Lookup is constant.
     */
    public Integer numJewelsInStones(String jewels, String stones) {
        Set<String> jewelSet = createJewelSet(jewels);
        int numberOfJewels = 0;

        for (String stone: stones.split("")) {
            if (jewelSet.contains(stone)) {
                numberOfJewels++;
            }
        }
        return numberOfJewels;
    }

    private Set<String> createJewelSet(String jewels) {
        Set<String> jewelSet = new HashSet<>();
        for (String jewel: jewels.split("")) {
            jewelSet.add(jewel);
        }
        return jewelSet;
    }
}
