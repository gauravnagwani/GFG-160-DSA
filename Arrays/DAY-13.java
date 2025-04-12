class Solution {
    // Function to find the smallest positive number missing from the array.
    public int missingNumber(int[] arr) {
        HashSet<Integer>set = new HashSet<>();
        //adding positives
        for(int num : arr){
            if(num>0){
                set.add(num);
            }
        }
        // start from one and keep checking the missing number
        int i =1;
        while(true){
            if(!set.contains(i)){
                return i;
            }
        i++;
        }
    }
}