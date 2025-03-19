class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m= nums1.length;
        int n= nums2.length;
        int N=m+n;
        int[] arr= new int[N];
        int i=0, j=0, k=0;

        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                arr[k++]= nums1[i++];
            }
            else{
                arr[k++]= nums2[j++];
            }
        }
        while(i<m){
            arr[k++]= nums1[i++];
        }
        while(j<n){
            arr[k++]= nums2[j++];
        }

        double median=0.0;
        if((N)%2==0){
            median=(double)(arr[(N/2)-1]+arr[(N/2)])/2;
        }
        else{
            median=arr[(N+1)/2-1];
        }
        return median;
    }
}