class Solution {
    public int solution(int n) {
        int cnt=0;
        
        for(int i=1;i<=n;i++){
            if((n%i==0) && (i%2!=0)){
                cnt+=1;
            }
        }
        
        return cnt;
    }
}