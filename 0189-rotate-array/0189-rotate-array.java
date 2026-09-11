class Solution {
    public void rotate(int[] nums, int k) {
        int i=0;
        int n=nums.length;
        k=k%n;
        swap(i,n-1,nums);
        swap(i,k-1,nums);
        swap(k,n-1,nums);
        }
    static void swap(int left,int right,int[] nums){
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
}