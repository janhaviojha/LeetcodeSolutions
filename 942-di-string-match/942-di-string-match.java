class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int[] arr = new int[n+1];
       
        int start =0;
        int end = n;
        int k=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='I'){
                arr[k++] = start;
                start++;
            }
            else if(s.charAt(i)=='D'){
                arr[k++] = end;
                end--;
            }
        }
        arr[k++] = start;
        return arr;
    }
}