class Solution {
    int[] rearrangeArray(int[] nums) {
        int[] positive=new int[nums.length/2];
        int[] negative=new int[nums.length/2];
        int p=0;
        int n=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                positive[p++]=nums[i];
            }else{
                negative[n++]=nums[i];
            }
        }

        int[] total=new int[nums.length];
        int t=0;
        int pos=0;
        int neg=0;
        while(t<nums.length){
            if(t%2==0){
                total[t++]=positive[pos++];
            }else{
                total[t++]=negative[neg++];
            }
        }
        return total;
    }
  }
