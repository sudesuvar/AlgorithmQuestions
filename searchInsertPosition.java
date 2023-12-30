/**
 * searchInsertPosition
 * Given a sorted array of distinct integers and a target value,
 * return the index if the target is found. If not, return the index where it
 * would be if it were inserted in order.
 */
public class searchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        int output=0;
        for(int i =0; i<nums.length; i++){
            if(nums[i]== target){
                return output;
            }
            else if(nums[i]<target){
                output++;
            }
            else if(nums[i]>target){
                return output--;
            }
        }

        return output;
    }

    public static void main(String[] args) {
        int[] nums = { 18, 21, 34, 42, 55, 62 };
        int output = searchInsert(nums, 22);
        System.out.println(output);


    }
}