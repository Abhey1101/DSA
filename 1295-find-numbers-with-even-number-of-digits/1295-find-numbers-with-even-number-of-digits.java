class Solution {
    public int findNumbers(int[] nums) {
        int total=0;
        for(int i=0; i<nums.length; i++){
            int count=0;
            int curr=nums[i];
            while(curr>0){
                count++;
                curr/=10;
            }
            if(count%2==0){
                total++;
            }
        }
        return total;
    }
}