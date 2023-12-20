class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int arrLen=words.length;
        
        for(int i=1;i<arrLen;i++){
            if(!(words[i-1].charAt(words[i-1].length()-1)==(words[i].charAt(0)))){
                
                answer[0]=i%n+1;
                answer[1]=i/n+1;
                
                return answer;
            }
            
            for(int j=0;j<i;j++){
                if(words[j].equals(words[i])){
                    answer[0]=i%n+1;
                    answer[1]=i/n+1;
                
                    return answer;
                }
            }
        }
        return answer;
    }
}