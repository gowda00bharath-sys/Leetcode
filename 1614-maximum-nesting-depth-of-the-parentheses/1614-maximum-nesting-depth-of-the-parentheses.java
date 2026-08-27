class Solution {
    public int maxDepth(String s) {
        int count =0;
        int maxcount=0;
        int i=0;
        while(i<s.length()){
            char ch=s.charAt(i);
            if(ch =='('){
            count++;
        }else if(ch == ')'){
            maxcount=Math.max(maxcount,count);
            count--;
        }
        i++;
    }
    return maxcount;
    }
}