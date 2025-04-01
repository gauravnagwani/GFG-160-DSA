class Solution {
    void pushZerosToEnd(int[] arr) {
        int j=0;
        //atfirst we fill non-zero elements first in an array
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[j] = arr[i];
                j++;
            }
        }
        // fill remaining places with zeroes
        while(j<arr.length){
            arr[j]=0;
            j++;
        }
    }
}