class Solution {
    static final long mod=1000000007;
    public int countGoodNumbers(long n) {

        long even=(n+1)/2;
        long odd=n/2;

        long ans = pow(5,even)*pow(4,odd)%mod;

        return (int) ans;

    }
    static long pow(int x,long n){
        if(n==0) 
            return 1;

        long half = pow(x,n/2);

        if(n%2 == 0)
            return half*half%mod;
        
        return half*half%mod*x%mod;
    }
}