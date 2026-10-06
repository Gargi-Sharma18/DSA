class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int beauty = 0;
        for(int i = 0;i < n;i++){
           
            int[] freq = new int[256];
            for(int j = i;j < n;j++){
                freq[s.charAt(j)]++;
                int max = 0;
                int min = Integer.MAX_VALUE;

                for(int k = 0;k < 256;k++){
                    int f = freq[k];
                    if(f > 0){
                       max = Math.max(f,max);
                       min = Math.min(f,min);
                    }
                }
                beauty += max - min;
            }
        }
        return beauty;
    }
}