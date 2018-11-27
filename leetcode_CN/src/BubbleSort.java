import java.util.Arrays;

public class BubbleSort {
    public int[] bubbleSort(int[] nums) {
        int[] temp = Arrays.copyOf(nums,nums.length);
        if (nums.length == 1)
            return nums;
        for(int i =0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                int tmp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = tmp;
            }
        }
        if(Arrays.equals(temp,nums))
            return nums;
        else
            nums = bubbleSort(nums);
        return nums;
    }
    public static void main(String[] args){
        int[] nums={2,5,8,3,1,9,7};
        BubbleSort bubbleSort = new BubbleSort();
        for(int a:bubbleSort.bubbleSort(nums))
            System.out.print(a);
    }
}
