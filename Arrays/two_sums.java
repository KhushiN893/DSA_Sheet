//walmart
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int temp[]=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i;j<nums.length;j++)
            {
                if(nums[i]+nums[j]== target && i!=j)
                {
                 temp[0]=i;
                 temp[1]=j;
                }
            }
        }
        return temp;
    }
}
//loop inside loop
//1)check two elemet sum matches to target or not
//2)if matched store those indices
