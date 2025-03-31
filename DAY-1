
class Solution {
    public int getSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLarg =  Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>largest){
            secondLarg = largest;
            largest = arr[i];
            }
            else if(arr[i]!= largest && arr[i]>secondLarg){
                secondLarg = arr[i];
            }
        }
    return (secondLarg == Integer.MIN_VALUE) ? -1 : secondLarg;
    }
}
