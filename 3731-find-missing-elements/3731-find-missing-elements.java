class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0; i<n; i++){
            max=Math.max(nums[i], max);
            min=Math.min(nums[i], min);
            set.add(nums[i]);
        }
        for(int i=min+1; i<max; i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;

    }
}