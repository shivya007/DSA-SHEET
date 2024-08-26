class Solution {
    // Concept: prefix array  --> APPROACH -1
    // tc: O(n) + O(n) + O(n)
    // Sc: O(2n)
    public int pivotIndex(int[] nums) {
        int leftsum[] = new int[nums.length];
        int rightsum[] = new int[nums.length];
        leftsum[0] = nums[0];
        for(int i =1; i < nums.length; i++){
            leftsum[i] = nums[i] + leftsum[i-1];
        }
        rightsum[nums.length-1] = nums[nums.length-1];
        for(int i = nums.length-2; i >= 0; i--){
            rightsum[i] = nums[i] + rightsum[i+1];
        }
        int i =0;
        while(i < leftsum.length){
            if(leftsum[i] == rightsum[i]){
                return i;
            }
            i++;
        }
        return -1;
       
       
       
        // APPROACH -2
       //TC: O(n), SC: O(n)


       int sum = 0;
        int leftsum[] = new int[nums.length];
        for(int i =0; i < nums.length; i++){
            sum += nums[i];
        }
        leftsum[0] = nums[0];
        for(int i =1; i < nums.length; i++){
            leftsum[i] = nums[i] + leftsum[i-1];
        }
        int ls = 0;
        for(int i =0; i < nums.length; i++){
            ls = i == 0 ? 0: leftsum[i-1];
            int rs = sum - ls - nums[i];
            if(ls == rs){
                return i;
            }
        }
        return -1;


        // APPROACH-3 
        //TC: O(N), constant space --> O(1)
        int sum = 0;
        for(int i =0; i < nums.length; i++){
            sum += nums[i];
        }
        int ls = 0;
        for(int i = 0; i < nums.length; i++){
            int rs = sum - ls - nums[i];
            if(ls == rs){
                return i;
            }
            ls += nums[i];
        }
        return -1;
    }
}
