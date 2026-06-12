class Solution {
    public double findMaxAverage(int[] arr, int k) {
        int n = arr.length;
        int sum = 0;
        
        for(int i = 0;i < k;i++){
            sum += arr[i];
        }
        
        int maxSum = sum;

        for(int i = k;i < n;i++){
            sum += arr[i] - arr[i - k];
            maxSum = Math.max(sum , maxSum);
        }
        return (double)maxSum/k;
    }
}
        // int n = arr.length;
        // if(n == 1) return arr[0];
        // int i = 0;
        // double maxAvg = Double.NEGATIVE_INFINITY;
        // while(i <= n-k){
        //     int j = i;
        //     int sum = 0;
        //     while(j < k+i){
        //         sum += arr[j];
        //         j++;
        //     }
        //     double avg = (double)sum/k;
        //     maxAvg = Math.max(avg,maxAvg);
        //     i++;
        // }
        // return maxAvg;
//     }
// }