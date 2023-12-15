// 42minute
class Solution {
    public int[] solution(int brown, int yellow) {
        int col=0;
        int row=0;
        
        for(int i=1;i<=(int)Math.sqrt(yellow);i++) {
            if(yellow%i!=0){
                continue;
            }
            
			col=i;
			row=yellow/i;
            
			if(2*(row+col)+4==brown) {
                break;
			}	
		}
        
        int[] answer=new int[]{row+2, col+2};
        
        return answer;
    }
}