class Solution {
    public int tribonacci(int n) {
        if(n==0){
            return 0;
        }else if (n == 1 || n == 2){
            return 1;
        }
        int Ft= 0;
        int St=1;
        int tt=1;

        for(int i=1 ; i<=n ; i++){
            int frt = Ft + St + tt ;
            Ft = St ;
            St = tt;
            tt = frt;
        }
        return Ft;
    }
}  
    