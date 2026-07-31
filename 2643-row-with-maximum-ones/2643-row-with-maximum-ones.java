class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] arr=new int[2];
        arr[0]=0;
        arr[1]=0;
        for(int i=0; i<mat.length; i++){
            int count=0;
            for(int j=0; j<mat[i].length; j++){
                if(mat[i][j]==1){
                    count++;
                }
                
            }
            if(count>arr[1]){
                    arr[1]=count;
                    arr[0]=i;
                }
            
        }
        return arr;
    }
}