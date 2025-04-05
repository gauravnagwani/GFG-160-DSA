//Majority element-2 (n/3) & Verification
class Solution {
    public List<Integer> findMajority(int[] nums) {
        int count1 =0 , count2 = 0, maj1 = 0 , maj2 =0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==maj1){
                count1++;
            }
            else if(nums[i] == maj2){
                count2++;
            }
            else if(count1==0){
                maj1 = nums[i];
                count1=1;
            }
            else if(count2==0){
                maj2 = nums[i];
                count2=1;
            }
            else{
                count1--;
                count2--;
            }
        }
        //verification
        count1=0;
        count2=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i] == maj1){
                count1++;
            }
            else if(nums[i]== maj2){
                count2++;
            }
        }
        List<Integer>result = new ArrayList<>();
        int threshold = nums.length/3;
        if(count1>threshold) result.add(maj1);
        if(count2>threshold) result.add(maj2);
    Collections.sort(result);
    return result;
    }
}