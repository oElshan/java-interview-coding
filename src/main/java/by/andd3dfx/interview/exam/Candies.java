package by.andd3dfx.interview.exam;

/**
 * <pre>
 * You are given startingAmount of candies.
 * Whenever you eat a certain number of candies (newEvery), you get an additional candy.
 * What is the maximum number of candies you can eat?
 *
 * For example, if startingAmount equals 3 and newEvery equals 2, you can eat 5 candies in total:
 * - Eat 2, Get 1, Remaining 2
 * - Eat 2, Get 1, Remaining 1
 * - Eat 1
 * </pre>
 */
public class Candies {

    public static int countCandies(int startingAmount, int newEvery) {
        if (startingAmount < 0 || newEvery <= 0) {
            return 0;
        }

        int candiesAmount = startingAmount;
        int eaten = 0;

        while (candiesAmount >= newEvery) {
            int bonus = candiesAmount / newEvery;
            eaten += newEvery * bonus;

            candiesAmount -= newEvery * bonus;
            candiesAmount += bonus;
        }
        return eaten + candiesAmount;
    }
}
