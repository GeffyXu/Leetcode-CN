public class Solution53 {
    public int maxSubArray(int[] nums) {
        if (nums.length == 1) return nums[0];
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            int tmp = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                tmp += nums[j];
                if (j==i+1) {
                    if(nums[i]>=tmp) res = nums[i];
                    else res=tmp;
                }
                else {
                    if(res<=tmp)res=tmp;
                    else res=tmp-nums[j];
                }
            }
            res = res>tmp?res:tmp;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution53 solution53 = new Solution53();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.print(solution53.maxSubArray(nums));
    }
}
