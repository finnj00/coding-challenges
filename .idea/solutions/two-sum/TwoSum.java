public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];

        for(int i = 0; i < nums.length; i++) {
            // we want to check every number to see if there is a matching one to sum to target
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        // we are guranteed that the sum is in the array this is just for the compiler
        return result;
    }

}
