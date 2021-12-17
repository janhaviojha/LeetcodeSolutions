class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int[] ans = new int[m+n];
        int i = 0;
        int j=0;
        int k=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                ans[k] = nums1[i];
                i++;
            }
            else{
                ans[k] = nums2[j];
                j++;
            }
            k++;
        }
        while(i<m){
            ans[k++] = nums1[i];
            i++;
        }
        while(j<n){
            ans[k++] = nums2[j];
            j++;
        }
        for(int a=0;a<ans.length;a++){
            nums1[a] = ans[a];
        }
    }
}