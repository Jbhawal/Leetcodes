//optimal solution
// Time complexity: O(m*log(n*m))

class Solution {
    public int findKthNumber(int m, int n, int k) {
        int low=1, high=m*n;
        while(low!=high){
            int mid=(low+high)/2;
            int count=0;
            for (int i=1; i<=m; i++){
                count=count+Math.min(mid/i,n);
            }
            if(count>=k){
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}