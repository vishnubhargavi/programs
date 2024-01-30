package maps;
import java.util.HashMap;
import java.util.Map;

public class TwoSumFinder {
    public static int[] findTwoSumIndices(int[] nums, int target) {
        if (nums == null || nums.length < 2)
            return new int[0];

        Map<Integer, Integer> numToIndexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numToIndexMap.containsKey(complement)) {
                return new int[]{numToIndexMap.get(complement), i};
            }
            numToIndexMap.put(nums[i], i);
        }

        return new int[0];
    }
}