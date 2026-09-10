class Solution {
    public int maxScore(int[] nums, int k){
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int maxsum=sum;
        int right=nums.length-1;
        for(int i=k-1;i>=0;i--){
            sum-=nums[i];
            sum+=nums[right];
            right--;
            maxsum=Math.max(maxsum,sum);
        }
        return maxsum;
    }
}