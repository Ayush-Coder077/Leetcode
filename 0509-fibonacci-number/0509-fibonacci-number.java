class Solution {
    public int fib(int n) {
        if(n==0){
            return 0;
        }else if (n == 1){
            return 1;
        }
        int Ft= 0;
        int St=1;

        for(int i=1 ; i<=n ; i++){
            int tt = Ft + St ;
            Ft = St ;
            St = tt;
        }
        return Ft;
    }
}