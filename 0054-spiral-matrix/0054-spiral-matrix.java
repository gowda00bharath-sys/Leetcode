class Solution {
    public List<Integer> spiralOrder(int[][] arr){

    ArrayList<Integer> list=new ArrayList<>();

    int top=0;
    int bottom = arr.length-1;
    int left=0;
    int right=arr[0].length-1;

    while(top<=bottom && left<=right){

      //right->left
      for(int col=left;col<=right;col++){
        list.add(arr[top][col]);
      }
      top++;

      //top->bottom
      for(int row=top;row<=bottom;row++){
        list.add(arr[row][right]);
      }
      right--;

    

      if(top<=bottom){
        for(int col=right;col>=left;col--){
          list.add(arr[bottom][col]);
        }
        bottom--;
      }

      if(left<=right){
        for(int row=bottom;row>=top;row--){
          list.add(arr[row][left]);
        }
        left++;
      }
    }
    return list;
    }
}