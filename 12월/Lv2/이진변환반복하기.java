class Solution {
    public int[] solution(String s) {
        int calcCnt=0;
        int removeCnt=0;
        
        while(true){
            calcCnt+=1;
            Long removeCntTmp=s.chars().filter(c->c=='0').count();
            
            removeCnt+=removeCntTmp;
            
            s=Integer.toBinaryString(s.length()-removeCntTmp.intValue());
            
            if(s.equals("1")){
                return new int[]{calcCnt, removeCnt};
            }
        }
    }
}