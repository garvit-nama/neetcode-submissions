class Solution {
    public boolean hasDuplicate(int[] nums) {
       HashSet<Integer> Dupli = new HashSet<>();
       for(int i =0; i<nums.length; i++){
            if(Dupli.contains(nums[i])){
                return true;
            }
            Dupli.add(nums[i]);
       }
       return false;
    }
}