public class Solution26 {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[count] != nums[i]) {
                count++;
                nums[count] = nums[i];
            }
        }
        return count + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        Solution26 solution26 = new Solution26();
        System.out.print(solution26.removeDuplicates(nums));
    }
}