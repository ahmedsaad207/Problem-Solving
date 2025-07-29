class Solution {
    public List<String> summaryRanges(int[] nums) {
        

        List<String> result =  new ArrayList<>();

        for (int i=0; i<nums.length; i++) {

            int start = nums[i];

            while(i<nums.length-1 && nums[i]+1 == nums[i+1]) i++;

            if (start == nums[i]) {
                result.add(nums[i]+"");
            } else {
                result.add(start + "->" + nums[i]);
            }
        }
        return result;
    }
}