import java.util.Stack;

// 50minute

class Solution
{
    public int solution(String s)
    {
        char[] chars=s.toCharArray();
        
        Stack<Character> stack=new Stack<>();
        
        for(int i=0;i<chars.length;i++){
            if(stack.isEmpty()){
                stack.push(chars[i]);
                continue;
            }
            
            if(stack.peek()==chars[i]) {
				stack.pop();
			}else {
				stack.push(chars[i]);
			}
        }
        
        if(stack.isEmpty()){
            return 1;
        }else{
            return 0;
        }
    }
}