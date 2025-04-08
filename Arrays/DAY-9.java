class Solution {
    int getMinDiff(int[] arr, int k) {
        int n = arr.length;
        if(n==1) return 0;
        Arrays.sort(arr);
        int ans = arr[n-1] - arr[0];
        int small = arr[0] + k;
        int large = arr[n-1] - k;
        for(int i = 0;i<n-1;i++){
            int min = Math.min(small , arr[i+1]-k);
            int  max = Math.max(large , arr[i] + k);
            if(min<0) continue;
            ans = Math.min(ans , max-min);
        }
    return ans;
    }
}
