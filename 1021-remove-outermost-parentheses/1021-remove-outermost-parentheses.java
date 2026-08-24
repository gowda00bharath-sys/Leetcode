class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder str=new StringBuilder();
        int dept=0;

        for(char ch : s.toCharArray()){
            if(ch=='('){
                if(dept>0){
                    str.append(ch);
                }
                dept++;
            }else{
                dept--;

                if(dept>0){
                    str.append(ch);
                }
            }
        }
        return str.toString();
    }
}