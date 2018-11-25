import java.util.Arrays;

public class TheHurdleRace {
    static int hurdleRace(int k, int[] height) {
        int max_ht = k;

        int HighestHeight = findHighestHurdleHeight(height);

        return max_ht > HighestHeight ? 0 : HighestHeight-max_ht ;

    }
    static int findHighestHurdleHeight(int [] height){
        return  Arrays.stream(height).max().getAsInt();

    }
}
