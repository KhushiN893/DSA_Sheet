class Solution {
    public int removeDuplicates(int[] nums) {
    int k=1;
    for (int i=1;i<nums.length;i++)
        if (nums[i] > nums[i-1])
            nums[k++] = nums[i];
    return k;
}
}
//as array is already sorted in asec order
//1)check element next to current element is large or not if large go to 2)
//2)increment pointer and push current element
//3)return pointer
