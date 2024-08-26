class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int res[] = new int[2];
        for(int i =0; i < nums.length; i++){
            int first = nums[i];
            int second = target - first;
            if(!map.containsKey(second)){
                map.put(first, i);
            }
            else{
                res[0] = i;
                res[1] = map.get(second);
            }
        }
        return res;
    }
}
