class Solution {
    public int maxDepth(String s) {
        int maxx=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
                if(ch=='('){
                    count++;
                    maxx=Math.max(count,maxx);
                }else if(ch==')'){
                    count--;
            }
        }
        return maxx;
    }
}