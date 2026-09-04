class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxx=0;
        for(int i=0;i<s.length();i++){
            boolean[] seen=new boolean[128];
            int count=0;
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);

                if(seen[ch]){
                    break;
                }
                seen[ch]=true;

                count++;
                maxx=Math.max(maxx,count);
            }
    }
    return maxx;
    }
}