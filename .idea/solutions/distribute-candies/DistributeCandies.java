import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {
    public int distributeCandies(int[] candyType) {
        Set<Integer> candies = new HashSet<>();
        for(int i = 0; i < candyType.length; i++) {
            candies.add(candyType[i]);
        }
        return Math.min(candies.size(), candyType.length / 2);
    }
}
