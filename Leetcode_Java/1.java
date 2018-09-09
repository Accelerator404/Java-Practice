class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer,Integer> toFind = new HashMap<>();
        for(int i = 0; i < nums.length;i++){
            int numToFind = target - nums[i];
            if(toFind.get(numToFind) != null){
                result[0] = toFind.get(numToFind);
                result[1] = i;
                return result;
            }
            toFind.put(nums[i],i);
        }
        return result;
    }
}
