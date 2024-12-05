import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] plantTime = {1, 4, 3};
        int[] growTime = {2, 3, 1};
        int currentDay = 0;
        int maxBloomDay = 0;
        for (int k = 0; k < plantTime.length; k++) {
            int maxGrowTime = 0;
            int maxGrowIndex = 0;
            for (int i = 0; i < plantTime.length; i++) {
                if (growTime[i] > maxGrowTime) {
                    maxGrowTime = growTime[i];
                    maxGrowIndex = i;
                }
            }
            currentDay += plantTime[maxGrowIndex];
            int bloomDay = currentDay + growTime[maxGrowIndex];
            if (bloomDay > maxBloomDay) {
                maxBloomDay = bloomDay;
            }
            growTime[maxGrowIndex] = -1;
        }
        System.out.println(maxBloomDay);
    }
}

