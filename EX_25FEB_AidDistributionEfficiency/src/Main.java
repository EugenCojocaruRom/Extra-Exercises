import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // --- Test Case 1 ---
        int[][] needs1 = {{1, 1}, {1, 1}};
        int[][] inventory1 = {{2, 2}, {2, 2}}; // Type 0: 4 units, Type 1: 4 units
        int maxDist1 = 50;
        int[] distances = {10, 45, 80, 25};

        System.out.println("Test Case 1:");
        int[][] result1 = DistributeAid.distributeAid(needs1, inventory1, maxDist1, distances);
        System.out.println(Arrays.deepToString(result1));
        // Expected: [[1, 1], [1, 1]]

        // --- Test Case 2 (Limited Inventory) ---
        int[][] needs2 = {{5, 5}, {5, 5}};
        int[][] inventory2 = {{7}, {3}}; // Type 0: 7 units, Type 1: 3 units
        int maxDist2 = 85;
        int[] distances2 = {15, 35, 80, 55};

        System.out.println("\nTest Case 2 (Limited Stock):");
        int[][] result2 = DistributeAid.distributeAid(needs2, inventory2, maxDist2, distances2);
        System.out.println(Arrays.deepToString(result2));
        // Expected: [[5, 3], [2, 0]] (Community 1 takes all of Type 1)
    }
}