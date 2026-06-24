class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int l= 0,r= n-1;
        int area, max_area = 0;
        while(l<r){
            area= Math.min(heights[l],heights[r]) * (r-l);
            if(area>=max_area){
                max_area = area;
            }
            if(heights[l]<heights[r]) l++;
            else r--;
        }
        return max_area;
    }
}
