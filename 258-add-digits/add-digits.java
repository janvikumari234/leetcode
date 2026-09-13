class Solution {
    public int addDigits(int num) {
        /*int sum=0;
        while(num>=10){
            int temp=num;
            while(temp>0){
                int digit=temp%10;
                temp=temp/10;
                sum+=digit;
            }
           
        }
        return sum;
        */
        
            if(num==0){
               return 0;
            }
             return 1+((num-1)%9);
    

    }
}