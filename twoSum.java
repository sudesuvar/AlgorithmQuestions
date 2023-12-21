import java.util.Arrays;

public class twoSum {
    public int[] twoSumm(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[0];
    }
    public static void main(String[] args) {
        twoSum sum = new twoSum();
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] explanation = sum.twoSumm(nums, target);
         System.out.println(Arrays.toString(explanation));
    }
}