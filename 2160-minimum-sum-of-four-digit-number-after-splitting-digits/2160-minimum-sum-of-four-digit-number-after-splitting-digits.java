class Solution {
    public int minimumSum(int num) {
        int v = num;
        ArrayList<Integer> digits = new ArrayList<>();
        int k=0;
        while(v>0){
            int digit = v%10;
            digits.add(digit);
            v = v/10;
        }
       Collections.sort(digits);
        int num1 =0;
        int num2 =0;
        if(digits.get(0)==0){
            num1 = digits.get(2);
        }
        else{
            num1 = digits.get(0)*10 + digits.get(2);
        }
        if(digits.get(1)==0){
            num2 = digits.get(3);;
        }
        else{
             num2 = digits.get(1)*10 + digits.get(3);
        }
        
        return num1+num2;
    }
}