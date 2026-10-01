class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxx=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]==0){
                    count++;
                }
                if(count>k){
                    break;
                }
                maxx=Math.max(maxx,j-i+1);
            }
        }
        return maxx;
    }
}