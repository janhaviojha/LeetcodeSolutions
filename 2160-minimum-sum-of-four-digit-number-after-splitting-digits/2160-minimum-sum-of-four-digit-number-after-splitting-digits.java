class Solution {
    public int minimumSum(int num) {
        int v = num;
        int[] digits = new int[4];
        int k=0;
        while(v>0){
            int digit = v%10;
            digits[k++] = digit;
            v = v/10;
        }
       Arrays.sort(digits);
        
        int num1 = digits[0]*10 + digits[2];
        int num2 = digits[1]*10 + digits[3];
       
        
        return num1+num2;
    }
}