class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int tmp = 0;
        int sign = 1;
        for(int i = 0; i < my_string.length(); i++){
            
            if(my_string.charAt(i) == '-'){
                sign = -1;
                i += 2;
            }
            
            while(
                i < my_string.length() && 
                my_string.charAt(i) >= '0' && 
                my_string.charAt(i) <= '9' 
                    ){
                tmp *= 10;
                tmp += my_string.charAt(i) - '0';
                if(i < my_string.length()){
                    i++;
                }
            }
            
            answer += tmp * sign;
            tmp = 0;
            sign = 1;
        }
        
        return answer;
    }
}