//Goldman sachs

class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
                return nums[i];
        }
        return -1;
    }
}

//1) sort the array
//2) use loop and check two adjacent elements are same or not if same return it else iterate.
