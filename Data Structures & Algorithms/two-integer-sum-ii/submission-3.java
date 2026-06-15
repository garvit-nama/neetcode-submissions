class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int tmp = 0;
        
        for(int i =0; i<numbers.length; i++){
            int mid =0, l=i, r=numbers.length -1;
            tmp = target - numbers[i];
            while(l<=r){
                mid = (l+r)/2;
                if(tmp == numbers[mid]) return new int[]{i+1,mid+1};
                else if(tmp > numbers[mid]){
                    l = mid +1;
                } else {
                    r = mid -1;
                }
            }
        }
        return new int[0];
    }
}
