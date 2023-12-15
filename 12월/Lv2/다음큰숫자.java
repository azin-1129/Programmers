// 23.12.14에 작성한 함수

class Solution {
   public int solution(int n) {
       int bits=Integer.bitCount(n);
       int answer=0;
       
       for(int i=n+1;i<1000000;i++){
           if(Integer.bitCount(i)==bits){
               answer=i;
               break;
          }
      }

       return answer;
  }
}
