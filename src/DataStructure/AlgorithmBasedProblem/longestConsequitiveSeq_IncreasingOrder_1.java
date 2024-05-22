package DataStructure.AlgorithmBasedProblem;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class longestConsequitiveSeq_IncreasingOrder_1 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 4, 6, 1};
        int[] longestSequence = longestConsecutiveSubsequence(arr);
        System.out.print("Longest consecutive subsequence: ");
        for (int num : longestSequence) {
            System.out.print(num + " ");
        }
    }

    public static int[] longestConsecutiveSubsequence(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int maxLength = 0;
        int startOfSequence = Integer.MAX_VALUE;

        // Find the start of the longest consecutive sequence
        for (int num : arr) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 0;
                while (set.contains(currentNum)) {
                    currentNum++;
                    currentLength++;
                }
                if (currentLength > maxLength || (currentLength == maxLength && num < startOfSequence)) {
                    maxLength = currentLength;
                    startOfSequence = num;
                }
            }
        }

        // Construct and return the longest consecutive subsequence
        int[] longestSubsequence = new int[maxLength];
        for (int i = 0; i < maxLength; i++) {
            longestSubsequence[i] = startOfSequence++;
        }
        System.out.println(Arrays.toString(longestSubsequence));
        return longestSubsequence;
    }
}
