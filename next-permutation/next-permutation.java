class Solution {
    public void nextPermutation(int[] arr) {
        int n = arr.length;
        int index1 =-1;
        int index2=-1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                index1=i;
                break;
            }
        }
        if(index1==-1){
            int l=0;
            int r=n-1;
            while(l<=r){
                int val =arr[l];
                arr[l]=arr[r];
                arr[r]=val;
                l++;
                r--;
            }
        }
        else{
            for(int i=n-1;i>=0;i--){
                if(arr[i]>arr[index1]){
                    index2=i;
                    break;
                }
            }
                int temp=arr[index1];
                arr[index1]=arr[index2];
                arr[index2]=temp;
            
            int l=index1+1;
            int r=n-1;
            while(l<=r){
                int val=arr[l];
                arr[l]=arr[r];
                arr[r]=val;
                l++;
                r--;
            }
        }
    }
}